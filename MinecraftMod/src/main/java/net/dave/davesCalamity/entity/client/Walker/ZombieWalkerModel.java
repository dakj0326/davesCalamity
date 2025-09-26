package net.dave.davesCalamity.entity.client.Walker;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dave.davesCalamity.entity.custom.MandrakeEntity;
import net.dave.davesCalamity.entity.custom.ZombieWalkerEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;


import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class ZombieWalkerModel<T extends ZombieWalkerEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(MOD_ID, "zombiewalkermodel"), "main");
	private final ModelPart root;
	private final ModelPart rArm;
	private final ModelPart rLowerArm;
	private final ModelPart lArm;
	private final ModelPart lLowerArm;
	private final ModelPart head;
	private final ModelPart lowerHead;
	private final ModelPart upperHead;
	private final ModelPart lTorso;
	private final ModelPart leftLeg;
	private final ModelPart lLowerLeg;
	private final ModelPart rightLeg;
	private final ModelPart rLowerLeg;

	public ZombieWalkerModel(ModelPart root) {
		this.root = root.getChild("root");
		this.rArm = this.root.getChild("rArm");
		this.rLowerArm = this.rArm.getChild("rLowerArm");
		this.lArm = this.root.getChild("lArm");
		this.lLowerArm = this.lArm.getChild("lLowerArm");
		this.head = this.root.getChild("head");
		this.lowerHead = this.head.getChild("lowerHead");
		this.upperHead = this.head.getChild("upperHead");
		this.lTorso = this.root.getChild("lTorso");
		this.leftLeg = this.lTorso.getChild("leftLeg");
		this.lLowerLeg = this.leftLeg.getChild("lLowerLeg");
		this.rightLeg = this.lTorso.getChild("rightLeg");
		this.rLowerLeg = this.rightLeg.getChild("rLowerLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -13.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));

		PartDefinition rArm = root.addOrReplaceChild("rArm", CubeListBuilder.create().texOffs(24, 9).addBox(0.0F, -2.0F, -4.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -11.0F, 0.0F));

		PartDefinition rLowerArm = rArm.addOrReplaceChild("rLowerArm", CubeListBuilder.create().texOffs(24, 29).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -4.0F));

		PartDefinition lArm = root.addOrReplaceChild("lArm", CubeListBuilder.create().texOffs(0, 25).addBox(-4.0F, -2.0F, -4.0F, 4.0F, 4.0F, 6.0F), PartPose.offset(-4.0F, -11.0F, 0.0F));

		PartDefinition lLowerArm = lArm.addOrReplaceChild("lLowerArm", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, -4.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, 0.0F));

		PartDefinition lowerHead = head.addOrReplaceChild("lowerHead", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upperHead = head.addOrReplaceChild("upperHead", CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -8.0F, 0.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lTorso = root.addOrReplaceChild("lTorso", CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition leftLeg = lTorso.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(20, 39).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 7.0F, 0.0F));

		PartDefinition lLowerLeg = leftLeg.addOrReplaceChild("lLowerLeg", CubeListBuilder.create().texOffs(44, 19).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition rightLeg = lTorso.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(36, 39).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 7.0F, 0.0F));

		PartDefinition rLowerLeg = rightLeg.addOrReplaceChild("rLowerLeg", CubeListBuilder.create().texOffs(44, 9).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart m_142109_() {
		return this.root;
	}

	@Override
	public void setupAnim(ZombieWalkerEntity entity, float limbSwing, float limbSwingAmount,
						  float ageInTicks, float netHeadYaw, float headPitch) {
		this.root.getAllParts().forEach(ModelPart::resetPose);

		// Head rotation (always applied)
		this.head.xRot = headPitch * (float)(Math.PI / 180F);
		this.head.yRot = netHeadYaw * (float)(Math.PI / 180F);

		// Idle is safe to always run (it blends in place)
		this.m_233385_(entity.idleAnimationState, ZombieWalkerAnimations.IDLE, ageInTicks, 1f);

		// Walking vs running
		if (entity.isAggressive()) {
			// Use running animation instead of walking
			this.m_267799_(ZombieWalkerAnimations.RUN, limbSwing, limbSwingAmount, 2f, 2.5f); // bump speed if needed
		} else {
			// Normal walking cycle
			this.m_267799_(ZombieWalkerAnimations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		}

		// Special one-shots
		this.m_233385_(entity.transformAnimationState, ZombieWalkerAnimations.TRANSFORM, ageInTicks, 1f);
		this.m_233385_(entity.retransformAnimationState, ZombieWalkerAnimations.RETRANSFORM, ageInTicks, 1f);
		this.m_233385_(entity.attackAnimationState, ZombieWalkerAnimations.ATTACK, ageInTicks, 1f);
	}
}