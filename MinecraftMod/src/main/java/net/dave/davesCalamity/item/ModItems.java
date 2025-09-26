package net.dave.davesCalamity.item;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.armor.ModArmorMaterials;
import net.dave.davesCalamity.item.custom.CokeItem;
import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.entity.ModEntities;
import net.dave.davesCalamity.item.custom.ChiselItem;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DavesCalamity.MOD_ID);

    // Items

    // Ingots
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRONG_BRONZE_INGOT = ITEMS.register("strong_bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties()));

    // Raw Ore
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_GARNET = ITEMS.register("purple_garnet", () -> new Item(new Item.Properties()));

    // Armors
    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet",
            () -> new ArmorItem(ModArmorMaterials.TIN.getHolder().get(), ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TIN.getHolder().get(), ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings",
            () -> new ArmorItem(ModArmorMaterials.TIN.getHolder().get(), ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots",
            () -> new ArmorItem(ModArmorMaterials.TIN.getHolder().get(), ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet",
            () -> new ArmorItem(ModArmorMaterials.ALUMINIUM.getHolder().get(), ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ALUMINIUM.getHolder().get(), ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ALUMINIUM.getHolder().get(), ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots",
            () -> new ArmorItem(ModArmorMaterials.ALUMINIUM.getHolder().get(), ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            () -> new ArmorItem(ModArmorMaterials.BRONZE.getHolder().get(), ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BRONZE.getHolder().get(), ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            () -> new ArmorItem(ModArmorMaterials.BRONZE.getHolder().get(), ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ArmorItem(ModArmorMaterials.BRONZE.getHolder().get(), ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STRONG_BRONZE_HELMET = ITEMS.register("strong_bronze_helmet",
            () -> new ArmorItem(ModArmorMaterials.STRONG_BRONZE.getHolder().get(), ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STRONG_BRONZE_CHESTPLATE = ITEMS.register("strong_bronze_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STRONG_BRONZE.getHolder().get(), ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STRONG_BRONZE_LEGGINGS = ITEMS.register("strong_bronze_leggings",
            () -> new ArmorItem(ModArmorMaterials.STRONG_BRONZE.getHolder().get(), ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STRONG_BRONZE_BOOTS = ITEMS.register("strong_bronze_boots",
            () -> new ArmorItem(ModArmorMaterials.STRONG_BRONZE.getHolder().get(), ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL.getHolder().get(), ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL.getHolder().get(), ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL.getHolder().get(), ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL.getHolder().get(), ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN.getHolder().get(), ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN.getHolder().get(), ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN.getHolder().get(), ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN.getHolder().get(), ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterials.SILVER.getHolder().get(), ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SILVER.getHolder().get(), ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterials.SILVER.getHolder().get(), ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER.getHolder().get(), ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));


    // Tools
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModToolTiers.BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.BRONZE, -1.0F, 0.F))));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModToolTiers.BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.BRONZE, 7.0F, -3.2F))));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModToolTiers.BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.BRONZE, 2.0F, -2.8F))));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModToolTiers.BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.BRONZE, 2.0F, -2.8F))));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModToolTiers.BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.BRONZE, 5.0F, -2.8F))));
    public static final RegistryObject<Item> STRONG_BRONZE_AXE = ITEMS.register("strong_bronze_axe", () -> new AxeItem(ModToolTiers.STRONG_BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STRONG_BRONZE, 7.0F, -3.2F))));
    public static final RegistryObject<Item> STRONG_BRONZE_HOE = ITEMS.register("strong_bronze_hoe", () -> new HoeItem(ModToolTiers.STRONG_BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STRONG_BRONZE, -1.0F, 0.F))));
    public static final RegistryObject<Item> STRONG_BRONZE_PICKAXE = ITEMS.register("strong_bronze_pickaxe", () -> new PickaxeItem(ModToolTiers.STRONG_BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STRONG_BRONZE, 2.0F, -2.8F))));
    public static final RegistryObject<Item> STRONG_BRONZE_SHOVEL = ITEMS.register("strong_bronze_shovel", () -> new ShovelItem(ModToolTiers.STRONG_BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STRONG_BRONZE, 2.0F, -2.8F))));
    public static final RegistryObject<Item> STRONG_BRONZE_SWORD = ITEMS.register("strong_bronze_sword", () -> new SwordItem(ModToolTiers.STRONG_BRONZE, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STRONG_BRONZE, 5.5F, -2.8F))));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModToolTiers.STEEL, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STEEL, 7.0F, -3.0F))));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModToolTiers.STEEL, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STEEL, -1.0F, 0.F))));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModToolTiers.STEEL, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STEEL, 2.0F, -2.8F))));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModToolTiers.STEEL, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STEEL, 2.0F, -2.8F))));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModToolTiers.STEEL, new Item.Properties()
            .attributes(createToolAttributes(ModToolTiers.STEEL, 6.5F, -2.8F))));

    // Foods
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new Item(new Item.Properties().food(ModFoodProperties.CABBAGE)));
    public static final RegistryObject<Item> MANGO = ITEMS.register("mango", () -> new Item(new Item.Properties().food(ModFoodProperties.MANGO)));

    // Crop Materials
    public static final RegistryObject<Item> HOPS = ITEMS.register("hops", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANDRAKE = ITEMS.register("mandrake", () -> new Item(new Item.Properties()));

    //public static final RegistryObject<Item> DESERT_LILy = ITEMS.register("desert_lily", () -> new BlockItem(ModBlocks.DESERT_LILY.get(), new Item.Properties()));

    // Fuel
    public static final RegistryObject<Item> COKE = ITEMS.register("coke", () -> new CokeItem(new Item.Properties(), 1200));

    // Seeds
    public static final RegistryObject<Item> HOPS_SEED = ITEMS.register("hops_seeds",
            () -> new ItemNameBlockItem(ModBlocks.HOPS_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANDRAKE_ROOT = ITEMS.register("mandrake_root",
            () -> new ItemNameBlockItem(ModBlocks.MANDRAKE_CROP.get(), new Item.Properties()));

    // Spawn Eggs
    public static final RegistryObject<Item> MANDRAKE_SPAWN_EGG = ITEMS.register("mandrake_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MANDRAKE, 0x252525, 0x505050, new Item.Properties()));

    public static final RegistryObject<Item> SAND_SCORPION_SPAWN_EGG = ITEMS.register("sand_scorpion_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SAND_SCORPION, 0x550125, 0x010150, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    private static ItemAttributeModifiers createToolAttributes(Tier tier, float bonusDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(
                                Item.BASE_ATTACK_DAMAGE_ID,
                                tier.m_6631_() + bonusDamage,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .add(
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(
                                Item.BASE_ATTACK_SPEED_ID,
                                attackSpeed,
                                AttributeModifier.Operation.ADD_VALUE
                        ),
                        EquipmentSlotGroup.MAINHAND
                )
                .build();
    }

}
