package net.sirkotok.firstmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.sirkotok.firstmod.FirstMod;
import net.sirkotok.firstmod.entity.custom.CrewmateEntity;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CrewmateRenderer extends GeoEntityRenderer<CrewmateEntity> {
    public CrewmateRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CrewmateModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(CrewmateEntity animatable) {
        return new ResourceLocation(FirstMod.MOD_ID, "textures/entity/greencrewmate.png");
    }

    @Override
    public RenderType getRenderType(CrewmateEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight,
                                    ResourceLocation texture) {
            poseStack.scale(5.0f, 5.0f, 5.0f);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
