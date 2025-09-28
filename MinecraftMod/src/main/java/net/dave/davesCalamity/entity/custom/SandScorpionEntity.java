package net.dave.davesCalamity.entity.custom;

import net.dave.davesCalamity.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;


public class SandScorpionEntity extends BasicMonster {


    public SandScorpionEntity(EntityType<? extends BasicMonster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
        setMaxAnimationTick(96);
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
    @Override
    protected void dropCustomDeathLoot(ServerLevel level, DamageSource source, boolean causedByPlayer) {
        super.dropCustomDeathLoot(level, source, causedByPlayer);

        int itemCount = this.random.nextInt(2);
        if (itemCount == 1) {
            this.spawnAtLocation(new ItemStack(ModItems.CHITIN.get(), itemCount));

        }
    }

}
