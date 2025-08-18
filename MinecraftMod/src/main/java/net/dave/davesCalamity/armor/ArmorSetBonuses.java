package net.dave.davesCalamity.armor;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.Map;

public class ArmorSetBonuses {
    private static final Map<String, MobEffectInstance> MAP = Map.of(
            // Iron full set → Night Vision I
            "iron", new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0)
            // 600 ticks = 30s, amplifier 0 = level I
    );

    public static MobEffectInstance effectForKey(String key) {
        return MAP.get(key);
    }
}