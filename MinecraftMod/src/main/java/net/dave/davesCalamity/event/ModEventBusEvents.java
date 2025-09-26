package net.dave.davesCalamity.event;

import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.ModEntities;
import net.dave.davesCalamity.entity.client.Mandrake.MandrakeModel;
import net.dave.davesCalamity.entity.client.SandScorpoin.SandScorpionModel;
import net.dave.davesCalamity.entity.client.Walker.ZombieWalkerModel;
import net.dave.davesCalamity.entity.custom.MandrakeEntity;
import net.dave.davesCalamity.entity.custom.SandScorpionEntity;
import net.dave.davesCalamity.entity.custom.ZombieWalkerEntity;
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
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MANDRAKE.get(), MandrakeEntity.createAttributes().build());
        event.put(ModEntities.ZOMBIE_WALKER.get(), ZombieWalkerEntity.createAttributes().build());
        event.put(ModEntities.SAND_SCORPION.get(), SandScorpionEntity.createAttributes().build());
    }
}
