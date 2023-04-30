package net.sirkotok.firstmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sirkotok.firstmod.FirstMod;
import net.sirkotok.firstmod.Item.custom.Talkingmogusitem;
import net.sirkotok.firstmod.entity.ModEntityTypes;

public class ModItems {

    // Mandatory for items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

 // Create a new item called amogus example
    public static final RegistryObject<Item> RED = ITEMS.register("red",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COOL_TAB)));
    public static final RegistryObject<Item> GREEN = ITEMS.register("green",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COOL_TAB)));

    public static final RegistryObject<Item> BLUE = ITEMS.register("blue",
            () -> new Talkingmogusitem(new Item.Properties().tab(ModCreativeModeTab.COOL_TAB).stacksTo(1)));

// creates register for items so they cool af in game. Mandatory
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

    public static final RegistryObject<Item> CREWMATE_SPAWN_EGG = ITEMS.register("crewmate_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CREWMATE, 0x90feea, 0x026286 ,
                    new Item.Properties().tab(ModCreativeModeTab.COOL_TAB)));

}
