package net.dave.davesCalamity.block;

import com.mojang.serialization.MapCodec;
import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.block.custom.*;
import net.dave.davesCalamity.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DavesCalamity.MOD_ID);

    // Ores
    public static final RegistryObject<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> DEEPSLATE_PURPLE_GARNET_ORE = registerBlock("deepslate_purple_garnet_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
            .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));


    // Metals
    public static final RegistryObject<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STRONG_BRONZE_BLOCK = registerBlock("strong_bronze_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops()));

    // Crops
    public static final RegistryObject<Block> HOPS_CROP = BLOCKS.register("hops_crop",
            () -> new HopsCrop(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollission()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> MANDRAKE_CROP = BLOCKS.register("mandrake_crop",
            () -> new MandrakeCrop(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollission()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
                    .pushReaction(PushReaction.DESTROY)));

    // 2D blocks

    public static final RegistryObject<Block> BLOOMING_CACTUS = registerBlock("blooming_cactus", () -> new BloomingCactusBlock(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> SMALL_CACTUS = registerBlock("small_cactus", () -> new SmallCactusBlock(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> DESERT_LILY = registerBlock("desert_lily", () -> new DesertLilyBlock(BlockBehaviour.Properties.of()));


    // Tutorial
    public static final RegistryObject<Block> MAGIC_BLOCK = registerBlock("magic_block", () -> new MagicBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noLootTable()));


    public static final RegistryObject<StairBlock> TEST_STAIR = registerBlock("test_stair", () -> new StairBlock(
            ModBlocks.BRONZE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> TEST_SLAB = registerBlock("test_slab", () -> new SlabBlock(
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));


    public static final RegistryObject<PressurePlateBlock> TEST_PRESSURE_PLATE = registerBlock("test_pressure_plate", () -> new PressurePlateBlock(
            BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> TEST_BUTTON = registerBlock("test_button", () -> new ButtonBlock(
            BlockSetType.IRON, 10, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noCollission()));


    public static final RegistryObject<FenceBlock> TEST_FENCE = registerBlock("test_fence", () -> new FenceBlock(
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> TEST_FENCE_GATE = registerBlock("test_fance_gate", () -> new FenceGateBlock(
            WoodType.ACACIA, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> TEST_WALL = registerBlock("test_wall", () -> new WallBlock(
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));


    public static final RegistryObject<DoorBlock> TEST_DOOR = registerBlock("test_door", () -> new DoorBlock(
            BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> TEST_TRAPDOOR = registerBlock("test_trapdoor", () -> new TrapDoorBlock(
            BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
