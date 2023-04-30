package net.sirkotok.firstmod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sirkotok.firstmod.FirstMod;
import net.sirkotok.firstmod.entity.custom.CrewmateEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FirstMod.MOD_ID);

    public static final RegistryObject<EntityType<CrewmateEntity>> CREWMATE =
            ENTITY_TYPES.register("crewmate",
                    () -> EntityType.Builder.of(CrewmateEntity::new, MobCategory.MONSTER)
                            .sized(5f, 4f)
                            .build(new ResourceLocation(FirstMod.MOD_ID, "crewmate").toString()));

  // .sized(hitbox numbers pWidth and pHight)
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
