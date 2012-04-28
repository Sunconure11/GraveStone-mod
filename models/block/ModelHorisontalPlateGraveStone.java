// Date: 10.04.2012 15:28:55
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package GraveStone.models.block;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHorisontalPlateGraveStone extends ModelGraveStone {

    ModelRenderer Plate;

    public ModelHorisontalPlateGraveStone() {
        textureWidth = 64;
        textureHeight = 32;

        Plate = new ModelRenderer(this, 0, 0);
        Plate.addBox(0F, 0F, 0F, 12, 1, 14);
        Plate.setRotationPoint(-6F, 23F, -7F);
        Plate.setTextureSize(64, 32);
        Plate.mirror = true;
        setRotation(Plate, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Plate.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    public void renderAll() {
        Plate.render(0.0625F);
    }
}