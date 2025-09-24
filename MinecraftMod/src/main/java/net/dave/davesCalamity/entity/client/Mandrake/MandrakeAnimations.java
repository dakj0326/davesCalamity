package net.dave.davesCalamity.entity.client.Mandrake;// Save this class in your mod and generate all required imports

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class MandrakeAnimations {
	public static final AnimationDefinition Idle = AnimationDefinition.Builder.withLength(2.9529F).looping()
			.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.1752F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.9635F, KeyframeAnimations.degreeVec(-6.7873F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.6391F, KeyframeAnimations.degreeVec(-16.2398F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.2022F, KeyframeAnimations.degreeVec(-14.6216F, 10.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.6151F, KeyframeAnimations.degreeVec(-10.9275F, 4.4026F, 0.1926F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.9404F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.9404F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("L_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2377F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -4.9502F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.6506F, KeyframeAnimations.degreeVec(22.4634F, 0.8586F, -4.8753F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.8258F, KeyframeAnimations.degreeVec(0.0452F, -1.0701F, -4.8334F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.2137F, KeyframeAnimations.degreeVec(0.0452F, -1.0701F, 0.1666F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5641F, KeyframeAnimations.degreeVec(-7.456F, -1.0392F, 0.3049F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.8018F, KeyframeAnimations.degreeVec(0.0452F, -1.0701F, 0.1666F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.2898F, KeyframeAnimations.degreeVec(-12.4567F, -1.0087F, 0.3943F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.7653F, KeyframeAnimations.degreeVec(0.0452F, -1.0701F, 0.1666F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("R_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.1251F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4379F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.9509F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.3138F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.6642F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.2648F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.6652F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.8278F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("hair", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.1932F, -1.3632F, -3.9292F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.3378F, KeyframeAnimations.degreeVec(-24.7101F, -0.8391F, -4.0732F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.6882F, KeyframeAnimations.degreeVec(-31.2256F, 6.2228F, -3.9819F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.1511F, KeyframeAnimations.degreeVec(-30.9059F, -2.8186F, -3.9627F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.5891F, KeyframeAnimations.degreeVec(-28.725F, -2.2877F, -4.058F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.0395F, KeyframeAnimations.degreeVec(-32.1731F, -2.9288F, -4.2409F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.49F, KeyframeAnimations.degreeVec(-32.1832F, -2.146F, -6.5851F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.9404F, KeyframeAnimations.degreeVec(-32.1932F, -1.3632F, -3.9292F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("hair", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.8258F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.28F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.3649F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.53F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.8779F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.84F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(2.9529F, KeyframeAnimations.posVec(0.0F, -1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.build();

	public static final AnimationDefinition running = AnimationDefinition.Builder.withLength(0.9167F).looping()
			.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.125F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.625F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.75F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.875F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("hair", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(-59.1025F, -2.85F, -2.7253F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.125F, KeyframeAnimations.degreeVec(-46.6076F, -2.1929F, -3.2772F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.25F, KeyframeAnimations.degreeVec(-56.6025F, -2.7285F, -2.847F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-46.6076F, -2.1929F, -3.2772F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.625F, KeyframeAnimations.degreeVec(-61.603F, -2.9661F, -2.5984F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-46.6076F, -2.1929F, -3.2772F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.875F, KeyframeAnimations.degreeVec(-59.1025F, -2.85F, -2.7253F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("hair", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 2.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("L_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0417F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2917F, KeyframeAnimations.degreeVec(20.625F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.7083F, KeyframeAnimations.degreeVec(20.625F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.875F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("R_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0417F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4583F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.875F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("L_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.727F, 1.2719F, -57.9848F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-0.727F, 1.2719F, -72.9848F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4167F, KeyframeAnimations.degreeVec(-0.727F, 1.2719F, -65.4848F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.625F, KeyframeAnimations.degreeVec(-0.727F, 1.2719F, -70.4848F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-0.727F, 1.2719F, -65.4848F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.9167F, KeyframeAnimations.degreeVec(-0.727F, 1.2719F, -57.9848F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("R_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 47.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2083F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 57.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4583F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 50.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.7083F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 55.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.875F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 50.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.build();
}