package net.dave.davesCalamity.entity.client.StoneGolem;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dave.davesCalamity.entity.client.StoneGolem.StoneGolemAnimation;
import net.dave.davesCalamity.entity.custom.StoneGolemEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class StoneGolemModel<T extends StoneGolemEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(MOD_ID, "stonegolemmodel"), "main");
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart rightArm;
	private final ModelPart rightUnderArm;
	private final ModelPart leftArm;
	private final ModelPart leftUnderArm;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

	public StoneGolemModel(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.rightArm = this.root.getChild("rightArm");
		this.rightUnderArm = this.rightArm.getChild("rightUnderArm");
		this.leftArm = this.root.getChild("leftArm");
		this.leftUnderArm = this.leftArm.getChild("leftUnderArm");
		this.leftLeg = this.root.getChild("leftLeg");
		this.rightLeg = this.root.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(34, 20).addBox(-2.0F, 2.0F, -5.0F, 3.0F, 5.0F, 10.0F, new CubeDeformation(-0.001F))
		.texOffs(38, 0).addBox(-3.0F, 3.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-3.0F, 2.0F, -4.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -4.0F, -7.0F, 5.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-4.0F, -4.0F, -5.0F, 7.0F, 6.0F, 10.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 13.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(34, 35).addBox(-1.0F, -5.0F, -4.0F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(32, 58).addBox(0.0F, -4.0F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 63).addBox(-2.0F, -4.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 48).addBox(5.0F, -4.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(18, 58).addBox(-2.0F, -3.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 67).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -5.0F, 5.0F, -0.3927F, 0.0F, 0.4363F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(66, 65).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, -4.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(38, 10).addBox(0.0F, 0.0F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition rightArm = root.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(0, 45).addBox(-2.0F, -3.0F, -5.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(62, 38).addBox(-1.0F, -4.0F, -6.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 67).addBox(0.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 56).addBox(-1.0F, 2.0F, -4.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.0F, -7.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r3 = rightArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 65).addBox(3.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightUnderArm = rightArm.addOrReplaceChild("rightUnderArm", CubeListBuilder.create(), PartPose.offset(-0.0864F, 5.8389F, -1.0F));

		PartDefinition cube_r4 = rightUnderArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 48).addBox(-5.0F, -3.0F, -3.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0864F, 3.1611F, 0.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r5 = rightUnderArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.0864F, 2.1611F, 0.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition leftArm = root.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(54, 56).addBox(-1.0F, 2.0F, 0.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(-0.001F))
		.texOffs(20, 48).addBox(-2.0F, -3.0F, 0.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 45).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 62).addBox(0.0F, -1.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F))
		.texOffs(62, 43).addBox(2.0F, -4.0F, 1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(56, 65).addBox(-3.0F, -2.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.0F, 7.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r6 = leftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 67).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 2.0F, -0.4901F, -0.0291F, -0.9184F));

		PartDefinition cube_r7 = leftArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 65).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 1.0F, 0.4305F, 0.0735F, -0.7257F));

		PartDefinition cube_r8 = leftArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 67).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.0F, 1.0F, -0.1745F, 0.0F, -0.5672F));

		PartDefinition cube_r9 = leftArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 65).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 4.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition leftUnderArm = leftArm.addOrReplaceChild("leftUnderArm", CubeListBuilder.create(), PartPose.offset(0.316F, 6.1206F, 2.0F));

		PartDefinition cube_r10 = leftUnderArm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 55).addBox(-5.0F, -3.0F, 14.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.684F, 2.8794F, -17.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r11 = leftUnderArm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 9).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.684F, 1.8794F, 0.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition leftLeg = root.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(60, 18).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(60, 30).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, -2.0F));

		PartDefinition cube_r12 = leftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 36).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r13 = leftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 63).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightLeg = root.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(62, 34).addBox(-2.0F, 3.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 2.0F));

		PartDefinition cube_r14 = rightLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(26, 42).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r15 = rightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(32, 65).addBox(-3.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart m_142109_() {
		return root;
	}

	@Override
	public void setupAnim(StoneGolemEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root.getAllParts().forEach(ModelPart::resetPose);

		float yaw = netHeadYaw * ((float)Math.PI / 180F);
		float pitch = headPitch * ((float)Math.PI / 180F);

		// Clamp to ±10 degrees (≈ 0.1745 radians)
		float max = (float)Math.toRadians(30); // ~0.1745
		yaw = Mth.clamp(yaw, -max, max);
		pitch = Mth.clamp(pitch, -max, max);

		this.head.xRot = pitch;
		this.head.yRot = yaw;

		this.m_267799_(StoneGolemAnimation.WALK, limbSwing, limbSwingAmount, 3f, 2.5f); // Func: animateWalk
		this.m_233385_(entity.idleAnimationState, StoneGolemAnimation.IDLE, ageInTicks, 1f); // func: animate - idle animation
		this.m_233385_(entity.attackAnimationState, StoneGolemAnimation.ATTACK, ageInTicks, 1f); // func: animate - attack animation
	}
}