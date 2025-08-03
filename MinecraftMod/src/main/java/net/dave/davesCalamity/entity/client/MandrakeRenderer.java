package net.dave.davesCalamity.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.custom.MandrakeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MandrakeRenderer extends MobRenderer<MandrakeEntity, MandrakeModel<MandrakeEntity>> {

    public MandrakeRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MandrakeModel<>(pContext.bakeLayer(MandrakeModel.LAYER_LOCATION)), 0.5f);
    }



    @Override
    public ResourceLocation createRenderState(MandrakeEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID, "textures/entity/mandrake.png");
    }

    @Override
    public void render(MandrakeEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
