package net.sirkotok.firstmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COOL_TAB = new CreativeModeTab("amoguses") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack((ModItems.RED.get()));

        }
    };
}
