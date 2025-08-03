package net.dave.davesCalamity.recipeTypes;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.recipeTypes.custom.KilnRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeTypes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, DavesCalamity.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, DavesCalamity.MOD_ID);

    public static final RegistryObject<RecipeSerializer<KilnRecipe>> KILN_SERIALIZER =
            SERIALIZERS.register("kiln", () ->
                    new SimpleCookingSerializer<>(
                            (group, category, ingredient, result, experience, cookTime) ->
                                    new KilnRecipe(ModRecipeTypes.KILN_TYPE.get(), group, category, ingredient, result, experience, cookTime),
                            200 // default cook time
                    ));

    public static final RegistryObject<RecipeType<KilnRecipe>> KILN_TYPE =
            TYPES.register("kiln", () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return "davescalamity:kiln";
                }
            });

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}