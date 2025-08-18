package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.block.custom.HopsCrop;
import net.dave.davesCalamity.block.custom.MandrakeCrop;
import net.dave.davesCalamity.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;
import java.util.function.Supplier;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
        dropSelf(ModBlocks.ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.BRONZE_BLOCK.get());
        dropSelf(ModBlocks.SILVER_BLOCK.get());
        dropSelf(ModBlocks.STEEL_BLOCK.get());
        dropSelf(ModBlocks.STRONG_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());


        dropSelf(ModBlocks.TEST_STAIR.get());
        this.add(ModBlocks.TEST_SLAB.get(),block -> createSlabItemTable(ModBlocks.TEST_SLAB.get()));
        dropSelf(ModBlocks.TEST_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.TEST_BUTTON.get());
        dropSelf(ModBlocks.TEST_FENCE.get());
        dropSelf(ModBlocks.TEST_WALL.get());
        dropSelf(ModBlocks.TEST_FENCE_GATE.get());
        this.add(ModBlocks.TEST_DOOR.get(), block -> createDoorTable(ModBlocks.TEST_DOOR.get()));
        dropSelf(ModBlocks.TEST_TRAPDOOR.get());


        // Ores
        this.add(ModBlocks.ALUMINIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get(), 0, 1));
        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get(), 0, 1));
        this.add(ModBlocks.TIN_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get(), 0, 1));
        this.add(ModBlocks.TUNGSTEN_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get(), 0, 1));
        this.add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get(), 1, 2));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get(), 1, 2));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get(), 1, 2));
        this.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get(), 1, 2));
        this.add(ModBlocks.DEEPSLATE_PURPLE_GARNET_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.DEEPSLATE_PURPLE_GARNET_ORE.get(), ModItems.PURPLE_GARNET.get(), 0, 2));
        // Crops
        this.add(ModBlocks.HOPS_CROP.get(), this.createCropDrops(ModBlocks.HOPS_CROP.get(),
                ModItems.HOPS_SEED.get(), ModItems.HOPS.get(), cropFullyGrownCondition(ModBlocks.HOPS_CROP, HopsCrop.AGE, HopsCrop.MAX_AGE)));

        this.add(ModBlocks.MANDRAKE_CROP.get(), this.createCropDrops(ModBlocks.MANDRAKE_CROP.get(),
                ModItems.MANDRAKE_ROOT.get(), ModItems.MANDRAKE.get(), cropFullyGrownCondition(ModBlocks.MANDRAKE_CROP, MandrakeCrop.AGE, MandrakeCrop.MAX_AGE)));

    }
    // Loot from harvest if crop is fully grown
    public static <T extends CropBlock> LootItemCondition.Builder cropFullyGrownCondition(
            Supplier<? extends Block> cropBlockSupplier,
            IntegerProperty ageProperty,
            int maxAge) {

        return LootItemBlockStatePropertyCondition.hasBlockStateProperties(cropBlockSupplier.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ageProperty, maxAge));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.m_255025_(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}