package com.enokidake1997.scissorsbaptism.entity;

import com.enokidake1997.scissorsbaptism.ScissorsBaptism;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ScissorsRenderer extends MobRenderer<ScissorsEntity, ScissorsModel<ScissorsEntity>> {

    public ScissorsRenderer(EntityRendererProvider.Context context) {
        super(context, new ScissorsModel<>(context.bakeLayer(ScissorsModel.LAYER_LOCATION)),0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(ScissorsEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(ScissorsBaptism.MOD_ID, "textures/entity/scissors.png");
    }

}
