package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DavesCalamity.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.BRONZE_AXE.get());
        basicItem(ModItems.BRONZE_HOE.get());
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.BRONZE_PICKAXE.get());
        basicItem(ModItems.RAW_ALUMINIUM.get());
        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.RAW_TUNGSTEN.get());
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.STEEL_AXE.get());
        basicItem(ModItems.STEEL_HOE.get());
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.STEEL_PICKAXE.get());
        basicItem(ModItems.STRONG_BRONZE_AXE.get());
        basicItem(ModItems.STRONG_BRONZE_HOE.get());
        basicItem(ModItems.STRONG_BRONZE_INGOT.get());
        basicItem(ModItems.STRONG_BRONZE_PICKAXE.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.TUNGSTEN_INGOT.get());

        // Seeds
        basicItem(ModItems.HOPS_SEED.get());
        basicItem(ModItems.MANDRAKE_ROOT.get());

        // Food Items
        basicItem(ModItems.CABBAGE.get());
        basicItem(ModItems.MANGO.get());
        basicItem(ModItems.HOPS.get());
        basicItem(ModItems.MANDRAKE.get());

        // Spawn Eggs
        withExistingParent(ModItems.MANDRAKE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.COKE.get());


        buttonItem(ModBlocks.TEST_BUTTON, ModBlocks.ALUMINIUM_BLOCK);
        fenceItem(ModBlocks.TEST_FENCE, ModBlocks.ALUMINIUM_BLOCK);
        wallItem(ModBlocks.TEST_WALL, ModBlocks.ALUMINIUM_BLOCK);

        simpleBlockItem(ModBlocks.TEST_DOOR);

    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID,"item/" + item.getId().getPath()));
    }
}