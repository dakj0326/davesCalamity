package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.entity.ModEntities;
import net.dave.davesCalamity.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final TagKey<Biome> OVERWORLD_BIOMES =
            TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("minecraft", "is_overworld"));
    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, new RegistrySetBuilder()
                        .add(Registries.CONFIGURED_FEATURE, ctx -> {
                            bootstrapConfigured(ctx);
                            bootstrapPlants(ctx, null, null);
                        })
                        .add(Registries.PLACED_FEATURE, ctx -> {
                            bootstrapPlaced(ctx);
                            bootstrapPlants(null, ctx, null);
                        })
                        .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ctx -> {
                            bootstrapBiomeModifiers(ctx);
                            bootstrapPlants(null, null, ctx);
                        }),
                Set.of("minecraft", MOD_ID));
    }

    private static void bootstrapPlants(
            BootstrapContext<ConfiguredFeature<?, ?>> ctxConfigured,
            BootstrapContext<PlacedFeature> ctxPlaced,
            BootstrapContext<BiomeModifier> ctxBiome
    ) {
        registerSimplePlant(
                ctxConfigured,
                ctxPlaced,
                ctxBiome,
                "desert_lily",
                ModBlocks.DESERT_LILY.get(),
                1,  // patches per chunk
                6,  // tries per patch
                ModTags.Biomes.IS_DESERT
        );

        registerSimplePlant(
                ctxConfigured,
                ctxPlaced,
                ctxBiome,
                "small_cactus",
                ModBlocks.SMALL_CACTUS.get(),
                2,
                7,
                ModTags.Biomes.IS_DESERT
        );

        registerSimplePlant(
                ctxConfigured,
                ctxPlaced,
                ctxBiome,
                "blooming_cactus",
                ModBlocks.BLOOMING_CACTUS.get(),
                1,
                4,
                ModTags.Biomes.IS_DESERT
        );
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
        registerMobSpawn(ctx, "dune_wraith", ModEntities.DUNE_WRAITH.get(), 10, 1, 1, ModTags.Biomes.IS_DESERT);
        registerMobSpawn(ctx, "sand_scorpion", ModEntities.SAND_SCORPION.get(), 200, 1, 5, ModTags.Biomes.IS_DESERT);
        registerMobSpawn(ctx, "stone_golem", ModEntities.STONE_GOLEM.get(), 65, 1, 2, OVERWORLD_BIOMES);
        registerMobSpawn(ctx, "mandrake", ModEntities.MANDRAKE.get(), 30, 1, 3, Tags.Biomes.IS_SWAMP);
    }

    private static void BiomeModifierForOre(BootstrapContext<BiomeModifier> ctx, String placedName, String addName) {
        var biomesLookup = ctx.lookup(Registries.BIOME);
        var placedLookup = ctx.lookup(Registries.PLACED_FEATURE);

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

    private static void registerSimplePlant(
            BootstrapContext<ConfiguredFeature<?, ?>> configuredCtx,
            BootstrapContext<PlacedFeature> placedCtx,
            BootstrapContext<BiomeModifier> biomeCtx,
            String name,
            Block block,
            int patchesPerChunk,
            int triesPerPatch,
            TagKey<Biome> biomeTag

    ) {
        // 1. ConfiguredFeature
        if (configuredCtx != null) {
            var configuredKey = ResourceKey.create(Registries.CONFIGURED_FEATURE, rl(name));
            configuredCtx.register(configuredKey,
                    new ConfiguredFeature<>(
                            Feature.FLOWER,
                            new RandomPatchConfiguration(
                                    triesPerPatch,
                                    6,
                                    2,
                                    PlacementUtils.onlyWhenEmpty(
                                            Feature.SIMPLE_BLOCK,
                                            new SimpleBlockConfiguration(BlockStateProvider.simple(block))
                                    )
                            )
                    )
            );
        }

        // 2. PlacedFeature
        if (placedCtx != null) {
            var configuredKey = ResourceKey.create(Registries.CONFIGURED_FEATURE, rl(name));
            var placedKey = ResourceKey.create(Registries.PLACED_FEATURE, rl(name));
            placedCtx.register(placedKey,
                    new PlacedFeature(
                            placedCtx.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(configuredKey),
                            List.of(
                                    CountPlacement.of(patchesPerChunk),
                                    InSquarePlacement.spread(),
                                    PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                                    BiomeFilter.biome()
                            )
                    )
            );
        }

        // 3. BiomeModifier
        if (biomeCtx != null) {
            var placedKey = ResourceKey.create(Registries.PLACED_FEATURE, rl(name));
            var biomesLookup = biomeCtx.lookup(Registries.BIOME);
            var placedLookup = biomeCtx.lookup(Registries.PLACED_FEATURE);

            var targetBiomes = biomesLookup.getOrThrow(biomeTag);
            var placedFeature = placedLookup.getOrThrow(placedKey);

            biomeCtx.register(
                    biomeModKey("add_" + name),
                    new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                            targetBiomes,
                            HolderSet.direct(placedFeature),
                            GenerationStep.Decoration.VEGETAL_DECORATION
                    )
            );
        }
    }

    private static void registerMobSpawn(
            BootstrapContext<BiomeModifier> ctx,
            String name,
            EntityType<?> entity,
            int weight,
            int minCount,
            int maxCount,
            TagKey<Biome> biomeTag
    ) {
        var biomesLookup = ctx.lookup(Registries.BIOME);

        // Build the spawner data with category baked in
        MobSpawnSettings.SpawnerData spawner =
                new MobSpawnSettings.SpawnerData(entity, weight, minCount, maxCount);

        ctx.register(
                biomeModKey("spawn_" + name),
                ForgeBiomeModifiers.AddSpawnsBiomeModifier.singleSpawn(
                        biomesLookup.getOrThrow(biomeTag),
                        spawner
                )
        );
    }
}
