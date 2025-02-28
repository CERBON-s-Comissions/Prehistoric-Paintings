package com.cerbon.ml_template.forge;

import com.cerbon.ml_template.ModName;
import com.cerbon.ml_template.forge.paintings.PPForgePaintings;
import com.cerbon.ml_template.util.ModConstants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModConstants.MOD_ID)
public class ModNameForge {

    public ModNameForge() {
        ModName.init();

        PPForgePaintings.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}