package net.dave.davesCalamity.entity.custom;

import net.dave.davesCalamity.entity.ModEntities;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class SandClusterEntity extends AbstractArrow {

    public SandClusterEntity(EntityType<? extends SandClusterEntity> type, Level level) {
        super(type, level);
        this.setBaseDamage(4.0D); // adjust damage
        this.pickup = Pickup.DISALLOWED; // no item drop
    }

    // Constructor for mobs (like your Dune Wraith shooting it)
    public SandClusterEntity(Level level, LivingEntity shooter) {
        super(ModEntities.SAND_CLUSTER.get(), shooter, level, ItemStack.EMPTY, null);
        this.setBaseDamage(9.0D);
        this.pickup = Pickup.DISALLOWED;
    }

    @Override
    protected void tickDespawn() {
        // Vanish after 4 seconds if it doesn't hit anything
        if (this.tickCount > 80) {
            this.discard();
        }
        super.tickDespawn();
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);
        this.discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult result) {
        super.onHitBlock(result);
        this.discard();
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return null;
    }
}
