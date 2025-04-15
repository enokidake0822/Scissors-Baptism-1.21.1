package com.enokidake1997.scissorsbaptism.entity;

import com.enokidake1997.scissorsbaptism.ScissorsBaptism;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ScissorsEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ScissorsBaptism.MOD_ID);

    public static final Supplier<EntityType<ScissorsEntity>> SCISSORS_ENTITY =
            ENTITY_TYPES.register("scissors", () -> EntityType.Builder.of(ScissorsEntity::new, MobCategory.MONSTER)
                    .sized(0.6F,1.8F)
                    .eyeHeight(1.8F)
                    .build("scissors"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
