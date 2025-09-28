package net.dave.davesCalamity.entity.client.DuneWraith;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.custom.DuneWraithEntity;
import net.dave.davesCalamity.entity.custom.StoneGolemEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DuneWraithRenderer extends MobRenderer<DuneWraithEntity, DuneWraithModel<DuneWraithEntity>> {
    public DuneWraithRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DuneWraithModel<>(pContext.bakeLayer(DuneWraithModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation createRenderState(DuneWraithEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID, "textures/entity/dune_wraith.png");
    }

    @Override
    public void render(DuneWraithEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }

    @Override
    protected void scale(DuneWraithEntity entity, PoseStack poseStack, float partialTickTime) {
        poseStack.scale(1.5F, 1.5F, 1.5F); // Scale X, Y, Z by 2x
        super.scale(entity, poseStack, partialTickTime);
    }

}


