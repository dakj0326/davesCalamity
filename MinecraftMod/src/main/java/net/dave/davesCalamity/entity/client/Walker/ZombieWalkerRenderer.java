package net.dave.davesCalamity.entity.client.Walker;

import com.mojang.blaze3d.vertex.PoseStack;
import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.custom.ZombieWalkerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ZombieWalkerRenderer extends MobRenderer<ZombieWalkerEntity, ZombieWalkerModel<ZombieWalkerEntity>> {

    public ZombieWalkerRenderer(EntityRendererProvider.Context context) {
        super(context, new ZombieWalkerModel<>(context.bakeLayer(ZombieWalkerModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation createRenderState(ZombieWalkerEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID, "textures/entity/zombie_walker.png");
    }

    @Override
    public void render(ZombieWalkerEntity entity, float entityYaw, float partialTicks,
                       PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
