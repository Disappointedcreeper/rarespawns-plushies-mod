package io.github.disappointedcreeper.rarespawns_plushies_mod;

import io.github.disappointedcreeper.rarespawns_plushies_mod.sewing_table.SewingTableBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class RarespawnsPlushiesBlocks {
	public static final Block SEWING_TABLE = new SewingTableBlock(QuiltBlockSettings.create());
	public static void register(ModContainer mod) {
		Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "sewing_table"), SEWING_TABLE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "sewing_table"), new BlockItem(SEWING_TABLE, new QuiltItemSettings()));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.addItem(SEWING_TABLE.asItem());
		});
	}
}
