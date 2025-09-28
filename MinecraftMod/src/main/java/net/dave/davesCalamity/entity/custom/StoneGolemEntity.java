package net.dave.davesCalamity.entity.custom;

import net.dave.davesCalamity.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nullable;

public class StoneGolemEntity extends BasicMonster{
    public final AnimationState attackAnimationState = new AnimationState();
    private int attackAnimationTimeout = 0;

    private static final EntityDataAccessor<Integer> VARIANT =
            SynchedEntityData.defineId(StoneGolemEntity.class, EntityDataSerializers.INT);

    public StoneGolemEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);

        setMaxAnimationTick(10);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(VARIANT, 0); // default to black (coal variant)
    }

    public int getVariant() {
        return this.entityData.get(VARIANT);
    }

    public void setVariant(int variant) {
        this.entityData.set(VARIANT, variant);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Variant", this.getVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.setVariant(tag.getInt("Variant"));
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty,
                                        MobSpawnType reason, @Nullable SpawnGroupData spawnData) {
        super.finalizeSpawn(level, difficulty, reason, spawnData);

        // Weighted variant roll
        int roll = this.random.nextInt(100);
        int variant;
        if (roll < 40) {
            variant = 0; // black (coal)
        } else if (roll < 70) {
            variant = 4; // red (redstone)
        } else if (roll < 90) {
            variant = 2; // green (emerald)
        } else if (roll < 97) {
            variant = 3; // purple (amethyst)
        } else {
            variant = 1; // blue (diamond)
        }

        this.setVariant(variant);

        switch(variant) {
            case 0 -> { // Coal
                this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(40.0D);
                this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(6.0D);
            }
            case 1 -> { // Diamond
                this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(85.0D);
                this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(13.0D);
            }
            case 2 -> { // Emerald
                this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(55.0D);
                this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(8.0D);
            }
            case 3 -> { // Amethyst
                this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(65.0D);
                this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(9.0D);
            }
            case 4 -> { // Redstone
                this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(45.0D);
                this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(7.0D);
            }
        }
        return spawnData;
    }

    @Override
    protected void dropCustomDeathLoot(ServerLevel level, DamageSource source, boolean causedByPlayer) {
        super.dropCustomDeathLoot(level, source, causedByPlayer);

        // Always drop 1–3 stone
        int stoneCount = this.random.nextInt(3) + 1; // 1–3
        this.spawnAtLocation(new ItemStack(Items.STONE, stoneCount));

        // Always drop 1–4 raw silver (replace with your mod’s silver item!)
        int silverCount = this.random.nextInt(4) + 1; // 1–4
        this.spawnAtLocation(new ItemStack(ModItems.RAW_SILVER.get(), silverCount));

        // 0–1 gem depending on variant
        if (this.random.nextFloat() < 0.5f) { // 50% chance to drop a gem
            switch (this.getVariant()) {
                case 0 -> this.spawnAtLocation(Items.COAL);            // Coal Golem
                case 1 -> this.spawnAtLocation(Items.DIAMOND);         // Diamond Golem
                case 2 -> this.spawnAtLocation(Items.EMERALD);         // Emerald Golem
                case 3 -> this.spawnAtLocation(ModItems.PURPLE_GARNET.get());  // Amethyst Golem
                case 4 -> this.spawnAtLocation(Items.REDSTONE);        // Redstone Golem
            }
        }
    }

    @Override
    public boolean checkSpawnRules(LevelAccessor level, MobSpawnType spawnType) {
        BlockPos pos = this.blockPosition();
        BlockPos below = pos.below();

        // Check block below is stone (any variant of the tag "stone_ore_replaceables")
        boolean isStone = level.getBlockState(below).is(BlockTags.STONE_ORE_REPLACEABLES);

        // Must spawn on stone, not in liquid, and in low light like monsters
        return isStone
                && level.getBlockState(pos).isAir()
                && level.getRawBrightness(pos, 0) < 8
                && super.checkSpawnRules(level, spawnType);
    }

    @Override
    public int getMaxSpawnClusterSize() {
        return 3;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 20.0)
                .add(Attributes.MOVEMENT_SPEED, 0.24)
                .add(Attributes.ARMOR, 8.0)
                .add(Attributes.ATTACK_SPEED, 0.6);
    }

    @Override
    public void setupAnimationStates() {
        super.setupAnimationStates(); // keep idle from BasicMonster

        // Attack animation trigger
        if (this.swinging) { // true when doing a melee attack
            if (!this.attackAnimationState.isStarted()) {
                this.attackAnimationState.start(this.tickCount);
                this.attackAnimationTimeout = 24;
            }
        }
        if (this.attackAnimationState.isStarted()) {
            if (--this.attackAnimationTimeout <= 0) {
                this.attackAnimationState.stop();
            }
        }
    }
}
