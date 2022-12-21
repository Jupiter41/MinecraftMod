package fr.arthur.arthurmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {

    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("arthurmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TAB_ICON.get()) ;
        }
    };

    
}
