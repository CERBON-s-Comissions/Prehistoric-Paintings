package com.cerbon.ml_template.neoforge;

import com.cerbon.ml_template.ModName;
import com.cerbon.ml_template.neoforge.paintings.PPNeoPaintings;
import com.cerbon.ml_template.util.ModConstants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModConstants.MOD_ID)
public class ModNameNeo {

    public ModNameNeo(IEventBus modEventBus) {
        ModName.init();

        PPNeoPaintings.register(modEventBus);
    }
}
