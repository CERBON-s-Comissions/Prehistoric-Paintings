package com.cerbon.ml_template.fabric;

import com.cerbon.ml_template.ModName;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class ModNameFabric implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        ModName.init();

        Registry.register(BuiltInRegistries.PAINTING_VARIANT, "ml_template:terrestrial_landscape",   new PaintingVariant(64, 64));
        Registry.register(BuiltInRegistries.PAINTING_VARIANT, "ml_template:terrestrial_landscape_2", new PaintingVariant(64, 64));
    }

    @Override
    public void onInitializeClient() {}
}