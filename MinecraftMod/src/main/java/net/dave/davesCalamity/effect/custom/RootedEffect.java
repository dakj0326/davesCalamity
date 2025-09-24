package net.dave.davesCalamity.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class RootedEffect extends MobEffect {
    public RootedEffect() {
        super(MobEffectCategory.HARMFUL, 0x006400); // dark green
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true; // run every tick
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        // Stop all movement
        entity.setDeltaMovement(0, 0, 0);

        // Sync to client
        entity.hasImpulse = true;

        // Prevent fall damage accumulation
        entity.fallDistance = 0;

        // Optional: reset position to keep them locked in place
        entity.teleportTo(entity.getX(), entity.getY(), entity.getZ());

        return true;
    }
}
