package net.dave.davesCalamity.event;

import net.dave.davesCalamity.effect.ModEffects;
import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.ModEntities;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = DavesCalamity.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {


    @SubscribeEvent
    public static void onCriticalHit(CriticalHitEvent event) {
        if (event.getEntity() instanceof LivingEntity attacker) {
            if (attacker.hasEffect(ModEffects.DEADLY_PRECISION.getHolder().get())) {
                // Double the crit damage
                float damageModifier = event.getDamageModifier();
                event.setDamageModifier(damageModifier * 1.75F);
            }
        }
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        LivingEntity victim = event.getEntity();
        Entity sourceEntity = event.getSource().getEntity(); // the "attacker" or projectile
        DamageSource source = event.getSource();

        if (source.getDirectEntity() instanceof AbstractArrow arrow) {
            Entity owner = arrow.getOwner();
            if (owner instanceof LivingEntity shooter) {
                if (shooter.hasEffect(ModEffects.LONGSHOT.getHolder().get())) {
                    MobEffectInstance effect = shooter.getEffect(ModEffects.LONGSHOT.getHolder().get());
                    int amplifier = effect.getAmplifier(); // 0 = level I, 1 = level II, etc.

                    double distance = shooter.distanceTo(event.getEntity());

                    // scale with level
                    float perStep = (amplifier + 1);  // bonus per 5 blocks
                    float bonus = (float)((distance / 5.0) * (1 + perStep / 5.0));

                    // cap also scales with level
                    float cap = 10.0f + perStep;
                    bonus = Math.min(bonus, cap);

                    event.setAmount(event.getAmount() + bonus);
                }
                if (shooter.hasEffect(ModEffects.PINNING_SHOT.getHolder().get())) {
                    int amp = shooter.getEffect(ModEffects.PINNING_SHOT.getHolder().get()).getAmplifier();
                    int roll = shooter.getRandom().nextInt(20) + 1; // 1–20
                    roll += amp;

                    if (roll > 15) {
                        event.getEntity().addEffect(
                                new MobEffectInstance(ModEffects.ROOTED.getHolder().get(), 20, 0) // 2s root
                        );
                    }
                }
            }
        }
        if (victim.hasEffect(ModEffects.THORNED.getHolder().get())) {
            MobEffectInstance effect = victim.getEffect(ModEffects.THORNED.getHolder().get());
            int amp = effect.getAmplifier();

            Entity attacker = event.getSource().getEntity();
            if (attacker instanceof LivingEntity livingAttacker) {
                // Base chance: 15%, +15% per level
                double chance = 0.15 + (0.15 * amp);

                if (victim.getRandom().nextDouble() < chance) {
                    // Damage: 1.0 + amp
                    float dmg = 1.0f + amp;
                    livingAttacker.hurt(victim.damageSources().thorns(victim), dmg);
                }
            }
        }
        if (sourceEntity instanceof LivingEntity attacker) {
            if (attacker.hasEffect(ModEffects.HOLY_STRIKE.getHolder().get())) {
                MobEffectInstance effect = attacker.getEffect(ModEffects.HOLY_STRIKE.getHolder().get());
                int amp = effect.getAmplifier();

                if (victim.getType().is(EntityTypeTags.UNDEAD)) {
                    float bonus = 3 + (2 * amp);
                    event.setAmount(event.getAmount() + bonus);
                }
            }
        }
    }
}