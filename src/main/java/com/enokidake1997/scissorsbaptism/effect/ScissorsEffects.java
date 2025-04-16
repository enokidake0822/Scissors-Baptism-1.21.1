package com.enokidake1997.scissorsbaptism.effect;

import com.enokidake1997.scissorsbaptism.ScissorsBaptism;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ScissorsEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, ScissorsBaptism.MOD_ID);
    public static final Holder<MobEffect> BLOODING = MOB_EFFECTS.register("blooding",
            () -> new BloodingEffect(MobEffectCategory.HARMFUL, 0xcc0000)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED,
                            ResourceLocation.fromNamespaceAndPath(ScissorsBaptism.MOD_ID, "blooding"), -0.25F,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
