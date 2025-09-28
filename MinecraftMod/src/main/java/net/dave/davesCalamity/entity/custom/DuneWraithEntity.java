package net.dave.davesCalamity.entity.custom;

import net.dave.davesCalamity.block.ModBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class DuneWraithEntity extends BasicMonster implements RangedAttackMob {
    public DuneWraithEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);

        setMaxAnimationTick(24);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 22.0)
                .add(Attributes.FOLLOW_RANGE, 22.0)
                .add(Attributes.MOVEMENT_SPEED, 0.28F)
                .add(Attributes.ATTACK_DAMAGE, 6)
                .add(Attributes.ARMOR, 2)
                .add(Attributes.ATTACK_SPEED, 1f);
    }

    @Override
    protected void registerGoals() {
        // Attack goals
        this.goalSelector.addGoal(2, new RangedAttackGoal(this, 1.0D, 30, 12.0F));
        // shooter, move speed, attack cooldown (ticks), max attack distance

        // Target goals
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));

        // Behavior / movement goals
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 0.8D));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 8.0F));
    }


    @Override
    public void performRangedAttack(LivingEntity pTarget, float pVelocity) {
        SandClusterEntity projectile = new SandClusterEntity(this.level(), this);

        double dx = pTarget.getX() - this.getX();
        double dy = pTarget.getEyeY() - projectile.getY(); // aim for eyes
        double dz = pTarget.getZ() - this.getZ();

        // shoot(directionX, directionY, directionZ, speed, inaccuracy)
        projectile.shoot(dx, dy, dz, 2.0F, 0.5F);

        this.level().addFreshEntity(projectile);
    }

}
