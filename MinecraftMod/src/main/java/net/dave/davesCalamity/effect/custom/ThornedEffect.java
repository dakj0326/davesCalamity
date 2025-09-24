package net.dave.davesCalamity.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "davescalamity")
public class ThornedEffect extends MobEffect {
    public ThornedEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x228B22); // forest green
    }
}