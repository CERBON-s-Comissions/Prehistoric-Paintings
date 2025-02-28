package com.cerbon.ml_template.forge.paintings;

import com.cerbon.ml_template.util.ModConstants;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PPForgePaintings {
    public static DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ModConstants.MOD_ID);

    public static RegistryObject<PaintingVariant> TERRESTRIAL_LANDSCAPE   = PAINTINGS.register("terrestrial_landscape",   () -> new PaintingVariant(64, 64));
    public static RegistryObject<PaintingVariant> TERRESTRIAL_LANDSCAPE_2 = PAINTINGS.register("terrestrial_landscape_2", () -> new PaintingVariant(64, 64));

    public static void register(IEventBus eventBus) {
        PAINTINGS.register(eventBus);
    }
}
