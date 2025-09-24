package net.dave.davesCalamity.effect.custom;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.util.UUID;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class HeavyStanceEffect extends MobEffect {
    public HeavyStanceEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x5A6C81); // bluish tint

        this.addAttributeModifier(
                Attributes.KNOCKBACK_RESISTANCE,
                ResourceLocation.fromNamespaceAndPath(MOD_ID, "heavy_stance_knockback"),
                0.5D,  // +0.5 knockback resistance
                AttributeModifier.Operation.ADD_VALUE
        );
    }
}
