package net.dave.davesCalamity.menu.custom;

import net.dave.davesCalamity.menu.ModMenuTypes;
import net.dave.davesCalamity.recipeTypes.ModRecipeTypes;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;

public class KilnMenu extends AbstractFurnaceMenu {
    public KilnMenu(int containerId, Inventory playerInventory, Container furnaceContainer, ContainerData data) {
        super(ModMenuTypes.KILN.get(), ModRecipeTypes.KILN_TYPE.get(), RecipeBookType.FURNACE, containerId, playerInventory, furnaceContainer, data);

        this.addSlot(new Slot(furnaceContainer, 0, 56, 17)); // Input
        this.addSlot(new Slot(furnaceContainer, 1, 56, 53) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return net.minecraftforge.common.ForgeHooks.getBurnTime(stack, ModRecipeTypes.KILN_TYPE.get()) > 0;
            }
        });
        this.addSlot(new FurnaceResultSlot(playerInventory.player, furnaceContainer, 2, 116, 35)); // Output

        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }

        // Add hotbar (1 row of 9 slots)
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142));
        }

    }

    // Optional: constructor for client-side opening via buffer
    public KilnMenu(int containerId, Inventory playerInventory) {
        this(containerId, playerInventory, new SimpleContainer(3), new SimpleContainerData(4));
    }
}
