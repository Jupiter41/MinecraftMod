package fr.arthur.arthurmod.block;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

import fr.arthur.arthurmod.ArthurMod;
import fr.arthur.arthurmod.item.ModCreativeModTab;
import fr.arthur.arthurmod.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ArthurMod.MODID) ;

    public static final RegistryObject<Block> BLOOD_BLOCK = registerBlock("blood_block", null, ModCreativeModTab.MOD_TAB) ;

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block) ;
        registerBlockItem(name, toReturn, tab) ;
        return toReturn ;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab))) ;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus) ;
    }
    
}
