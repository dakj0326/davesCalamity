package net.dave.davesCalamity.datagen;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
        armorItem(ModItems.TIN_HELMET.get(), "tin_helmet");
        armorItem(ModItems.TIN_CHESTPLATE.get(), "tin_chestplate");
        armorItem(ModItems.TIN_LEGGINGS.get(), "tin_leggings");
        armorItem(ModItems.TIN_BOOTS.get(), "tin_boots");
        armorItem(ModItems.ALUMINIUM_HELMET.get(), "aluminium_helmet");
        armorItem(ModItems.ALUMINIUM_CHESTPLATE.get(), "aluminium_chestplate");
        armorItem(ModItems.ALUMINIUM_LEGGINGS.get(), "aluminium_leggings");
        armorItem(ModItems.ALUMINIUM_BOOTS.get(), "aluminium_boots");
        armorItem(ModItems.BRONZE_HELMET.get(), "bronze_helmet");
        armorItem(ModItems.BRONZE_CHESTPLATE.get(), "bronze_chestplate");
        armorItem(ModItems.BRONZE_LEGGINGS.get(), "bronze_leggings");
        armorItem(ModItems.BRONZE_BOOTS.get(), "bronze_boots");
        armorItem(ModItems.STRONG_BRONZE_HELMET.get(), "strong_bronze_helmet");
        armorItem(ModItems.STRONG_BRONZE_CHESTPLATE.get(), "strong_bronze_chestplate");
        armorItem(ModItems.STRONG_BRONZE_LEGGINGS.get(), "strong_bronze_leggings");
        armorItem(ModItems.STRONG_BRONZE_BOOTS.get(), "strong_bronze_boots");
        armorItem(ModItems.STEEL_HELMET.get(), "steel_helmet");
        armorItem(ModItems.STEEL_CHESTPLATE.get(), "steel_chestplate");
        armorItem(ModItems.STEEL_LEGGINGS.get(), "steel_leggings");
        armorItem(ModItems.STEEL_BOOTS.get(), "steel_boots");
        armorItem(ModItems.SILVER_HELMET.get(), "silver_helmet");
        armorItem(ModItems.SILVER_CHESTPLATE.get(), "silver_chestplate");
        armorItem(ModItems.SILVER_LEGGINGS.get(), "silver_leggings");
        armorItem(ModItems.SILVER_BOOTS.get(), "silver_boots");
        armorItem(ModItems.TUNGSTEN_HELMET.get(), "tungsten_helmet");
        armorItem(ModItems.TUNGSTEN_CHESTPLATE.get(), "tungsten_chestplate");
        armorItem(ModItems.TUNGSTEN_LEGGINGS.get(), "tungsten_leggings");
        armorItem(ModItems.TUNGSTEN_BOOTS.get(), "tungsten_boots");
        armorItem(ModItems.CHITIN_HELMET.get(), "chitin_helmet");
        armorItem(ModItems.CHITIN_CHESTPLATE.get(), "chitin_chestplate");
        armorItem(ModItems.CHITIN_LEGGINGS.get(), "chitin_leggings");
        armorItem(ModItems.CHITIN_BOOTS.get(), "chitin_boots");
        armorItem(ModItems.REINFORCED_LEATHER_HELMET.get(), "reinforced_leather_helmet");
        armorItem(ModItems.REINFORCED_LEATHER_CHESTPLATE.get(), "reinforced_leather_chestplate");
        armorItem(ModItems.REINFORCED_LEATHER_LEGGINGS.get(), "reinforced_leather_leggings");
        armorItem(ModItems.REINFORCED_LEATHER_BOOTS.get(), "reinforced_leather_boots");

        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.BRONZE_AXE.get());
        basicItem(ModItems.BRONZE_HOE.get());
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.BRONZE_PICKAXE.get());
        basicItem(ModItems.BRONZE_SHOVEL.get());
        basicItem(ModItems.BRONZE_SWORD.get());
        basicItem(ModItems.CABBAGE.get());
        basicItem(ModItems.CABBAGE_SEEDS.get());
        basicItem(ModItems.CHITIN.get());
        basicItem(ModItems.CHITIN_POWDER.get());
        basicItem(ModItems.COKE.get());
        basicItem(ModItems.HOPS.get());
        basicItem(ModItems.HOPS_SEEDS.get());
        basicItem(ModItems.MANDRAKE.get());
        basicItem(ModItems.MANDRAKE_ROOT.get());
        basicItem(ModItems.MANGO.get());
        basicItem(ModItems.PURPLE_GARNET.get());
        basicItem(ModItems.RAW_ALUMINIUM.get());
        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.RAW_TUNGSTEN.get());
        basicItem(ModItems.REINFORCED_LEATHER.get());
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.STEEL_AXE.get());
        basicItem(ModItems.STEEL_HOE.get());
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.STEEL_PICKAXE.get());
        basicItem(ModItems.STEEL_SHOVEL.get());
        basicItem(ModItems.STEEL_SWORD.get());
        basicItem(ModItems.STRONG_BRONZE_AXE.get());
        basicItem(ModItems.STRONG_BRONZE_HOE.get());
        basicItem(ModItems.STRONG_BRONZE_INGOT.get());
        basicItem(ModItems.STRONG_BRONZE_PICKAXE.get());
        basicItem(ModItems.STRONG_BRONZE_SHOVEL.get());
        basicItem(ModItems.STRONG_BRONZE_SWORD.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.TUNGSTEN_INGOT.get());


        withExistingParent(ModItems.DUNE_WRAITH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MANDRAKE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.SAND_SCORPION_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.STONE_GOLEM_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent("desert_lily", modLoc("block/desert_lily"));




        basicItem(ModItems.CHISEL.get());
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

    private void armorItem(Item item, String textureName) {
        getBuilder(ForgeRegistries.ITEMS.getKey(item).getPath())
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", modLoc("item/" + textureName));
    }
}