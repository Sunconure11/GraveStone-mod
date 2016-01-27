package nightkosh.gravestone.renderer.item;

import nightkosh.gravestone.tileentity.TileEntityGraveStone;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@SideOnly(Side.CLIENT)
public class ItemGraveStoneRenderer implements IItemRenderer {

    public ItemGraveStoneRenderer() {
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        TileEntityGraveStone te = new TileEntityGraveStone();

        if (item.hasTagCompound()) {
            te.setGraveType(item.getTagCompound().getInteger("Type"));
            if (item.getTagCompound().hasKey("Sword")) {
                te.setSword(ItemStack.loadItemStackFromNBT(item.getTagCompound().getCompoundTag("Sword")));
            }
            if (item.getTagCompound().hasKey("Enchanted")) {
                te.setEnchanted(item.getTagCompound().getBoolean("Enchanted"));
            }
        }

        TileEntityRendererDispatcher.instance.renderTileEntityAt(te, 0, 0, 0, 0.0F);
    }
}