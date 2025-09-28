package net.dave.davesCalamity.entity;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.custom.*;
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

    public static final RegistryObject<EntityType<ZombieWalkerEntity>> ZOMBIE_WALKER =
            ENTITY_TYPES.register("zombie_walker", () -> EntityType.Builder.of(ZombieWalkerEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 1.95f).build("zombie_walker")); // Bounding box
    public static final RegistryObject<EntityType<SandScorpionEntity>> SAND_SCORPION =
            ENTITY_TYPES.register("sand_scorpion", () -> EntityType.Builder.of(SandScorpionEntity::new, MobCategory.MONSTER)
                    .sized(0.8f, 0.28f).build("sand_scorpion")); // Bounding box
    public static final RegistryObject<EntityType<StoneGolemEntity>> STONE_GOLEM =
            ENTITY_TYPES.register("stone_golem", () -> EntityType.Builder.of(StoneGolemEntity::new, MobCategory.MONSTER)
                    .sized(1.5f, 2.4f).build("stone_golem")); // Bounding box
    public static final RegistryObject<EntityType<DuneWraithEntity>> DUNE_WRAITH =
            ENTITY_TYPES.register("dune_wraith", () -> EntityType.Builder.of(DuneWraithEntity::new, MobCategory.MONSTER)
                    .sized(0.8f, 2.4f).build("dune_wraith")); // Bounding box
    public static final RegistryObject<EntityType<SandClusterEntity>> SAND_CLUSTER =
            ENTITY_TYPES.register("sand_cluster", () -> EntityType.Builder.<SandClusterEntity>of(SandClusterEntity::new, MobCategory.MISC)
                            .sized(0.25F, 0.25F) // hitbox size
                            .clientTrackingRange(4) // how far clients can see it
                            .updateInterval(10) // how often to sync position
                            .build("sand_cluster"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
