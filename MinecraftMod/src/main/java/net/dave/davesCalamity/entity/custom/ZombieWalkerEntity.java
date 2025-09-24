package net.dave.davesCalamity.entity.custom;

import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class ZombieWalkerEntity extends Monster {
    public final AnimationState idleAnimationState = new  AnimationState();
    public final AnimationState attackAnimationState = new AnimationState();
    public final AnimationState runAnimationState = new AnimationState();
    public final AnimationState transformAnimationState = new AnimationState();
    public final AnimationState retransformAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public boolean transformed = false;

    public ZombieWalkerEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }


    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2D, false)); // runs & attacks
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Player.class, 6.0F));

        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 75.0)
                .add(Attributes.FOLLOW_RANGE, 25.0)
                .add(Attributes.MOVEMENT_SPEED, 0.23F)
                .add(Attributes.ATTACK_DAMAGE, 8.0)
                .add(Attributes.ARMOR, 5.0)
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
        // Add AttackSpeed
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 85;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide) {
            this.setupAnimationStates();

            if (this.getTarget() != null && this.getTarget().isAlive()) {
                if (!transformed) {
                    this.transformAnimationState.start(this.tickCount); // force start
                    transformed = true;
                } else if (!this.transformAnimationState.isStarted()) {
                    this.runAnimationState.startIfStopped(this.tickCount);
                }
            } else {
                if (transformed) {
                    this.retransformAnimationState.start(this.tickCount); // force start
                    transformed = false;
                }
            }
        }
    }
}
