package com.greekoasc.nvidiumplus;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NvidiumPlus implements ClientModInitializer {
    public static final String MOD_ID = "nvidiumplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        // Initialization message in the console
        LOGGER.info("GreekoASC's Nvidium+ addon has successfully loaded.");
        LOGGER.info("Injecting into Nvidium to force shader compatibility...");
    }
}
