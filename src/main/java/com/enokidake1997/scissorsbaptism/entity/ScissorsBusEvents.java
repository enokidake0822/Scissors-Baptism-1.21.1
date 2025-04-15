package com.enokidake1997.scissorsbaptism.entity;

import com.enokidake1997.scissorsbaptism.ScissorsBaptism;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = ScissorsBaptism.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ScissorsBusEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ScissorsEntities.SCISSORS_ENTITY.get(), ScissorsRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefintion(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ScissorsModel.LAYER_LOCATION, ScissorsModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ScissorsEntities.SCISSORS_ENTITY.get(), ScissorsEntity.createAttributes().build());
    }

}
