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
                        output.accept(ModItems.FUEL.get());
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

                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_TOOLS_TAB = CREATIVE_MODE_TABS.register(
            "mod_tools_tab", () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModItems.STRONG_BRONZE_PICKAXE.get()))
                    .withTabsBefore(MOD_FOODS_TAB.getId())
                    .title(Component.translatable("creativetab.davescalamity.mod_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHISEL.get());
                        output.accept(ModItems.BRONZE_PICKAXE.get());
                        output.accept(ModItems.STRONG_BRONZE_PICKAXE.get());
                        output.accept(ModItems.STEEL_PICKAXE.get());
                        output.accept(ModItems.BRONZE_AXE.get());
                        output.accept(ModItems.STRONG_BRONZE_AXE.get());
                        output.accept(ModItems.STEEL_AXE.get());
                        output.accept(ModItems.BRONZE_HOE.get());
                        output.accept(ModItems.STRONG_BRONZE_HOE.get());
                        output.accept(ModItems.STEEL_HOE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_TEST_TAB = CREATIVE_MODE_TABS.register(
            "mod_test_tab", () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModBlocks.MAGIC_BLOCK.get()))
                    .withTabsBefore(MOD_TOOLS_TAB.getId())
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

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
