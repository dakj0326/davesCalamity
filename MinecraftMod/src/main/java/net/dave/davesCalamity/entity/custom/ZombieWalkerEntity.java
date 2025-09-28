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

public class ZombieWalkerEntity extends BasicMonster {
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

    @Override
    public void setupAnimationStates() {
        // Idle cycle
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 58; // ticks
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }

        if (this.isAggressive()) {
            if (!transformed) {
                this.transformAnimationState.startIfStopped(this.tickCount);
                transformed = true;
            } else if (!this.transformAnimationState.isStarted()) {
                this.runAnimationState.startIfStopped(this.tickCount);
            }
        } else {
            if (transformed) {
                if (!this.retransformAnimationState.isStarted()) {
                    this.retransformAnimationState.start(this.tickCount);
                }
                if (!this.retransformAnimationState.isStarted()) {
                    transformed = false;
                }
            }
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }
}
