package net.dave.davesCalamity.datagen;



import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

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

        // Pickaxe Crafting
        pickaxe(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_PICKAXE.get(), RecipeCategory.TOOLS, pRecipeOutput);
        pickaxe(ModItems.STRONG_BRONZE_INGOT.get(), ModItems.STRONG_BRONZE_PICKAXE.get(), RecipeCategory.TOOLS, pRecipeOutput);
        pickaxe(ModItems.STEEL_INGOT.get(), ModItems.STEEL_PICKAXE.get(), RecipeCategory.TOOLS, pRecipeOutput);

        // Smelting
        smelt(ModItems.RAW_ALUMINIUM.get(), ModItems.ALUMINIUM_INGOT.get(), RecipeCategory.MISC, 0.5f, 200, pRecipeOutput);
        smelt(ModItems.RAW_SILVER.get(), ModItems.SILVER_INGOT.get(), RecipeCategory.MISC, 0.7f, 200, pRecipeOutput);
        smelt(ModItems.RAW_TIN.get(), ModItems.TIN_INGOT.get(), RecipeCategory.MISC, 0.3f, 200, pRecipeOutput);
        smelt(ModItems.RAW_TUNGSTEN.get(), ModItems.TUNGSTEN_INGOT.get(), RecipeCategory.MISC, 0.5f, 200, pRecipeOutput);

        // Blasting
        blast(ModItems.RAW_ALUMINIUM.get(), ModItems.ALUMINIUM_INGOT.get(), RecipeCategory.MISC, 0.5f, 100, "blasting_aluminium_ingot", pRecipeOutput);
        blast(ModItems.RAW_SILVER.get(), ModItems.SILVER_INGOT.get(), RecipeCategory.MISC, 0.7f, 100, "blasting_silver_ingot", pRecipeOutput);
        blast(ModItems.RAW_TIN.get(), ModItems.TIN_INGOT.get(), RecipeCategory.MISC, 0.3f, 100, "blasting_tin_ingot", pRecipeOutput);
        blast(ModItems.RAW_TUNGSTEN.get(), ModItems.TUNGSTEN_INGOT.get(), RecipeCategory.MISC, 0.5f, 100, "blasting_tungsten_ingot", pRecipeOutput);




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
    protected static void pickaxe(ItemLike input, ItemLike output, RecipeCategory category, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', input)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput);
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
