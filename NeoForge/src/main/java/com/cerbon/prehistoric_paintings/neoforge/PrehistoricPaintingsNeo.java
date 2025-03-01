package com.cerbon.prehistoric_paintings.neoforge;

import com.cerbon.prehistoric_paintings.PrehistoricPaintings;
import com.cerbon.prehistoric_paintings.neoforge.paintings.PHPNeoPaintings;
import com.cerbon.prehistoric_paintings.util.PHPConstants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(PHPConstants.MOD_ID)
public class PrehistoricPaintingsNeo {

    public PrehistoricPaintingsNeo(IEventBus modEventBus) {
        PrehistoricPaintings.init();

        PHPNeoPaintings.register(modEventBus);
    }
}
