package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, new RegistrySetBuilder()
                        .add(Registries.CONFIGURED_FEATURE, ModWorldGenProvider::bootstrapConfigured)
                        .add(Registries.PLACED_FEATURE, ModWorldGenProvider::bootstrapPlaced)
                        .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModWorldGenProvider::bootstrapBiomeModifiers), // ← add this

                Set.of("minecraft", MOD_ID));
    }



    private static void bootstrapConfigured(BootstrapContext<ConfiguredFeature<?, ?>> ctx) {
        registerStoneOre(ctx, "tin_ore_vein", ModBlocks.TIN_ORE.get(), 9);
        registerStoneOre(ctx, "aluminium_ore_vein", ModBlocks.ALUMINIUM_ORE.get(), 6);
        registerStoneOre(ctx, "tungsten_ore_vein", ModBlocks.TUNGSTEN_ORE.get(), 4);
        registerDeepslateOre(ctx, "deepslate_tin_ore_vein", ModBlocks.DEEPSLATE_TIN_ORE.get(), 9);
        registerDeepslateOre(ctx, "deepslate_aluminium_ore_vein", ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), 6);
        registerDeepslateOre(ctx, "deepslate_tungsten_ore_vein", ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), 4);
        registerDeepslateOre(ctx, "deepslate_purple_garnet_ore_vein", ModBlocks.DEEPSLATE_PURPLE_GARNET_ORE.get(), 5);
    }

    private static void bootstrapPlaced(BootstrapContext<PlacedFeature> ctx) {
        placeOre(ctx, "tin_ore_vein", 10, 0, 52);
        placeOre(ctx, "aluminium_ore_vein", 8, 0, 45);
        placeOre(ctx, "tungsten_ore_vein", 6, 0, 40);
        placeOre(ctx, "deepslate_tin_ore_vein", 10, -64, 0);
        placeOre(ctx, "deepslate_aluminium_ore_vein", 8, -64, 0);
        placeOre(ctx, "deepslate_tungsten_ore_vein", 6, -64, 0);
        placeOre(ctx, "deepslate_purple_garnet_ore_vein", 1, -64, -32);
    }

    private static void bootstrapBiomeModifiers(BootstrapContext<BiomeModifier> ctx) {
        BiomeModifierForOre(ctx, "tin_ore_vein", "add_tin_ore");
        BiomeModifierForOre(ctx, "aluminium_ore_vein", "add_aluminium_ore");
        BiomeModifierForOre(ctx, "tungsten_ore_vein", "add_tungsten_ore");
        BiomeModifierForOre(ctx, "deepslate_tin_ore_vein", "add_deepslate_tin_ore");
        BiomeModifierForOre(ctx, "deepslate_aluminium_ore_vein", "add_deepslate_aluminium_ore");
        BiomeModifierForOre(ctx, "deepslate_tungsten_ore_vein", "add_deepslate_tungsten_ore");
        BiomeModifierForOre(ctx, "deepslate_purple_garnet_ore_vein", "add_deepslate_purple_garnet_ore");

    }

    private static void BiomeModifierForOre(BootstrapContext<BiomeModifier> ctx, String placedName, String addName) {
        var biomesLookup  = ctx.lookup(Registries.BIOME);
        var placedLookup  = ctx.lookup(Registries.PLACED_FEATURE);

        var overworldBiomes = biomesLookup.getOrThrow(BiomeTags.IS_OVERWORLD);
        var orePlaced = placedLookup.getOrThrow(placedKey(placedName));

        ctx.register(
                biomeModKey(addName),
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                        overworldBiomes,
                        HolderSet.direct(orePlaced),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
    }

    private static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    private static ResourceKey<PlacedFeature> placedKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, rl(name));
    }

    private static ResourceKey<BiomeModifier> biomeModKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, rl(name));
    }

    private static void registerStoneOre(BootstrapContext<ConfiguredFeature<?, ?>> ctx, String name, Block block, int veinSize) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        ctx.register(
                ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)),
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(
                                List.of(
                                        OreConfiguration.target(stoneReplaceables, block.defaultBlockState())
                                ),
                                veinSize
                        )
                )
        );
    }

    private static void registerDeepslateOre(BootstrapContext<ConfiguredFeature<?, ?>> ctx, String name, Block block, int veinSize) {
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        ctx.register(
                ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)),
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(
                                List.of(
                                        OreConfiguration.target(deepslateReplaceables, block.defaultBlockState())
                                ),
                                veinSize
                        )
                )
        );
    }

    private static void placeOre(BootstrapContext<PlacedFeature> ctx, String name, int veinsPerChunk, int minHieght, int maxHieght) {
        var oreKey = ResourceKey.create(
                Registries.CONFIGURED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(MOD_ID, name)
        );

        registerPlaced(ctx, name, oreKey, veinsPerChunk, minHieght, maxHieght);
    }

    private static void registerPlaced(
            BootstrapContext<PlacedFeature> ctx,
            String name,
            ResourceKey<ConfiguredFeature<?, ?>> configured,
            int veinsPerChunk,
            int minHeight,
            int maxHeight
    ) {
        ctx.register(
                ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID, name)),
                new PlacedFeature(
                        ctx.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(configured),
                        List.of(
                                CountPlacement.of(veinsPerChunk),              // how many veins per chunk
                                InSquarePlacement.spread(),                    // spread across chunk
                                HeightRangePlacement.uniform(
                                        VerticalAnchor.absolute(minHeight),
                                        VerticalAnchor.absolute(maxHeight)
                                ),
                                BiomeFilter.biome()                            // only valid biomes
                        )
                )
        );
    }
}
