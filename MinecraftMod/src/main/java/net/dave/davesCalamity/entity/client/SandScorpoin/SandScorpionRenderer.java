package net.dave.davesCalamity.entity.client.SandScorpoin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.custom.SandScorpionEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SandScorpionRenderer extends MobRenderer<SandScorpionEntity, SandScorpionModel<SandScorpionEntity>> {
    public SandScorpionRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SandScorpionModel<>(pContext.bakeLayer(SandScorpionModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation createRenderState(SandScorpionEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID, "textures/entity/sand_scorpion.png");
    }

    @Override
    public void render(SandScorpionEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
