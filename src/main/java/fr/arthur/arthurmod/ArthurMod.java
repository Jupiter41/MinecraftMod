package fr.arthur.arthurmod ;

import com.mojang.logging.LogUtils;

import fr.arthur.arthurmod.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ArthurMod.MODID)
public class ArthurMod {
    
    // Define mod id in a common place for everything to reference
    public static final String MODID = "arthurmod" ;
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger() ;
    
    public ArthurMod() {
        
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus() ;

        ModItems.register(modEventBus) ;
        
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup) ;
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this) ;
        
    }
    
    private void commonSetup(final FMLCommonSetupEvent event) {
        
        
    }
    
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            
            
            
        }
    }
    
}