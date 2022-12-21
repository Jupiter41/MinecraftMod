
package fr.arthur.arthurmod.item ; 

import fr.arthur.arthurmod.ArthurMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArthurMod.MODID) ;

    public static final RegistryObject<Item> VODOU_PUPPET = ITEMS.register("vodou_puppet", 
    () -> new Item(new Item.Properties()
        .tab(ModCreativeModTab.MOD_TAB))) ;

    public static final RegistryObject<Item> TAB_ICON = ITEMS.register("tab_icon", 
    () -> new Item(new Item.Properties())) ;



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus) ;
    }
    
}