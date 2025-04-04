package io.github.disappointedcreeper.rarespawns_plushies_mod;

import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class RarespawnsPlushiesItems {
	public static final Item ITEM_TEST = new Item(new QuiltItemSettings());
	public static void register(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "item_test"), ITEM_TEST);
	}
}
