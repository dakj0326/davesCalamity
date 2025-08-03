package net.dave.davesCalamity.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class CokeItem extends Item {
    private int burnTime = 0;

    public CokeItem(Properties pProperties, int brunTime) {
        super(pProperties);
        this.burnTime = brunTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }
}
