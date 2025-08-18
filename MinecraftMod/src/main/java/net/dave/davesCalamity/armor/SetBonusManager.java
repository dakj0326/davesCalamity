package net.dave.davesCalamity.armor;

import com.sun.jna.WString;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;

public class SetBonusManager {
    private String activeKey = null;

    /** Main entry: called when any armor slot changes for this player. */
    public void onArmorChanged(ServerPlayer player) {
        String currentKey = detectFullSetKey(player); // e.g., "bronze_melee", "ranger_leather", or null

        System.out.println("Current key: " + currentKey);

        if (!Objects.equals(currentKey, activeKey)) {
            System.out.println("found that there is a new active key" + activeKey);// State changed → remove old, apply new
            removeCurrentBonus(player);
            if (currentKey != null) applyBonusForKey(player, currentKey);
            activeKey = currentKey;
        }
    }

    private String detectFullSetKey(ServerPlayer player) {
        ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

        if (head.getItem() instanceof ArmorItem ah &&
            chest.getItem() instanceof ArmorItem ac &&
            legs.getItem() instanceof ArmorItem al &&
            feet.getItem() instanceof ArmorItem af) {
            ArmorMaterial material = ah.m_40401_().value();
            boolean fullset = ac.m_40401_().value() == material && al.m_40401_().value() == material && af.m_40401_().value() == material;

            if (fullset) {
                System.out.println("full set is found");
                System.out.println("this is new detected key: " + ArmorSetKeys.keyForMaterial(material));
                return ArmorSetKeys.keyForMaterial(material);
            }
        }
        System.out.println("Should not be here");
        return null;
    }

    private void applyBonusForKey(ServerPlayer player, String key) {
        MobEffectInstance effect = ArmorSetBonuses.effectForKey(key);
        if (effect != null) {
            System.out.println("effect is found");
            player.addEffect(new MobEffectInstance(
                    effect.getEffect(), Integer.MAX_VALUE, effect.getAmplifier(), true, true, true));
        }
    }

    private void removeCurrentBonus(ServerPlayer player) {
        if (activeKey == null) return;
        var effect = ArmorSetBonuses.effectForKey(activeKey);
        if (effect != null) {
            player.removeEffect(effect.getEffect());
        }
    }
}
