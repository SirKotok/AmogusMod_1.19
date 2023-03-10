package net.sirkotok.firstmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sirkotok.firstmod.FirstMod;
import net.sirkotok.firstmod.Item.ModCreativeModeTab;
import net.sirkotok.firstmod.Item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static final RegistryObject<Block> AMOGUS_BLOCK = registerBlock("amogus_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.COOL_TAB);

    public static final RegistryObject<Block> AMOGUS_ORE = registerBlock("amogus_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.COOL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_AMOGUS_BLOCK = registerBlock("deep_amogus_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(4, 8)), ModCreativeModeTab.COOL_TAB);


        private static<T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn, tab);
            return toReturn;
        }

        private static< T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
        }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);

    }
}
