package net.dave.davesCalamity.datagen;



import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void m_245200_(RecipeOutput pRecipeOutput) {

        //Shapeless Single Crafting
        shapelessSingle(ModBlocks.ALUMINIUM_BLOCK.get(), ModItems.ALUMINIUM_INGOT.get(), RecipeCategory.MISC, 9, "aluminium_ingot_from_block", pRecipeOutput);
        shapelessSingle(ModBlocks.BRONZE_BLOCK.get(), ModItems.BRONZE_INGOT.get(), RecipeCategory.MISC, 9, "bronze_ingot_from_block", pRecipeOutput);
        shapelessSingle(ModBlocks.RAW_ALUMINIUM_BLOCK.get(), ModItems.RAW_ALUMINIUM.get(), RecipeCategory.MISC, 9, pRecipeOutput);
        shapelessSingle(ModBlocks.RAW_SILVER_BLOCK.get(), ModItems.RAW_SILVER.get(), RecipeCategory.MISC, 9, pRecipeOutput);
        shapelessSingle(ModBlocks.RAW_TIN_BLOCK.get(), ModItems.RAW_TIN.get(), RecipeCategory.MISC, 9, pRecipeOutput);
        shapelessSingle(ModBlocks.RAW_TUNGSTEN_BLOCK.get(), ModItems.RAW_TUNGSTEN.get(), RecipeCategory.MISC, 9, pRecipeOutput);
        shapelessSingle(ModBlocks.SILVER_BLOCK.get(), ModItems.SILVER_INGOT.get(), RecipeCategory.MISC, 9, "silver_ingot_from_block", pRecipeOutput);
        shapelessSingle(ModBlocks.STEEL_BLOCK.get(), ModItems.STEEL_INGOT.get(), RecipeCategory.MISC, 9, "steel_ingot_from_block", pRecipeOutput);
        shapelessSingle(ModBlocks.STRONG_BRONZE_BLOCK.get(), ModItems.STRONG_BRONZE_INGOT.get(), RecipeCategory.MISC, 9, "strong_bronze_ingot_from_block", pRecipeOutput);
        shapelessSingle(ModBlocks.TIN_BLOCK.get(), ModItems.TIN_INGOT.get(), RecipeCategory.MISC, 9, "tin_ingot_from_block", pRecipeOutput);
        shapelessSingle(ModBlocks.TUNGSTEN_BLOCK.get(), ModItems.TUNGSTEN_INGOT.get(), RecipeCategory.MISC, 9, "tungsten_ingot_from_block", pRecipeOutput);
        shapelessSingle(ModBlocks.DESERT_LILY.get(), Items.MAGENTA_DYE, RecipeCategory.MISC, 2, "magenta_dye_from_desert_lily", pRecipeOutput);
        shapelessSingle(ModBlocks.BLOOMING_CACTUS.get(), Items.LIME_DYE, RecipeCategory.MISC, 1, "lime_dye_from_blooming_cactus", pRecipeOutput);
        shapelessSingle(ModBlocks.SMALL_CACTUS.get(), Items.LIME_DYE, RecipeCategory.MISC, 1, "lime_dye_from_small_cactus", pRecipeOutput);
        shapelessSingle(ModItems.CHITIN.get(), ModItems.CHITIN_POWDER.get(), RecipeCategory.MISC, 1, "chitin_powder_from_chitin", pRecipeOutput);

        doubleItem(ModItems.CHITIN.get(), Items.LEATHER, ModItems.REINFORCED_LEATHER.get(), 1, RecipeCategory.MISC, pRecipeOutput);

        // Full Block Crafting
        fullBlock(ModItems.RAW_ALUMINIUM.get(), ModBlocks.RAW_ALUMINIUM_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.RAW_SILVER.get(), ModBlocks.RAW_SILVER_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.RAW_TIN.get(), ModBlocks.RAW_TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.RAW_TUNGSTEN.get(), ModBlocks.RAW_TUNGSTEN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.ALUMINIUM_INGOT.get(), ModBlocks.ALUMINIUM_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.BRONZE_INGOT.get(), ModBlocks.BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.SILVER_INGOT.get(), ModBlocks.SILVER_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.STEEL_INGOT.get(), ModBlocks.STEEL_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.STRONG_BRONZE_INGOT.get(), ModBlocks.STRONG_BRONZE_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.TIN_INGOT.get(), ModBlocks.TIN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);
        fullBlock(ModItems.TUNGSTEN_INGOT.get(), ModBlocks.TUNGSTEN_BLOCK.get(), RecipeCategory.BUILDING_BLOCKS, pRecipeOutput);


        // Tools Crafting
        pickaxe(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_PICKAXE.get(), RecipeCategory.TOOLS, pRecipeOutput);
        pickaxe(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_PICKAXE.get(), RecipeCategory.TOOLS, pRecipeOutput);
        pickaxe(ModItems.STEEL_INGOT.get(), ModItems.STEEL_PICKAXE.get(), RecipeCategory.TOOLS, pRecipeOutput);

        axe(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_AXE.get(), RecipeCategory.TOOLS, pRecipeOutput);
        axe(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_AXE.get(), RecipeCategory.TOOLS, pRecipeOutput);
        axe(ModItems.STEEL_INGOT.get(), ModItems.STEEL_AXE.get(), RecipeCategory.TOOLS, pRecipeOutput);

        hoe(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_HOE.get(), RecipeCategory.TOOLS, pRecipeOutput);
        hoe(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_HOE.get(), RecipeCategory.TOOLS, pRecipeOutput);
        hoe(ModItems.STEEL_INGOT.get(), ModItems.STEEL_HOE.get(), RecipeCategory.TOOLS, pRecipeOutput);

        shovel(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_SHOVEL.get(), RecipeCategory.TOOLS, pRecipeOutput);
        shovel(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_SHOVEL.get(), RecipeCategory.TOOLS, pRecipeOutput);
        shovel(ModItems.STEEL_INGOT.get(), ModItems.STEEL_SHOVEL.get(), RecipeCategory.TOOLS, pRecipeOutput);

        sword(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_SWORD.get(), RecipeCategory.TOOLS, pRecipeOutput);
        sword(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_SWORD.get(), RecipeCategory.TOOLS, pRecipeOutput);
        sword(ModItems.STEEL_INGOT.get(), ModItems.STEEL_SWORD.get(), RecipeCategory.TOOLS, pRecipeOutput);

        // Armor
        helmet(ModItems.ALUMINIUM_INGOT.get(), ModItems.ALUMINIUM_INGOT.get(), ModItems.ALUMINIUM_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);
        helmet(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);
        helmet(ModItems.TIN_INGOT.get(), ModItems.TIN_INGOT.get(), ModItems.TIN_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);
        helmet(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);
        helmet(ModItems.SILVER_INGOT.get(), ModItems.PURPLE_GARNET.get(), ModItems.SILVER_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);
        helmet(ModItems.STEEL_INGOT.get(), ModItems.PURPLE_GARNET.get(), ModItems.STEEL_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);
        helmet(ModItems.TUNGSTEN_INGOT.get(), ModItems.TUNGSTEN_INGOT.get(), ModItems.TUNGSTEN_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);
        helmet(ModItems.CHITIN.get(), ModItems.CHITIN.get(), ModItems.CHITIN_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);
        helmet(ModItems.REINFORCED_LEATHER.get(), ModItems.REINFORCED_LEATHER.get(), ModItems.REINFORCED_LEATHER_HELMET.get(), RecipeCategory.COMBAT, pRecipeOutput);

        chestplate(ModItems.ALUMINIUM_INGOT.get(), ModItems.ALUMINIUM_INGOT.get(), ModItems.ALUMINIUM_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);
        chestplate(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);
        chestplate(ModItems.TIN_INGOT.get(), ModItems.TIN_INGOT.get(), ModItems.TIN_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);
        chestplate(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);
        chestplate(ModItems.SILVER_INGOT.get(), ModItems.PURPLE_GARNET.get(), ModItems.SILVER_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);
        chestplate(ModItems.STEEL_INGOT.get(), ModItems.PURPLE_GARNET.get(), ModItems.STEEL_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);
        chestplate(ModItems.TUNGSTEN_INGOT.get(), ModItems.TUNGSTEN_INGOT.get(), ModItems.TUNGSTEN_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);
        chestplate(ModItems.CHITIN.get(), ModItems.BRONZE_INGOT.get(), ModItems.CHITIN_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);
        chestplate(ModItems.REINFORCED_LEATHER.get(), ModItems.STRONG_BRONZE_INGOT.get(), ModItems.REINFORCED_LEATHER_CHESTPLATE.get(), RecipeCategory.COMBAT, pRecipeOutput);

        leggings(ModItems.ALUMINIUM_INGOT.get(), ModItems.ALUMINIUM_INGOT.get(), ModItems.ALUMINIUM_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        leggings(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        leggings(ModItems.TIN_INGOT.get(), ModItems.TIN_INGOT.get(), ModItems.TIN_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        leggings(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        leggings(ModItems.SILVER_INGOT.get(), ModItems.PURPLE_GARNET.get(), ModItems.SILVER_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        leggings(ModItems.STEEL_INGOT.get(), ModItems.PURPLE_GARNET.get(), ModItems.STEEL_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        leggings(ModItems.TUNGSTEN_INGOT.get(), ModItems.TUNGSTEN_INGOT.get(), ModItems.TUNGSTEN_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        leggings(ModItems.CHITIN.get(), ModItems.CHITIN.get(), ModItems.CHITIN_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        leggings(ModItems.REINFORCED_LEATHER.get(), ModItems.REINFORCED_LEATHER.get(), ModItems.REINFORCED_LEATHER_LEGGINGS.get(), RecipeCategory.COMBAT, pRecipeOutput);

        boots(ModItems.ALUMINIUM_INGOT.get(), ModItems.ALUMINIUM_INGOT.get(), ModItems.ALUMINIUM_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        boots(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        boots(ModItems.TIN_INGOT.get(), ModItems.TIN_INGOT.get(), ModItems.TIN_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        boots(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        boots(ModItems.SILVER_INGOT.get(), ModItems.PURPLE_GARNET.get(), ModItems.SILVER_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        boots(ModItems.STEEL_INGOT.get(), ModItems.PURPLE_GARNET.get(), ModItems.STEEL_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        boots(ModItems.TUNGSTEN_INGOT.get(), ModItems.TUNGSTEN_INGOT.get(), ModItems.TUNGSTEN_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        boots(ModItems.CHITIN.get(), ModItems.CHITIN.get(), ModItems.CHITIN_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);
        boots(ModItems.REINFORCED_LEATHER.get(), ModItems.REINFORCED_LEATHER.get(), ModItems.REINFORCED_LEATHER_BOOTS.get(), RecipeCategory.COMBAT, pRecipeOutput);


        // Smelting
        smelt(ModItems.RAW_ALUMINIUM.get(), ModItems.ALUMINIUM_INGOT.get(), RecipeCategory.MISC, 0.5f, 200, pRecipeOutput);
        smelt(ModItems.RAW_SILVER.get(), ModItems.SILVER_INGOT.get(), RecipeCategory.MISC, 0.7f, 200, pRecipeOutput);
        smelt(ModItems.RAW_TIN.get(), ModItems.TIN_INGOT.get(), RecipeCategory.MISC, 0.3f, 200, pRecipeOutput);
        smelt(ModItems.RAW_TUNGSTEN.get(), ModItems.TUNGSTEN_INGOT.get(), RecipeCategory.MISC, 0.5f, 200, pRecipeOutput);
        smelt(Items.COAL, ModItems.COKE.get(), RecipeCategory.MISC, 0.5f, 400, "smelting_coal_to_coke", pRecipeOutput);


        // Blasting
        blast(ModItems.RAW_ALUMINIUM.get(), ModItems.ALUMINIUM_INGOT.get(), RecipeCategory.MISC, 0.5f, 100, "blasting_aluminium_ingot", pRecipeOutput);
        blast(ModItems.RAW_SILVER.get(), ModItems.SILVER_INGOT.get(), RecipeCategory.MISC, 0.7f, 100, "blasting_silver_ingot", pRecipeOutput);
        blast(ModItems.RAW_TIN.get(), ModItems.TIN_INGOT.get(), RecipeCategory.MISC, 0.3f, 100, "blasting_tin_ingot", pRecipeOutput);
        blast(ModItems.RAW_TUNGSTEN.get(), ModItems.TUNGSTEN_INGOT.get(), RecipeCategory.MISC, 0.5f, 100, "blasting_tungsten_ingot", pRecipeOutput);
        blast(Items.COAL, ModItems.COKE.get(), RecipeCategory.MISC, 0.5f, 200, "blasting_coal_to_coke", pRecipeOutput);

        // Alloys
        simpleAlloy(Items.COPPER_INGOT, ModItems.TIN_INGOT.get(), ModItems.BRONZE_INGOT.get(), RecipeCategory.MISC, pRecipeOutput);
        simpleAlloy(Items.IRON_INGOT, ModItems.COKE.get(), ModItems.STEEL_INGOT.get(), RecipeCategory.MISC, pRecipeOutput);
        advancedAlloy(Items.COPPER_INGOT, ModItems.SILVER_INGOT.get(), ModItems.ALUMINIUM_INGOT.get(), ModItems.STRONG_BRONZE_INGOT.get(), RecipeCategory.MISC, pRecipeOutput);


        // TESTING
        stairBuilder(ModBlocks.TEST_STAIR.get(), Ingredient.of(ModItems.STEEL_INGOT.get())).group("test").unlockedBy(
                getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())
        ).save(pRecipeOutput);

        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEST_SLAB.get(), ModItems.STEEL_INGOT.get());

        //pallade inte fixa alla. Här är principerna för skiten.
        /*
        buttonBuilder(ModBlocks.ALEXANDRITE_BUTTON.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get(), ModItems.ALEXANDRITE.get());

        fenceBuilder(ModBlocks.ALEXANDRITE_FENCE.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.ALEXANDRITE_FENCE_GATE.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALEXANDRITE_WALL.get(), ModItems.ALEXANDRITE.get());

        doorBuilder(ModBlocks.ALEXANDRITE_DOOR.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.ALEXANDRITE_TRAPDOOR.get(), Ingredient.of(ModItems.ALEXANDRITE.get())).group("alexandrite")
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
         */

    }

    protected static void smelt(ItemLike input, ItemLike output, RecipeCategory category, float exp, int duration, String name, RecipeOutput recipeOutput) {
        // With custom name
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), category, output, exp, duration
                ).unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, DavesCalamity.MOD_ID + ":" + name);
    }
    protected static void blast(ItemLike input, ItemLike output, RecipeCategory category, float exp, int duration, String name, RecipeOutput recipeOutput) {
        // With custom name
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), category, output, exp, duration
                ).unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, DavesCalamity.MOD_ID + ":" + name);
    }
    protected static void smelt(ItemLike input, ItemLike output, RecipeCategory category, float exp, int duration, RecipeOutput recipeOutput) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), category, output, exp, duration
                ).unlockedBy(getHasName(input), has(input))
                .save(recipeOutput);
    }
    protected static void blast(ItemLike input, ItemLike output, RecipeCategory category, float exp, int duration, RecipeOutput recipeOutput) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), category, output, exp, duration
                ).unlockedBy(getHasName(input), has(input))
                .save(recipeOutput);
    }

    protected static void fullBlock(ItemLike input, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }
    protected static void helmet(ItemLike item_1, ItemLike item_2, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("ABA")
                .pattern("A A")
                .pattern("   ")
                .define('A', item_1)
                .define('B', item_2)
                .unlockedBy(getHasName(item_1), has(item_1)).save(recipeOutput);
    }
    protected static void chestplate(ItemLike item_1, ItemLike item_2, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("B B")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', item_1)
                .define('B', item_2)
                .unlockedBy(getHasName(item_1), has(item_1)).save(recipeOutput);
    }
    protected static void leggings(ItemLike item_1, ItemLike item_2, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AAA")
                .pattern("B B")
                .pattern("A A")
                .define('A', item_1)
                .define('B', item_2)
                .unlockedBy(getHasName(item_1), has(item_1)).save(recipeOutput);
    }
    protected static void boots(ItemLike item_1, ItemLike item_2, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("A A")
                .pattern("B B")
                .pattern("   ")
                .define('A', item_1)
                .define('B', item_2)
                .unlockedBy(getHasName(item_1), has(item_1)).save(recipeOutput);
    }

    protected static void pickaxe(ItemLike input, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }
    protected static void axe(ItemLike input, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("BB ")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }
    protected static void hoe(ItemLike input, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("BB ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }

    protected static void shovel(ItemLike input, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }

    protected static void sword(ItemLike input, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }


    protected static void simpleAlloy(ItemLike item_1, ItemLike item_2, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, 6)
                .pattern("BBB")
                .pattern("BAA")
                .pattern("AA ")
                .define('A', item_2)
                .define('B', item_1)
                .unlockedBy(getHasName(item_1), has(item_1)).save(recipeOutput);
    }

    protected static void advancedAlloy(ItemLike item_1, ItemLike item_2, ItemLike item_3, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, 6)
                .pattern("BBA")
                .pattern("BAC")
                .pattern("ACC")
                .define('A', item_1)
                .define('B', item_2)
                .define('C', item_3)
                .unlockedBy(getHasName(item_1), has(item_1)).save(recipeOutput);
    }
    protected static void doubleItem(ItemLike item_1, ItemLike item_2, ItemLike output, int outputAmount, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output, outputAmount)
                .pattern("   ")
                .pattern("AB ")
                .pattern("   ")
                .define('A', item_1)
                .define('B', item_2)
                .unlockedBy(getHasName(item_1), has(item_1)).save(recipeOutput);
    }


    protected static void shapelessSingle(ItemLike input, ItemLike output, RecipeCategory category, int outputCount, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(category, output, outputCount)
                .requires(input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput);
    }

    protected static void shapelessSingle(ItemLike input, ItemLike output, RecipeCategory category, int outputCount, String name, RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(category, output, outputCount)
                .requires(input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, DavesCalamity.MOD_ID + ":" +name);
    }





    /*
    Vet inte varför vi har dessa funktioner men vågar inte ta bort dom än.
    De tar en lista av items som alla ger samma output och samma antal.
    Skapa en lista enligt exempel nedan och använd det som argument för parameter List<ItemLike> pIngredients


        List<ItemLike> ALEXANDRITE_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE.get(),
                ModBlocks.ALEXANDRITE_ORE.get(), ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());

    */


    protected static void oreListSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreListCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreListBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreListCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreListCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, DavesCalamity.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
