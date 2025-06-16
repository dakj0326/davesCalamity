package net.dave.davesCalamity.item;

import net.dave.davesCalamity.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier BRONZE = new ForgeTier(
            169,
            4.5f,
            1.3f,
            8,
            ModTags.Blocks.NEEDS_BRONZE_TOOL,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL
    );
    public static final Tier STRONG_BRONZE = new ForgeTier(
            214,
            5.5f,
            1.7f,
            10,
            ModTags.Blocks.NEEDS_STRONG_BRONZE_TOOL,
            () -> Ingredient.of(ModItems.STRONG_BRONZE_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_STRONG_BRONZE_TOOL
    );
    public static final Tier STEEL = new ForgeTier(
            532,
            7.0f,
            2.5f,
            5,
            ModTags.Blocks.NEEDS_STEEL_TOOL,
            () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL
    );




}
