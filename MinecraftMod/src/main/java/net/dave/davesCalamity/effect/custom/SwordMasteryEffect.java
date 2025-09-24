package net.dave.davesCalamity.effect.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.SwordItem;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class SwordMasteryEffect extends MobEffect {

    private static final ResourceLocation SWORD_BONUS_ID =
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "sword_mastery_bonus");

    public SwordMasteryEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xCC0000); // deep red
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true; // run every tick
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        var attr = entity.getAttribute(Attributes.ATTACK_DAMAGE);
        if (attr == null) return false;

        // Always remove previous modifier first
        attr.removeModifier(SWORD_BONUS_ID);

        // Only apply while holding a sword
        if (entity.getMainHandItem().getItem() instanceof SwordItem) {
            attr.addTransientModifier(new AttributeModifier(
                    SWORD_BONUS_ID,
                    2.0D * (amplifier + 1), // flat bonus per level
                    AttributeModifier.Operation.ADD_VALUE
            ));
        }

        return true;
    }

    @Override
    public void onMobRemoved(LivingEntity entity, int amplifier, Entity.RemovalReason reason) {
        var attr = entity.getAttribute(Attributes.ATTACK_DAMAGE);
        if (attr != null) {
            attr.removeModifier(SWORD_BONUS_ID);
        }
        super.onMobRemoved(entity, amplifier, reason);
    }
}
