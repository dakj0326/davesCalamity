package net.dave.davesCalamity.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dave.davesCalamity.DavesCalamity;
import net.dave.davesCalamity.entity.custom.MandrakeEntity;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class MandrakeModel<T extends MandrakeEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID, "mandrake"), "main");
    private final ModelPart root;
    private final ModelPart hair;
    private final ModelPart L_leg;
    private final ModelPart R_leg;
    private final ModelPart L_arm;
    private final ModelPart R_arm;

    public MandrakeModel(ModelPart root) {
        this.root = root.getChild("root");
        this.hair = root.getChild("hair");
        this.L_leg = root.getChild("L_leg");
        this.R_leg = root.getChild("R_leg");
        this.L_arm = root.getChild("L_arm");
        this.R_arm = root.getChild("R_arm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(24, 10).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(16, 21).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 6).addBox(-2.0F, -3.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

        PartDefinition hair = partdefinition.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(0, -3).addBox(0.0F, -12.0F, -6.0F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 0.0F));

        PartDefinition cube_r1 = hair.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, -3).addBox(0.0F, -12.0F, -6.0F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition L_leg = partdefinition.addOrReplaceChild("L_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 18.0F, 0.0F));

        PartDefinition cube_r2 = L_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 25).addBox(-1.0F, -6.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0F, 1.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition R_leg = partdefinition.addOrReplaceChild("R_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 18.0F, 1.0F));

        PartDefinition cube_r3 = R_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 25).addBox(0.0F, -6.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition L_arm = partdefinition.addOrReplaceChild("L_arm", CubeListBuilder.create().texOffs(24, 15).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 14.0F, 1.0F));

        PartDefinition R_arm = partdefinition.addOrReplaceChild("R_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 14.0F, 1.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = R_arm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 15).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(MandrakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.m_142109_().getAllParts().forEach(ModelPart::resetPose);   // func: root - Reset pose after anim

        this.m_267799_(MandrakeAnimations.RUNNING, limbSwing, limbSwingAmount, 2f, 2.5f); // Func: animateWalk
        this.m_233385_(entity.idleAnimationState, MandrakeAnimations.IDLE, ageInTicks, 1f); // func: animate - idle animation
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        hair.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        L_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        R_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        L_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        R_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart m_142109_() { // root
        return root;
    }


}