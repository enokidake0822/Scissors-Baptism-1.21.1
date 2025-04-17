package com.enokidake1997.scissorsbaptism.particle;

import com.enokidake1997.scissorsbaptism.ScissorsBaptism;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ScissorsParticles {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, ScissorsBaptism.MOD_ID);

    public static final Supplier<SimpleParticleType> BLOOD_PARTICLE =
            PARTICLE_TYPES.register("blood_particle", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }

}
