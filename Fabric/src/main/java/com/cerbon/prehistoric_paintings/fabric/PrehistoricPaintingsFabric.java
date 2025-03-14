package com.cerbon.prehistoric_paintings.fabric;

import com.cerbon.prehistoric_paintings.PrehistoricPaintings;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class PrehistoricPaintingsFabric implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        PrehistoricPaintings.init();
    }

    @Override
    public void onInitializeClient() {}
}