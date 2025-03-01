package com.cerbon.prehistoric_paintings.fabric;

import com.cerbon.prehistoric_paintings.PrehistoricPaintings;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class PrehistoricPaintingsFabric implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        PrehistoricPaintings.init();

        Registry.register(BuiltInRegistries.PAINTING_VARIANT, "prehistoric_paintings:terrestrial_landscape",   new PaintingVariant(64, 64));
        Registry.register(BuiltInRegistries.PAINTING_VARIANT, "prehistoric_paintings:terrestrial_landscape_2", new PaintingVariant(64, 64));
    }

    @Override
    public void onInitializeClient() {}
}