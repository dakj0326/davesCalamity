package net.dave.davesCalamity.armor;

import com.mojang.blaze3d.shaders.Effect;
import net.dave.davesCalamity.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import java.util.List;
import java.util.Map;

public class ArmorSetBonuses {
    private static final Map<String, List<MobEffectInstance>> MAP = Map.ofEntries(
            Map.entry("tin", List.of(
                    new MobEffectInstance(ModEffects.DEADLY_PRECISION.getHolder().get(), 600, 0)
            )),
            Map.entry("bronze", List.of(
                    new MobEffectInstance(ModEffects.DEADLY_PRECISION.getHolder().get(), 600, 1)
            )),
            Map.entry("aluminium", List.of(
                    new MobEffectInstance(ModEffects.SWORD_MASTERY.getHolder().get(), 600, 0)
            )),
            Map.entry("diamond", List.of(
                    new MobEffectInstance(ModEffects.SWORD_MASTERY.getHolder().get(), 600, 1),
                    new MobEffectInstance(ModEffects.DEADLY_PRECISION.getHolder().get(), 600, 2)
            )),
            Map.entry("strong_bronze", List.of(
                    new MobEffectInstance(ModEffects.HEAVY_STANCE.getHolder().get(), 600, 0),
                    new MobEffectInstance(ModEffects.UNEASY_FEET.getHolder().get(), 600, 0)
            )),
            Map.entry("iron", List.of(
                    new MobEffectInstance(ModEffects.VITALITY.getHolder().get(), 600, 0),
                    new MobEffectInstance(ModEffects.UNEASY_FEET.getHolder().get(), 600, 0)
            )),
            Map.entry("steel", List.of(
                    new MobEffectInstance(ModEffects.VITALITY.getHolder().get(), 600, 1),
                    new MobEffectInstance(ModEffects.HEAVY_STANCE.getHolder().get(), 600, 0),
                    new MobEffectInstance(ModEffects.UNEASY_FEET.getHolder().get(), 600, 1)
            )),
            Map.entry("netherite", List.of(
                    new MobEffectInstance(ModEffects.VITALITY.getHolder().get(), 600, 1),
                    new MobEffectInstance(ModEffects.HEAVY_STANCE.getHolder().get(), 600, 0),
                    new MobEffectInstance(ModEffects.UNEASY_FEET.getHolder().get(), 600, 2)
            )),
            Map.entry("leather", List.of(
                    new MobEffectInstance(MobEffects.LUCK, 600, 0),
                    new MobEffectInstance(ModEffects.PINNING_SHOT.getHolder().get(), 600, 0),
                    new MobEffectInstance(ModEffects.LONGSHOT.getHolder().get(), 600, 0)
            )),
            Map.entry("chitin", List.of(
                    new MobEffectInstance(MobEffects.LUCK, 600, 1),
                    new MobEffectInstance(ModEffects.PINNING_SHOT.getHolder().get(), 600, 1),
                    new MobEffectInstance(ModEffects.LONGSHOT.getHolder().get(), 600, 0)
            )),
            Map.entry("reinforced_leather", List.of(
                    new MobEffectInstance(MobEffects.LUCK, 600, 1),
                    new MobEffectInstance(ModEffects.PINNING_SHOT.getHolder().get(), 600, 2),
                    new MobEffectInstance(ModEffects.LONGSHOT.getHolder().get(), 600, 1)
            )),
            Map.entry("chain", List.of(
                    new MobEffectInstance(MobEffects.LUCK, 600, 1),
                    new MobEffectInstance(ModEffects.PINNING_SHOT.getHolder().get(), 600, 0),
                    new MobEffectInstance(ModEffects.LONGSHOT.getHolder().get(), 600, 1)
            )),
            Map.entry("gold", List.of(
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0)
            )),
            Map.entry("tungsten", List.of(
                    new MobEffectInstance(ModEffects.PLANTED_FEET.getHolder().get(), 600, 0),
                    new MobEffectInstance(ModEffects.THORNED.getHolder().get(), 600, 3),
                    new MobEffectInstance(ModEffects.BURDENED.getHolder().get(), 600, 0)
            )),
            Map.entry("silver", List.of(
                    new MobEffectInstance(ModEffects.HOLY_STRIKE.getHolder().get(), 600, 2)
            ))
    );

    public static List<MobEffectInstance> effectsForKey(String key) {
        return MAP.getOrDefault(key, List.of());
    }
}