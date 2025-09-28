package net.dave.davesCalamity.entity.client.SandCluster;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dave.davesCalamity.DavesCalamity;

import net.dave.davesCalamity.entity.custom.SandClusterEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class SandClusterRenderer extends EntityRenderer<SandClusterEntity> {
    private final SandClusterModel<SandClusterEntity> model;

    public SandClusterRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        this.model = new SandClusterModel<>(pContext.bakeLayer(SandClusterModel.LAYER_LOCATION));

    }

    @Override
    public ResourceLocation createRenderState(SandClusterEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID, "textures/entity/projectile/sand_cluster.png");
    }

    @Override
    public void render(SandClusterEntity entity, float yaw, float partialTicks,
                       PoseStack poseStack, MultiBufferSource buffer, int light) {
        poseStack.pushPose();

        // Grab a VertexConsumer with your texture
        VertexConsumer vertexconsumer = buffer.getBuffer(RenderType.entityTranslucent(createRenderState(entity)));

        // Render the model
        model.renderToBuffer(poseStack, vertexconsumer, light, OverlayTexture.NO_OVERLAY);

        poseStack.popPose();
        super.render(entity, yaw, partialTicks, poseStack, buffer, light);
    }
}