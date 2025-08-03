package net.dave.davesCalamity.recipeTypes.custom;

import net.dave.davesCalamity.recipeTypes.ModRecipeTypes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class KilnRecipe extends AbstractCookingRecipe {
    public KilnRecipe(RecipeType<?> type, String group, CookingBookCategory category,
                      Ingredient ingredient, ItemStack result, float experience, int cookingTime) {
        super(type, group, category, ingredient, result, experience, cookingTime);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeTypes.KILN_SERIALIZER.get();
    }
}