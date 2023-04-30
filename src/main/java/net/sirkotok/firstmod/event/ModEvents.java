package net.sirkotok.firstmod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sirkotok.firstmod.FirstMod;
import net.sirkotok.firstmod.entity.ModEntityTypes;
import net.sirkotok.firstmod.entity.custom.CrewmateEntity;

public class ModEvents {



    @Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.CREWMATE.get(), CrewmateEntity.setAttributes());
        }
    }
}
