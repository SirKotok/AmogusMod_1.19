package net.sirkotok.firstmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.sirkotok.firstmod.FirstMod;
import net.sirkotok.firstmod.entity.custom.CrewmateEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrewmateModel extends AnimatedGeoModel<CrewmateEntity> {
    @Override
    public ResourceLocation getModelResource(CrewmateEntity object) {
        return new ResourceLocation(FirstMod.MOD_ID, "geo/crewmate.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrewmateEntity object) {
        return new ResourceLocation(FirstMod.MOD_ID, "textures/entity/greencrewmate.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrewmateEntity animatable) {
        return new ResourceLocation(FirstMod.MOD_ID, "animations/crewmate.animation.json");
    }
}
