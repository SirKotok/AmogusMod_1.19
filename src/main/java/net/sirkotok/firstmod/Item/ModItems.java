package net.sirkotok.firstmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sirkotok.firstmod.FirstMod;

public class ModItems {

    // Mandatory for items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

 // Create a new item called amogus example
    public static final RegistryObject<Item> RED = ITEMS.register("red",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COOL_TAB)));
    public static final RegistryObject<Item> GREEN = ITEMS.register("green",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COOL_TAB)));

// creates register for items so they cool af in game. Mandatory
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
