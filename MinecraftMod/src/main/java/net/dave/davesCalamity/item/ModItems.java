package net.dave.davesCalamity.item;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.item.custom.CokeItem;
import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.entity.ModEntities;
import net.dave.davesCalamity.item.custom.ChiselItem;
import net.minecraft.world.item.*;
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

    // Tools
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModToolTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModToolTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModToolTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> STRONG_BRONZE_AXE = ITEMS.register("strong_bronze_axe", () -> new AxeItem(ModToolTiers.STRONG_BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> STRONG_BRONZE_HOE = ITEMS.register("strong_bronze_hoe", () -> new HoeItem(ModToolTiers.STRONG_BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> STRONG_BRONZE_PICKAXE = ITEMS.register("strong_bronze_pickaxe", () -> new PickaxeItem(ModToolTiers.STRONG_BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModToolTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModToolTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModToolTiers.STEEL, new Item.Properties()));

    // Foods
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new Item(new Item.Properties().food(ModFoodProperties.CABBAGE)));
    public static final RegistryObject<Item> MANGO = ITEMS.register("mango", () -> new Item(new Item.Properties().food(ModFoodProperties.MANGO)));

    // Crop Materials
    public static final RegistryObject<Item> HOPS = ITEMS.register("hops", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANDRAKE = ITEMS.register("mandrake", () -> new Item(new Item.Properties()));

    // Fuel
    public static final RegistryObject<Item> FUEL = ITEMS.register("fuel", () -> new CokeItem(new Item.Properties(), 1200));

    // Seeds
    public static final RegistryObject<Item> HOPS_SEED = ITEMS.register("hops_seeds",
            () -> new ItemNameBlockItem(ModBlocks.HOPS_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANDRAKE_ROOT = ITEMS.register("mandrake_root",
            () -> new ItemNameBlockItem(ModBlocks.MANDRAKE_CROP.get(), new Item.Properties()));

    // Spawn Eggs
    public static final RegistryObject<Item> MANDRAKE_SPAWN_EGG = ITEMS.register("mandrake_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MANDRAKE, 0x252525, 0x505050, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
