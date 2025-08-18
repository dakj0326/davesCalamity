package net.dave.davesCalamity.event;

import net.dave.davesCalamity.armor.SetBonusManagers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "davescalamity", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SetBonusEvents {

    @SubscribeEvent
    public static void onArmorChange(LivingEquipmentChangeEvent e) {
        if (!(e.getEntity() instanceof ServerPlayer sp)) return;
        // Only care about humanoid armor slots
        if (e.getSlot().getType() != EquipmentSlot.Type.HUMANOID_ARMOR) return;
        SetBonusManagers.of(sp).onArmorChanged(sp);
    }

    @SubscribeEvent
    public static void onLogin(PlayerEvent.PlayerLoggedInEvent e) {
        if (e.getEntity() instanceof ServerPlayer sp) {
            SetBonusManagers.of(sp).onArmorChanged(sp); // evaluate on join
        }
    }

    @SubscribeEvent
    public static void onRespawn(PlayerEvent.PlayerRespawnEvent e) {
        if (e.getEntity() instanceof ServerPlayer sp) {
            SetBonusManagers.of(sp).onArmorChanged(sp); // re-evaluate after death
        }
    }

    @SubscribeEvent
    public static void onLogout(PlayerEvent.PlayerLoggedOutEvent e) {
        if (e.getEntity() instanceof ServerPlayer sp) {
            SetBonusManagers.remove(sp); // cleanup
        }
    }
}