package net.dave.davesCalamity.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class BurdenedEffect extends MobEffect {
    public BurdenedEffect() {
        super(MobEffectCategory.HARMFUL, 0x4B4B4B); // dark gray, “metal weight” tint
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true; // run every tick
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player player) {
            // Simulate fatigue: higher amplifier burns more stamina (hunger)
            float multiplier = 1.5f + (amplifier * 0.5f); // Lv1 = 1.5x, Lv2 = 2.0x
            player.getFoodData().addExhaustion(0.005f * multiplier);
        }
        return true;
    }
}
