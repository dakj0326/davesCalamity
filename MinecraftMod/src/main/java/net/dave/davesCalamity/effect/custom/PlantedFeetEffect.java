package net.dave.davesCalamity.effect.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class PlantedFeetEffect extends MobEffect {
    public PlantedFeetEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x5A6C81); // bluish tint

        this.addAttributeModifier(
                Attributes.KNOCKBACK_RESISTANCE,
                ResourceLocation.fromNamespaceAndPath(MOD_ID, "planted_feet_knockback"),
                1.0D,
                AttributeModifier.Operation.ADD_VALUE
        );
    }
}
