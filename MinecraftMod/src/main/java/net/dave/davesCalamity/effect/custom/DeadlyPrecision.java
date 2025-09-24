package net.dave.davesCalamity.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class DeadlyPrecision extends MobEffect {
    public DeadlyPrecision() {
        super(MobEffectCategory.BENEFICIAL, 0xFFD700); // gold color for crits
    }
}
