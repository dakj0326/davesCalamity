package net.dave.davesCalamity.event;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.ModEntities;
import net.dave.davesCalamity.entity.client.DuneWraith.DuneWraithModel;
import net.dave.davesCalamity.entity.client.Mandrake.MandrakeModel;
import net.dave.davesCalamity.entity.client.SandCluster.SandClusterModel;
import net.dave.davesCalamity.entity.client.SandScorpoin.SandScorpionModel;
import net.dave.davesCalamity.entity.client.StoneGolem.StoneGolemModel;
import net.dave.davesCalamity.entity.client.Walker.ZombieWalkerModel;
import net.dave.davesCalamity.entity.custom.*;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DavesCalamity.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MandrakeModel.LAYER_LOCATION, MandrakeModel::createBodyLayer);
        event.registerLayerDefinition(ZombieWalkerModel.LAYER_LOCATION, ZombieWalkerModel::createBodyLayer);
        event.registerLayerDefinition(SandScorpionModel.LAYER_LOCATION, SandScorpionModel::createBodyLayer);
        event.registerLayerDefinition(StoneGolemModel.LAYER_LOCATION, StoneGolemModel::createBodyLayer);
        event.registerLayerDefinition(DuneWraithModel.LAYER_LOCATION, DuneWraithModel::createBodyLayer);
        event.registerLayerDefinition(SandClusterModel.LAYER_LOCATION, SandClusterModel::createBodyLayer);


    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MANDRAKE.get(), MandrakeEntity.createAttributes().build());
        event.put(ModEntities.ZOMBIE_WALKER.get(), ZombieWalkerEntity.createAttributes().build());
        event.put(ModEntities.SAND_SCORPION.get(), SandScorpionEntity.createAttributes().build());
        event.put(ModEntities.STONE_GOLEM.get(), StoneGolemEntity.createAttributes().build()); // ska denna bort?
        event.put(ModEntities.DUNE_WRAITH.get(), DuneWraithEntity.createAttributes().build());
    }
}
