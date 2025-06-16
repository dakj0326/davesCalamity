package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DavesCalamity.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.MAGIC_BLOCK);

        blockWithItem(ModBlocks.ALUMINIUM_BLOCK);
        blockWithItem(ModBlocks.ALUMINIUM_ORE);
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockWithItem(ModBlocks.RAW_ALUMINIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.STRONG_BRONZE_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.TUNGSTEN_ORE);


        // Testing

        stairsBlock(ModBlocks.TEST_STAIR.get(), blockTexture(ModBlocks.TUNGSTEN_BLOCK.get()));
        slabBlock(ModBlocks.TEST_SLAB.get(), blockTexture(ModBlocks.ALUMINIUM_BLOCK.get()), blockTexture(ModBlocks.ALUMINIUM_BLOCK.get()));

        buttonBlock(ModBlocks.TEST_BUTTON.get(), blockTexture(ModBlocks.TUNGSTEN_BLOCK.get()));
        pressurePlateBlock(ModBlocks.TEST_PRESSURE_PLATE.get(), blockTexture(ModBlocks.TUNGSTEN_BLOCK.get()));
        fenceBlock(ModBlocks.TEST_FENCE.get(), blockTexture(ModBlocks.TUNGSTEN_BLOCK.get()));
        wallBlock(ModBlocks.TEST_WALL.get(), blockTexture(ModBlocks.TUNGSTEN_BLOCK.get()));
        fenceGateBlock(ModBlocks.TEST_FENCE_GATE.get(), blockTexture(ModBlocks.TUNGSTEN_BLOCK.get()));
        doorBlockWithRenderType(ModBlocks.TEST_DOOR.get(), modLoc("block/test_door_bottom"), modLoc("block/test_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.TEST_TRAPDOOR.get(), modLoc("block/test_trapdoor"), true, "cutout");

        blockItem(ModBlocks.TEST_STAIR);
        blockItem(ModBlocks.TEST_SLAB);
        blockItem(ModBlocks.TEST_PRESSURE_PLATE);
        blockItem(ModBlocks.TEST_FENCE_GATE);
        blockItem(ModBlocks.TEST_TRAPDOOR, "_bottom");

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("davescalamity:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("davescalamity:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}