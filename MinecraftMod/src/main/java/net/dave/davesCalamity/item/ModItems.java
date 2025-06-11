package net.dave.davesCalamity.item;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.item.custom.FuelItem;
import net.dave.davesCalamity.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DavesCalamity.MOD_ID);

    //Items
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite", () -> new Item(new Item.Properties()));

    //Foods
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new Item(new Item.Properties().food(ModFoodProperties.CABBAGE)));

    //Fuel
    public static final RegistryObject<Item> FUEL = ITEMS.register("fuel", () -> new FuelItem(new Item.Properties(), 1200));

    //Advanced
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
