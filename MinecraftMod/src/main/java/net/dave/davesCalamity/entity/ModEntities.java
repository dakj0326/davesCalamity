package net.dave.davesCalamity.entity;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.custom.MandrakeEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DavesCalamity.MOD_ID);

    public static final RegistryObject<EntityType<MandrakeEntity>> MANDRAKE =
            ENTITY_TYPES.register("mandrake", () -> EntityType.Builder.of(MandrakeEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("mandrake")); // Bounding box

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
