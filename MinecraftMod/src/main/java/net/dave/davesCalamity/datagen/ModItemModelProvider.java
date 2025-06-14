package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DavesCalamity.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ALEXANDRITE.get());
        basicItem(ModItems.RAW_ALEXANDRITE.get());

        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.STRONG_BRONZE_INGOT.get());
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.TUNGSTEN_INGOT.get());


        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.CABBAGE.get());
        basicItem(ModItems.FUEL.get());
    }
}