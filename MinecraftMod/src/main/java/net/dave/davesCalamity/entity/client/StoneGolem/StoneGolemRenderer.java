package net.dave.davesCalamity.entity.client.StoneGolem;

import com.mojang.blaze3d.vertex.PoseStack;
import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.custom.StoneGolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class StoneGolemRenderer extends MobRenderer<StoneGolemEntity, StoneGolemModel<StoneGolemEntity>> {
    public StoneGolemRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new StoneGolemModel<>(pContext.bakeLayer(StoneGolemModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public void render(StoneGolemEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }

    @Override
    protected void scale(StoneGolemEntity entity, PoseStack poseStack, float partialTickTime) {
        poseStack.scale(2.0F, 2.0F, 2.0F); // Scale X, Y, Z by 2x
        super.scale(entity, poseStack, partialTickTime);
    }

    @Override
    public ResourceLocation createRenderState(StoneGolemEntity entity) {
        return switch (entity.getVariant()) {
            case 1 ->
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/entity/stone_golem/stone_golem_blue.png");
            case 2 ->
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/entity/stone_golem/stone_golem_green.png");
            case 3 ->
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/entity/stone_golem/stone_golem_purple.png");
            case 4 ->
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/entity/stone_golem/stone_golem_red.png");
            default ->
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/entity/stone_golem/stone_golem_black.png");
        };
    }
}