package net.dave.davesCalamity.entity.client.SandScorpoin;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dave.davesCalamity.entity.client.Mandrake.MandrakeAnimations;
import net.dave.davesCalamity.entity.custom.MandrakeEntity;
import net.dave.davesCalamity.entity.custom.SandScorpionEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class SandScorpionModel<T extends SandScorpionEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(MOD_ID, "sand_scorpion"), "main");
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart stinger;
	private final ModelPart right_leg_1;
	private final ModelPart right_leg_2;
	private final ModelPart right_leg_3;
	private final ModelPart right_leg_4;
	private final ModelPart left_leg_1;
	private final ModelPart left_leg_2;
	private final ModelPart left_leg_3;
	private final ModelPart left_leg_4;
	private final ModelPart right_claw;
	private final ModelPart right_claw2;

	public SandScorpionModel(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.tail1 = this.root.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.stinger = this.tail4.getChild("stinger");
		this.right_leg_1 = this.root.getChild("right_leg_1");
		this.right_leg_2 = this.root.getChild("right_leg_2");
		this.right_leg_3 = this.root.getChild("right_leg_3");
		this.right_leg_4 = this.root.getChild("right_leg_4");
		this.left_leg_1 = this.root.getChild("left_leg_1");
		this.left_leg_2 = this.root.getChild("left_leg_2");
		this.left_leg_3 = this.root.getChild("left_leg_3");
		this.left_leg_4 = this.root.getChild("left_leg_4");
		this.right_claw = this.root.getChild("right_claw");
		this.right_claw2 = this.root.getChild("right_claw2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail1 = root.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 3.0F));

		PartDefinition tail_1_r1 = tail1.addOrReplaceChild("tail_1_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition tail_2_r1 = tail2.addOrReplaceChild("tail_2_r1", CubeListBuilder.create().texOffs(16, 9).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3963F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition tail_3_r1 = tail3.addOrReplaceChild("tail_3_r1", CubeListBuilder.create().texOffs(10, 16).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -2.0F));

		PartDefinition tail_4_r1 = tail4.addOrReplaceChild("tail_4_r1", CubeListBuilder.create().texOffs(18, 14).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition stinger = tail4.addOrReplaceChild("stinger", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition cube_r1 = stinger.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition stinger_cube_r1 = stinger.addOrReplaceChild("stinger_cube_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition right_leg_1 = root.addOrReplaceChild("right_leg_1", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, -1.0F, -3.0F, 0.0F, 0.3491F, -0.0873F));

		PartDefinition r1_lower_r1 = right_leg_1.addOrReplaceChild("r1_lower_r1", CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition right_leg_2 = root.addOrReplaceChild("right_leg_2", CubeListBuilder.create().texOffs(22, 2).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, -1.0F, -1.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition r2_lower_r1 = right_leg_2.addOrReplaceChild("r2_lower_r1", CubeListBuilder.create().texOffs(8, 26).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition right_leg_3 = root.addOrReplaceChild("right_leg_3", CubeListBuilder.create().texOffs(22, 4).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, -1.0F, 1.0F, 0.0F, -0.1745F, -0.0873F));

		PartDefinition r3_lower_r1 = right_leg_3.addOrReplaceChild("r3_lower_r1", CubeListBuilder.create().texOffs(26, 8).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition right_leg_4 = root.addOrReplaceChild("right_leg_4", CubeListBuilder.create().texOffs(26, 10).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -1.0F, 2.0F, 0.0F, -0.5236F, -0.0873F));

		PartDefinition r4_lower_r1 = right_leg_4.addOrReplaceChild("r4_lower_r1", CubeListBuilder.create().texOffs(26, 12).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition left_leg_1 = root.addOrReplaceChild("left_leg_1", CubeListBuilder.create().texOffs(22, 6).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, -1.0F, -3.0F, 0.0F, -0.3491F, 0.0873F));

		PartDefinition l1_lower_r1 = left_leg_1.addOrReplaceChild("l1_lower_r1", CubeListBuilder.create().texOffs(26, 14).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition left_leg_2 = root.addOrReplaceChild("left_leg_2", CubeListBuilder.create().texOffs(8, 22).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition l2_lower_r1 = left_leg_2.addOrReplaceChild("l2_lower_r1", CubeListBuilder.create().texOffs(26, 16).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition left_leg_3 = root.addOrReplaceChild("left_leg_3", CubeListBuilder.create().texOffs(8, 24).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 1.0F, 0.0F, 0.1745F, 0.0873F));

		PartDefinition l2_lower_r2 = left_leg_3.addOrReplaceChild("l2_lower_r2", CubeListBuilder.create().texOffs(26, 18).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition left_leg_4 = root.addOrReplaceChild("left_leg_4", CubeListBuilder.create().texOffs(26, 20).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 2.0F, 0.0F, 0.5236F, 0.0873F));

		PartDefinition l2_lower_r3 = left_leg_4.addOrReplaceChild("l2_lower_r3", CubeListBuilder.create().texOffs(26, 22).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition right_claw = root.addOrReplaceChild("right_claw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition r_claw_inner_r1 = right_claw.addOrReplaceChild("r_claw_inner_r1", CubeListBuilder.create().texOffs(10, 32).addBox(-4.0F, -3.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(3.0F, 0.0F, -7.0F, 0.0F, -0.7418F, 0.0F));

		PartDefinition r_claw_outer_r1 = right_claw.addOrReplaceChild("r_claw_outer_r1", CubeListBuilder.create().texOffs(10, 28).addBox(-4.0F, -3.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(4.0F, 0.0F, -8.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition r_hand_r1 = right_claw.addOrReplaceChild("r_hand_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.0F, -7.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition r_claw_arm_r1 = right_claw.addOrReplaceChild("r_claw_arm_r1", CubeListBuilder.create().texOffs(26, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 0.0F, -6.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition right_claw2 = root.addOrReplaceChild("right_claw2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition r_claw_inner_r2 = right_claw2.addOrReplaceChild("r_claw_inner_r2", CubeListBuilder.create().texOffs(10, 40).mirror().addBox(0.0F, -3.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, -7.0F, 0.0F, 0.7418F, 0.0F));

		PartDefinition r_claw_outer_r2 = right_claw2.addOrReplaceChild("r_claw_outer_r2", CubeListBuilder.create().texOffs(10, 36).mirror().addBox(0.0F, -3.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, -8.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition r_hand_r2 = right_claw2.addOrReplaceChild("r_hand_r2", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(0.0F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -1.0F, -7.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition r_claw_arm_r2 = right_claw2.addOrReplaceChild("r_claw_arm_r2", CubeListBuilder.create().texOffs(26, 28).mirror().addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0F, -6.0F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(SandScorpionEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root.getAllParts().forEach(ModelPart::resetPose);

		// Convert to radians
		float yaw = netHeadYaw * ((float)Math.PI / 180F);
		float pitch = headPitch * ((float)Math.PI / 180F);

		// Clamp to ±10 degrees (≈ 0.1745 radians)
		float max = (float)Math.toRadians(10); // ~0.1745
		yaw = Mth.clamp(yaw, -max, max);
		pitch = Mth.clamp(pitch, -max, max);

		this.head.xRot = pitch;
		this.head.yRot = yaw;

		this.m_267799_(SandScorpionAnimation.WALK, limbSwing, limbSwingAmount, 3f, 2.5f); // Func: animateWalk
		this.m_233385_(entity.idleAnimationState, SandScorpionAnimation.IDLE, ageInTicks, 1f); // func: animate - idle animation
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart m_142109_() {
		return root;
	}
}