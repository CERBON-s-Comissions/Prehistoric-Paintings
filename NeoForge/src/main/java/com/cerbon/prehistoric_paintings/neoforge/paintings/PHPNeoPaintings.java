package com.cerbon.prehistoric_paintings.neoforge.paintings;

import com.cerbon.prehistoric_paintings.util.PHPConstants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PHPNeoPaintings {
    public static DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(BuiltInRegistries.PAINTING_VARIANT, PHPConstants.MOD_ID);

    public static Supplier<PaintingVariant> TERRESTRIAL_LANDSCAPE   = PAINTINGS.register("terrestrial_landscape",   () -> new PaintingVariant(64, 64));
    public static Supplier<PaintingVariant> TERRESTRIAL_LANDSCAPE_2 = PAINTINGS.register("terrestrial_landscape_2", () -> new PaintingVariant(64, 64));

    public static void register(IEventBus eventBus) {
        PAINTINGS.register(eventBus);
    }
}
