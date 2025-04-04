package io.github.disappointedcreeper.rarespawns_plushies_mod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RarespawnsPlushiesMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Rarespawns Plushies Mod");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		RarespawnsPlushiesItems.register(mod);
		RarespawnsPlushiesBlocks.register(mod);
    }
}
