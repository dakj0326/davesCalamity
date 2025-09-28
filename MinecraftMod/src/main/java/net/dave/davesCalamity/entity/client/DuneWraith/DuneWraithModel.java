package net.dave.davesCalamity.entity.client.DuneWraith;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dave.davesCalamity.entity.custom.DuneWraithEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import static net.dave.davesCalamity.DavesCalamity.MOD_ID;

public class DuneWraithModel<T extends DuneWraithEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(MOD_ID, "dune_wraith"), "main");
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart ring1;
	private final ModelPart ring2;
	private final ModelPart ring3;
	private final ModelPart ring4;
	private final ModelPart swarm1;
	private final ModelPart swarm2;
	private final ModelPart swarm3;

	public DuneWraithModel(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.ring1 = this.root.getChild("ring1");
		this.ring2 = this.root.getChild("ring2");
		this.ring3 = this.root.getChild("ring3");
		this.ring4 = this.root.getChild("ring4");
		this.swarm1 = this.root.getChild("swarm1");
		this.swarm2 = this.root.getChild("swarm2");
		this.swarm3 = this.root.getChild("swarm3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, -20.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 40).addBox(-2.0F, -20.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 50).addBox(-2.0F, -18.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(52, 13).addBox(-2.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(52, 18).addBox(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(54, 0).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(54, 8).addBox(-3.0F, -14.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
		.texOffs(54, 5).addBox(-3.0F, -16.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
		.texOffs(52, 23).addBox(-3.0F, -18.0F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 0.0F));

		PartDefinition ring1 = root.addOrReplaceChild("ring1", CubeListBuilder.create().texOffs(22, 40).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 42).addBox(-6.0F, -1.0F, 5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(22, 27).addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -17.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition ring2 = root.addOrReplaceChild("ring2", CubeListBuilder.create().texOffs(32, 11).addBox(-7.0F, -1.0F, -7.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 38).addBox(-7.0F, -1.0F, 6.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(6.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(26, 14).addBox(-7.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, 0.3927F, -0.3927F, 0.0F));

		PartDefinition ring3 = root.addOrReplaceChild("ring3", CubeListBuilder.create().texOffs(22, 44).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 27).addBox(-6.0F, -1.0F, 5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.1766F, 0.4011F, 0.4287F));

		PartDefinition ring4 = root.addOrReplaceChild("ring4", CubeListBuilder.create().texOffs(40, 46).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 48).addBox(-5.0F, -1.0F, 4.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 29).addBox(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(22, 46).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 2.6616F, -1.1781F, 3.1416F));

		PartDefinition swarm1 = root.addOrReplaceChild("swarm1", CubeListBuilder.create().texOffs(8, 49).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 49).addBox(-10.0F, 0.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 49).addBox(-3.0F, 4.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -12.0F, -5.0F));

		PartDefinition swarm2 = root.addOrReplaceChild("swarm2", CubeListBuilder.create().texOffs(8, 53).addBox(-6.0F, -5.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 53).addBox(-6.0F, 2.0F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 53).addBox(-11.0F, -6.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -12.0F, -5.0F));

		PartDefinition swarm3 = root.addOrReplaceChild("swarm3", CubeListBuilder.create().texOffs(20, 55).addBox(1.0F, -6.0F, 6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 55).addBox(0.0F, 2.0F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 55).addBox(-8.0F, 4.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -12.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(DuneWraithEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root.getAllParts().forEach(ModelPart::resetPose);

		this.head.xRot = headPitch * (float)(Math.PI / 180F);
		this.head.yRot = netHeadYaw * (float)(Math.PI / 180F);

		this.m_267799_(DuneWraithAnimations.IDLE, limbSwing, limbSwingAmount, 0.7f, 0.7f); // Func: animateWalk
		this.m_233385_(entity.idleAnimationState, DuneWraithAnimations.IDLE, ageInTicks, 0.7f); // func: animate - idle animation
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