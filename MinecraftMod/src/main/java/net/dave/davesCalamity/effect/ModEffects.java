package net.dave.davesCalamity.effect;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.effect.custom.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, DavesCalamity.MOD_ID);

    public static final RegistryObject<MobEffect> HEAVY_STANCE =
            EFFECTS.register("heavy_stance", HeavyStanceEffect::new);
    public static final RegistryObject<MobEffect> UNEASY_FEET =
            EFFECTS.register("uneasy_feet", UneasyFeetEffect::new);
    public static final RegistryObject<MobEffect> SWORD_MASTERY =
            EFFECTS.register("sword_mastery", SwordMasteryEffect::new);
    public static final RegistryObject<MobEffect> DEADLY_PRECISION =
            EFFECTS.register("deadly_precision", DeadlyPrecision::new);
    public static final RegistryObject<MobEffect> LONGSHOT =
            EFFECTS.register("longshot", LongshotEffect::new);
    public static final RegistryObject<MobEffect> PINNING_SHOT =
            EFFECTS.register("pinning_shot", PinningShotEffect::new);
    public static final RegistryObject<MobEffect> ROOTED =
            EFFECTS.register("rooted", RootedEffect::new);
    public static final RegistryObject<MobEffect> PLANTED_FEET =
            EFFECTS.register("planted_feet", PlantedFeetEffect::new);
    public static final RegistryObject<MobEffect> BURDENED =
            EFFECTS.register("burdened", BurdenedEffect::new);
    public static final RegistryObject<MobEffect> VITALITY =
            EFFECTS.register("vitality", VitalityEffect::new);
    public static final RegistryObject<MobEffect> THORNED =
            EFFECTS.register("thorned", ThornedEffect::new);
    public static final RegistryObject<MobEffect> HOLY_STRIKE =
            EFFECTS.register("holy_strike", HolyStrikeEffect::new);

}
