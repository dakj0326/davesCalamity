package net.dave.davesCalamity;

import net.minecraft.world.entity.monster.Creeper;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.entity.Entity;

import java.util.List;

@Mod.EventBusSubscriber(modid = "davescalamity")
public class ChainCreeperExplosion {
    @SubscribeEvent
    public static void onExplosionDetonate(ExplosionEvent.Detonate event) {
        List<Entity> affectedEntities = event.getAffectedEntities();

        for (Entity entity : affectedEntities) {
            if (entity instanceof Creeper) {
                ((Creeper) entity).ignite();
                entity.setInvulnerable(true); // NOTE: This is kinda hacky, but it works :)
            }
        }
    }
}
