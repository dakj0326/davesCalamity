package net.dave.davesCalamity.entity.client.DuneWraith;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class DuneWraithAnimations {
    public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(1f).looping()
            .addAnimation("ring1",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(15f, 0f, 30f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(15f, 359f, 30f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("ring2",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-15f, 0f, 15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-15f, -360f, 15f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("ring3",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-10f, 0f, -20f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-10f, 360f, -20f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("ring4",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(45f, 0f, -15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(45f, -360f, -15f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("swarm1",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("swarm2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8343334f, KeyframeAnimations.posVec(0f, 3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 2f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("swarm3",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 1f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 1f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
}
