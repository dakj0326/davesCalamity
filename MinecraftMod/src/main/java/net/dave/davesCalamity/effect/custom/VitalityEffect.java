package net.dave.davesCalamity.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class VitalityEffect extends MobEffect {
    public VitalityEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFF69B4); // pink tint for health
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        // Apply once every 160 / (amp+1) ticks
        return duration % (160 / (amplifier + 1)) == 0;
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.getHealth() < entity.getMaxHealth() * 0.6f) {
            entity.heal(1.0F); // heal ½ heart
        }
        return true;
    }
}
