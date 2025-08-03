package net.dave.davesCalamity.menu;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.menu.custom.KilnMenu;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, DavesCalamity.MOD_ID);

    public static final RegistryObject<MenuType<KilnMenu>> KILN =
            MENUS.register("kiln", () ->
                    new MenuType<>(KilnMenu::new, FeatureFlags.VANILLA_SET) // constructor from FriendlyByteBuf
            );

    public static void register(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}

