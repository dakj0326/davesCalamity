package net.dave.davesCalamity.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class SandScorpionEntity extends BasicMonster {
    public final AnimationState idleAnimationState = new AnimationState();

    private int idleAnimationTimeout = 0;

    public SandScorpionEntity(EntityType<? extends BasicMonster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 18.0)
                .add(Attributes.FOLLOW_RANGE, 35.0)
                .add(Attributes.MOVEMENT_SPEED, 0.34F)
                .add(Attributes.ATTACK_DAMAGE, 5.5)
                .add(Attributes.ARMOR, 4.0)
                .add(Attributes.ATTACK_SPEED, 2f);
    }

    private void setupAnimationStates() {
        // Idle cycle
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 58; // ticks
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
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
