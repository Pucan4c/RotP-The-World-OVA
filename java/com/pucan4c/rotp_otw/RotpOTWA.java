package com.pucan4c.rotp_otw;

import com.pucan4c.rotp_otw.init.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RotpOTWA.MOD_ID)
public class RotpOTWA {
    public static final String MOD_ID = "rotp_otw";
    private static final Logger LOGGER = LogManager.getLogger();

    public RotpOTWA() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        InitItems.ITEMS.register(modEventBus);
        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        InitStands.STANDS.register(modEventBus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
