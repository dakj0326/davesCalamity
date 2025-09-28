package net.dave.davesCalamity.event;

import net.dave.davesCalamity.DavesCalamity;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.dave.davesCalamity.entity.ModEntities;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraft.world.entity.animal.Animal;


@Mod.EventBusSubscriber(modid = DavesCalamity.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(
                ModEntities.SAND_SCORPION.get(),
                net.minecraft.world.entity.SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkAnyLightMonsterSpawnRules,
                SpawnPlacementRegisterEvent.Operation.REPLACE
        );
        event.register(
                ModEntities.STONE_GOLEM.get(),
                net.minecraft.world.entity.SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                (type, level, spawnType, pos, random) ->
                        Monster.checkMonsterSpawnRules(type, level, spawnType, pos, random),
                SpawnPlacementRegisterEvent.Operation.REPLACE
        );
        event.register(
                ModEntities.DUNE_WRAITH.get(),
                net.minecraft.world.entity.SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkAnyLightMonsterSpawnRules,
                SpawnPlacementRegisterEvent.Operation.REPLACE
        );
        event.register(
                ModEntities.MANDRAKE.get(),
                net.minecraft.world.entity.SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules,
                SpawnPlacementRegisterEvent.Operation.REPLACE
        );
    }
}

