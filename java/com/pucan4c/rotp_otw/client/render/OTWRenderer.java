package com.pucan4c.rotp_otw.client.render;

import com.github.standobyte.jojo.client.render.entity.model.stand.StandEntityModel;
import com.github.standobyte.jojo.client.render.entity.model.stand.StandModelRegistry;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;
import com.pucan4c.rotp_otw.RotpOTWA;
import com.pucan4c.rotp_otw.entity.OTWEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class OTWRenderer extends StandEntityRenderer<OTWEntity, StandEntityModel<OTWEntity>> {
    public OTWRenderer(EntityRendererManager renderManager) {
        super(renderManager,
                StandModelRegistry.registerModel(new ResourceLocation(RotpOTWA.MOD_ID, "otw"), OTWModel::new),
                new ResourceLocation(RotpOTWA.MOD_ID, "textures/entity/stand/the_world_ova.png"), 0);
    }
}
