package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.DavesCalamity;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class ModBiomeTagProvider extends TagsProvider<Biome> {
    public ModBiomeTagProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> lookupProvider,
                               ExistingFileHelper existingFileHelper) {
        super(output, net.minecraft.core.registries.Registries.BIOME, lookupProvider, MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Create tag: #davescalamity:is_desert
        tag(TagKey.create(net.minecraft.core.registries.Registries.BIOME,
                ResourceLocation.fromNamespaceAndPath(MOD_ID, "is_desert")))
                .addOptional(ResourceLocation.fromNamespaceAndPath("minecraft", "desert"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("minecraft", "badlands"));
    }

    @Override
    public String getName() {
        return "Biome Tags: " + MOD_ID;
    }
}
