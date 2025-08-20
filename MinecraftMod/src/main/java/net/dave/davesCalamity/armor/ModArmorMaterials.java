package net.dave.davesCalamity.armor;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.List;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;
import net.dave.davesCalamity.item.ModItems;
import static net.minecraft.core.registries.Registries.f_315643_;

public class ModArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(f_315643_, MOD_ID);

    // Light Armor
    public static final RegistryObject<ArmorMaterial> TIN = ARMOR_MATERIALS.register("tin", () ->
            new ArmorMaterial(
                    new EnumMap<>(ArmorItem.Type.class) {{
                        put(ArmorItem.Type.HELMET, 1);
                        put(ArmorItem.Type.CHESTPLATE, 3);
                        put(ArmorItem.Type.LEGGINGS, 2);
                        put(ArmorItem.Type.BOOTS, 1);
                    }},
                    13, // enchantability
                    SoundEvents.ARMOR_EQUIP_IRON, // equip sound
                    () -> Ingredient.of(ModItems.TIN_INGOT.get()), // repair ingredient
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, "tin"))),
                    0.0F, // toughness
                    0.0F  // knockback resistance
            )
    );
    // Light Armor
    public static final RegistryObject<ArmorMaterial> BRONZE = ARMOR_MATERIALS.register("bronze", () ->
            new ArmorMaterial(
                    new EnumMap<>(ArmorItem.Type.class) {{
                        put(ArmorItem.Type.HELMET, 1);
                        put(ArmorItem.Type.CHESTPLATE, 4);
                        put(ArmorItem.Type.LEGGINGS, 2);
                        put(ArmorItem.Type.BOOTS, 1);
                    }},
                    15, // enchantability
                    SoundEvents.ARMOR_EQUIP_IRON, // equip sound
                    () -> Ingredient.of(ModItems.BRONZE_INGOT.get()), // repair ingredient
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, "bronze"))),
                    0.0F, // toughness
                    0.0F  // knockback resistance
            )
    );
    // Light Armor
    public static final RegistryObject<ArmorMaterial> ALUMINIUM = ARMOR_MATERIALS.register("aluminium", () ->
            new ArmorMaterial(
                    new EnumMap<>(ArmorItem.Type.class) {{
                        put(ArmorItem.Type.HELMET, 1);
                        put(ArmorItem.Type.CHESTPLATE, 4);
                        put(ArmorItem.Type.LEGGINGS, 3);
                        put(ArmorItem.Type.BOOTS, 1);
                    }},
                    17, // enchantability
                    SoundEvents.ARMOR_EQUIP_IRON, // equip sound
                    () -> Ingredient.of(ModItems.ALUMINIUM_INGOT.get()), // repair ingredient
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, "aluminium"))),
                    0.0F, // toughness
                    0.0F  // knockback resistance
            )
    );
    // Heaby Armor
    public static final RegistryObject<ArmorMaterial> STRONG_BRONZE = ARMOR_MATERIALS.register("strong_bronze", () ->
            new ArmorMaterial(
                    new EnumMap<>(ArmorItem.Type.class) {{
                        put(ArmorItem.Type.HELMET, 2);
                        put(ArmorItem.Type.CHESTPLATE, 5);
                        put(ArmorItem.Type.LEGGINGS, 5);
                        put(ArmorItem.Type.BOOTS, 1);
                    }},
                    15, // enchantability
                    SoundEvents.ARMOR_EQUIP_IRON, // equip sound
                    () -> Ingredient.of(ModItems.STRONG_BRONZE_INGOT.get()), // repair ingredient
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, "strong_bronze"))),
                    0.0F, // toughness
                    0.0F  // knockback resistance
            )
    );
    // Heaby Armor
    public static final RegistryObject<ArmorMaterial> STEEL = ARMOR_MATERIALS.register("steel", () ->
            new ArmorMaterial(
                    new EnumMap<>(ArmorItem.Type.class) {{
                        put(ArmorItem.Type.HELMET, 3);
                        put(ArmorItem.Type.CHESTPLATE, 8);
                        put(ArmorItem.Type.LEGGINGS, 6);
                        put(ArmorItem.Type.BOOTS, 3);
                    }},
                    15, // enchantability
                    SoundEvents.ARMOR_EQUIP_IRON, // equip sound
                    () -> Ingredient.of(ModItems.STEEL_INGOT.get()), // repair ingredient
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, "steel"))),
                    0.0F, // toughness
                    0.0F  // knockback resistance
            )
    );
    // Special
    public static final RegistryObject<ArmorMaterial> TUNGSTEN = ARMOR_MATERIALS.register("tungsten", () ->
            new ArmorMaterial(
                    new EnumMap<>(ArmorItem.Type.class) {{
                        put(ArmorItem.Type.HELMET, 3);
                        put(ArmorItem.Type.CHESTPLATE, 6);
                        put(ArmorItem.Type.LEGGINGS, 6);
                        put(ArmorItem.Type.BOOTS, 3);
                    }},
                    15, // enchantability
                    SoundEvents.ARMOR_EQUIP_IRON, // equip sound
                    () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get()), // repair ingredient
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, "tungsten"))),
                    1.0F, // toughness
                    0.0F  // knockback resistance
            )
    );
    // Special
    public static final RegistryObject<ArmorMaterial> SILVER = ARMOR_MATERIALS.register("silver", () ->
            new ArmorMaterial(
                    new EnumMap<>(ArmorItem.Type.class) {{
                        put(ArmorItem.Type.HELMET, 1);
                        put(ArmorItem.Type.CHESTPLATE, 4);
                        put(ArmorItem.Type.LEGGINGS, 2);
                        put(ArmorItem.Type.BOOTS, 1);
                    }},
                    22, // enchantability
                    SoundEvents.ARMOR_EQUIP_IRON, // equip sound
                    () -> Ingredient.of(ModItems.SILVER_INGOT.get()), // repair ingredient
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, "silver"))),
                    1.0F, // toughness
                    0.0F  // knockback resistance
            )
    );
}
