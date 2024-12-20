package com.pucan4c.rotp_otw.client.render;

import com.github.standobyte.jojo.client.render.entity.renderer.SimpleEntityRenderer;
import com.pucan4c.rotp_otw.RotpOTWA;
import com.pucan4c.rotp_otw.entity.FuelTruckEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;

public class RoadRollerRenderer extends SimpleEntityRenderer<FuelTruckEntity, RoadRollerModel> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(RotpOTWA.MOD_ID, "textures/entity/fuel_truck.png");

    public RoadRollerRenderer(EntityRendererManager renderManager) {
        super(renderManager, new RoadRollerModel(), TEXTURE);
    }
    
    @Override
    protected void renderModel(FuelTruckEntity entity, RoadRollerModel model, float partialTick,
                               MatrixStack matrixStack, IVertexBuilder vertexBuilder, int packedLight) {
        int overlay = entity.getTicksBeforeExplosion() > 0 && entity.getTicksBeforeExplosion() / 5 % 2 == 0 ? 
                OverlayTexture.pack(OverlayTexture.u(1), OverlayTexture.v(false)) : OverlayTexture.NO_OVERLAY;
        model.renderToBuffer(matrixStack, vertexBuilder, packedLight, overlay, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
