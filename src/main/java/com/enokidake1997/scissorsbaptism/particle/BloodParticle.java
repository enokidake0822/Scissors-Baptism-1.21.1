package com.enokidake1997.scissorsbaptism.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;

public class BloodParticle extends TextureSheetParticle {


    protected BloodParticle(ClientLevel level, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        super(level, x, y, z, 0.0, 0.0, 0.0);
        this.friction = 0.9F;
        this.gravity = 1.5F;
        this.xd *= 1.2F;
        this.yd *= 1.8F;
        this.zd *= 1.2F;
        this.xd += xSpeed * 0.4;
        this.yd += ySpeed * 0.4;
        this.zd += zSpeed * 0.4;
        float f = (float)(Math.random() * 0.3F + 0.6F);
        this.rCol = f;
        this.gCol = f;
        this.bCol = f;
        this.quadSize *= 0.45F;
        this.lifetime = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 30);
        this.tick();
    }

    @Override
    public float getQuadSize(float scaleFactor) {
        return this.quadSize * Mth.clamp(((float)this.age + scaleFactor) / (float)this.lifetime * 32.0F, 0.0F, 1.0F);
    }

    @Override
    public void tick() {
        super.tick();
        this.gCol *= 0.96F;
        this.bCol *= 0.9F;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public Provider(SpriteSet sprites) {
            this.sprite = sprites;
        }

        public Particle createParticle(SimpleParticleType type, ClientLevel level,
                                       double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            BloodParticle bloodparticle = new BloodParticle(level, x, y, z, xSpeed, ySpeed, zSpeed);
            bloodparticle.pickSprite(this.sprite);
            return bloodparticle;
        }
    }
}
