package net.dave.davesCalamity.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public class UneasyFeetEffect extends MobEffect {
    public UneasyFeetEffect() {
        super(MobEffectCategory.HARMFUL, 0x5A3C1B);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player player && !player.level().isClientSide) {
            List<Monster> monsters = player.level().getEntitiesOfClass(
                    Monster.class,
                    player.getBoundingBox().inflate(20.0D + amplifier * 10.0D)
            );
            for (Monster mob : monsters) {
                if (mob.getTarget() == null) {
                    mob.setTarget(player);
                }
            }
        }
        return true; // must return a boolean in 1.21
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration %40 == 0; // every 2 seconds
    }
}
