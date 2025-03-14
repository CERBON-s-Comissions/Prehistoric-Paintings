package com.cerbon.prehistoric_paintings.forge;

import com.cerbon.prehistoric_paintings.PrehistoricPaintings;
import com.cerbon.prehistoric_paintings.util.PHPConstants;
import net.minecraftforge.fml.common.Mod;

@Mod(PHPConstants.MOD_ID)
public class PrehistoricPaintingsForge {

    public PrehistoricPaintingsForge() {
        PrehistoricPaintings.init();
    }
}