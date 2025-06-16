package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DavesCalamity.MOD_ID, existingFileHelper);
    }

    // SUPER IMPORTANT NOTE!!!!!
    // SOME TAG FILES EXIST IN MAIN DIRECTORY WHICH WILL OVERWRITE ANY DUPLICATES THAT ARE GENERATED

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        /*
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MAGIC_BLOCK.get());

         */


        tag(BlockTags.FENCES).add(ModBlocks.TEST_FENCE.get());
        tag(BlockTags.FENCES).add(ModBlocks.TEST_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.TEST_WALL.get());
    }
}