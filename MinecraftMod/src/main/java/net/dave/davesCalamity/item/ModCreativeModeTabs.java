package net.dave.davesCalamity.item;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DavesCalamity.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_ITEMS_TAB = CREATIVE_MODE_TABS.register(
            "mod_items_tab", () -> CreativeModeTab.builder().icon(
                    () -> new ItemStack(ModItems.RAW_SILVER.get()))
                    .title(Component.translatable("creativetab.davescalamity.mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COKE.get());
                        // Ingots
                        output.accept(ModItems.ALUMINIUM_INGOT.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.BRONZE_INGOT.get());
                        output.accept(ModItems.STRONG_BRONZE_INGOT.get());
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.TUNGSTEN_INGOT.get());
                        // Raw Ores
                        output.accept(ModItems.RAW_ALUMINIUM.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.RAW_TUNGSTEN.get());
                        output.accept(ModItems.PURPLE_GARNET.get());

                        // Misc
                        output.accept(ModItems.CHITIN.get());
                        output.accept(ModItems.CHITIN_POWDER.get());
                        output.accept(ModItems.REINFORCED_LEATHER.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_BLOCKS_TAB = CREATIVE_MODE_TABS.register(
            "mod_blocks_tab", () -> CreativeModeTab.builder().icon(
                    () -> new ItemStack(ModBlocks.SILVER_ORE.get()))
                    .withTabsBefore(MOD_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.davescalamity.mod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MAGIC_BLOCK.get());

                        // Ores
                        output.accept(ModBlocks.ALUMINIUM_BLOCK.get());
                        output.accept(ModBlocks.ALUMINIUM_ORE.get());
                        output.accept(ModBlocks.BRONZE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_PURPLE_GARNET_ORE.get());
                        output.accept(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        output.accept(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
                        output.accept(ModBlocks.SILVER_BLOCK.get());
                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.STRONG_BRONZE_BLOCK.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.TUNGSTEN_BLOCK.get());
                        output.accept(ModBlocks.TUNGSTEN_ORE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_FOODS_TAB = CREATIVE_MODE_TABS.register(
            "mod_foods_tab", () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModItems.MANGO.get()))
                    .withTabsBefore(MOD_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.davescalamity.mod_foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MANGO.get());
                        output.accept(ModItems.CABBAGE.get());
                        output.accept(ModItems.CABBAGE_SEEDS.get());
                        output.accept(ModItems.HOPS_SEEDS.get());
                        output.accept(ModItems.HOPS.get());
                        output.accept(ModItems.MANDRAKE_ROOT.get());
                        output.accept(ModItems.MANDRAKE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_TOOLS_TAB = CREATIVE_MODE_TABS.register(
            "mod_tools_tab", () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModItems.STRONG_BRONZE_PICKAXE.get()))
                    .withTabsBefore(MOD_FOODS_TAB.getId())
                    .title(Component.translatable("creativetab.davescalamity.mod_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BRONZE_PICKAXE.get());
                        output.accept(ModItems.STRONG_BRONZE_PICKAXE.get());
                        output.accept(ModItems.STEEL_PICKAXE.get());
                        output.accept(ModItems.BRONZE_AXE.get());
                        output.accept(ModItems.BRONZE_AXE.get());
                        output.accept(ModItems.STRONG_BRONZE_AXE.get());
                        output.accept(ModItems.STEEL_AXE.get());
                        output.accept(ModItems.BRONZE_HOE.get());
                        output.accept(ModItems.STRONG_BRONZE_HOE.get());
                        output.accept(ModItems.STEEL_HOE.get());
                        output.accept(ModItems.BRONZE_SHOVEL.get());
                        output.accept(ModItems.STRONG_BRONZE_SHOVEL.get());
                        output.accept(ModItems.STEEL_SHOVEL.get());
                        output.accept(ModItems.BRONZE_SWORD.get());
                        output.accept(ModItems.STRONG_BRONZE_SWORD.get());
                        output.accept(ModItems.STEEL_SWORD.get());
                        output.accept(ModItems.TIN_HELMET.get());
                        output.accept(ModItems.TIN_CHESTPLATE.get());
                        output.accept(ModItems.TIN_LEGGINGS.get());
                        output.accept(ModItems.TIN_BOOTS.get());
                        output.accept(ModItems.ALUMINIUM_HELMET.get());
                        output.accept(ModItems.ALUMINIUM_CHESTPLATE.get());
                        output.accept(ModItems.ALUMINIUM_LEGGINGS.get());
                        output.accept(ModItems.ALUMINIUM_BOOTS.get());
                        output.accept(ModItems.BRONZE_HELMET.get());
                        output.accept(ModItems.BRONZE_CHESTPLATE.get());
                        output.accept(ModItems.BRONZE_LEGGINGS.get());
                        output.accept(ModItems.BRONZE_BOOTS.get());
                        output.accept(ModItems.STRONG_BRONZE_HELMET.get());
                        output.accept(ModItems.STRONG_BRONZE_CHESTPLATE.get());
                        output.accept(ModItems.STRONG_BRONZE_LEGGINGS.get());
                        output.accept(ModItems.STRONG_BRONZE_BOOTS.get());
                        output.accept(ModItems.STEEL_HELMET.get());
                        output.accept(ModItems.STEEL_CHESTPLATE.get());
                        output.accept(ModItems.STEEL_LEGGINGS.get());
                        output.accept(ModItems.STEEL_BOOTS.get());
                        output.accept(ModItems.TUNGSTEN_HELMET.get());
                        output.accept(ModItems.TUNGSTEN_CHESTPLATE.get());
                        output.accept(ModItems.TUNGSTEN_LEGGINGS.get());
                        output.accept(ModItems.TUNGSTEN_BOOTS.get());
                        output.accept(ModItems.SILVER_HELMET.get());
                        output.accept(ModItems.SILVER_CHESTPLATE.get());
                        output.accept(ModItems.SILVER_LEGGINGS.get());
                        output.accept(ModItems.SILVER_BOOTS.get());
                        output.accept(ModItems.CHITIN_HELMET.get());
                        output.accept(ModItems.CHITIN_CHESTPLATE.get());
                        output.accept(ModItems.CHITIN_LEGGINGS.get());
                        output.accept(ModItems.CHITIN_BOOTS.get());
                        output.accept(ModItems.REINFORCED_LEATHER_HELMET.get());
                        output.accept(ModItems.REINFORCED_LEATHER_CHESTPLATE.get());
                        output.accept(ModItems.REINFORCED_LEATHER_LEGGINGS.get());
                        output.accept(ModItems.REINFORCED_LEATHER_BOOTS.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_DECORATIVE_TAB = CREATIVE_MODE_TABS.register(
            "mod_decorative_tab", () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModBlocks.BLOOMING_CACTUS.get()))
                    .withTabsBefore(MOD_TOOLS_TAB.getId())
                    .title(Component.translatable("creativetab.davescalamity.mod_decorative"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLOOMING_CACTUS.get());
                        output.accept(ModBlocks.SMALL_CACTUS.get());
                        output.accept(ModBlocks.DESERT_LILY.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_TEST_TAB = CREATIVE_MODE_TABS.register(
            "mod_test_tab", () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModBlocks.MAGIC_BLOCK.get()))
                    .withTabsBefore(MOD_DECORATIVE_TAB.getId())
                    .title(Component.translatable("creativetab.davescalamity.mod_test"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TEST_STAIR.get());
                        output.accept(ModBlocks.TEST_SLAB.get());
                        output.accept(ModBlocks.TEST_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.TEST_BUTTON.get());
                        output.accept(ModBlocks.TEST_FENCE.get());
                        output.accept(ModBlocks.TEST_WALL.get());
                        output.accept(ModBlocks.TEST_FENCE_GATE.get());
                        output.accept(ModBlocks.TEST_DOOR.get());
                        output.accept(ModBlocks.TEST_TRAPDOOR.get());
                        output.accept(ModItems.CHISEL.get());

                    }).build());



    public static final RegistryObject<CreativeModeTab> MOD_SPAWN_TAB = CREATIVE_MODE_TABS.register(
            "mod_spawn_tab", () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModItems.MANDRAKE_SPAWN_EGG.get()))
                    .withTabsBefore(MOD_TEST_TAB.getId())
                    .title(Component.translatable("creativetab.davescalamity.mod_foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DUNE_WRAITH_SPAWN_EGG.get());
                        output.accept(ModItems.MANDRAKE_SPAWN_EGG.get());
                        output.accept(ModItems.SAND_SCORPION_SPAWN_EGG.get());
                        output.accept(ModItems.STONE_GOLEM_SPAWN_EGG.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
