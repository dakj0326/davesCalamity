package net.dave.davesCalamity.armor;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ArmorMaterials;

import java.util.HashMap;
import java.util.Map;


public final class ArmorSetKeys {
    private ArmorSetKeys() {}

    private static final Map<ResourceLocation, String> MAP = new HashMap<>();
    static {
        MAP.put(BuiltInRegistries.f_315942_.getKey(ArmorMaterials.f_40453_.value()), "leather");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ArmorMaterials.f_40454_.value()), "chain");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ArmorMaterials.f_40455_.value()), "iron");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ArmorMaterials.f_40456_.value()), "gold");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ArmorMaterials.f_40457_.value()), "diamond");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ArmorMaterials.f_40459_.value()), "netherite");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ModArmorMaterials.TIN.get()), "tin");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ModArmorMaterials.BRONZE.get()), "bronze");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ModArmorMaterials.ALUMINIUM.get()), "aluminium");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ModArmorMaterials.STRONG_BRONZE.get()), "strong_bronze");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ModArmorMaterials.STEEL.get()), "steel");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ModArmorMaterials.TUNGSTEN.get()), "tungsten");
        MAP.put(BuiltInRegistries.f_315942_.getKey(ModArmorMaterials.SILVER.get()), "silver");
    }

    public static String keyForMaterial(ArmorMaterial material) {
        var id = BuiltInRegistries.f_315942_.getKey(material);
        return id == null ? null : MAP.get(id);
    }
}