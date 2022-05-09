
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purumod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.purumod.item.SpruceTinyLogItem;
import net.mcreator.purumod.item.SpruceTinyLogBackupItem;
import net.mcreator.purumod.item.OakTinyLogItem;
import net.mcreator.purumod.item.OakTinyLogBackupItem;
import net.mcreator.purumod.item.JungleTinyLogItem;
import net.mcreator.purumod.item.JungleTinyLogBackupItem;
import net.mcreator.purumod.item.DarkOakTinyLogItem;
import net.mcreator.purumod.item.DarkOakTinyLogBackupItem;
import net.mcreator.purumod.item.BirchTinyLogItem;
import net.mcreator.purumod.item.BirchTinyLogBackupItem;
import net.mcreator.purumod.item.AcaciaTinyLogItem;
import net.mcreator.purumod.item.AcaciaTinyLogBackupItem;
import net.mcreator.purumod.PurumodMod;

public class PurumodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PurumodMod.MODID);
	public static final RegistryObject<Item> OAK_WOODEN_STOOL = block(PurumodModBlocks.OAK_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BIRCH_WOODEN_STOOL = block(PurumodModBlocks.BIRCH_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DARK_OAK_WOODEN_STOOL = block(PurumodModBlocks.DARK_OAK_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SPRUCE_WOODEN_STOOL = block(PurumodModBlocks.SPRUCE_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ACACIA_WOODEN_STOOL = block(PurumodModBlocks.ACACIA_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> JUNGLE_WOODEN_STOOL = block(PurumodModBlocks.JUNGLE_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> OAK_WOODEN_CHAIR = block(PurumodModBlocks.OAK_WOODEN_CHAIR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OAK_TINY_LOG_01 = block(PurumodModBlocks.OAK_TINY_LOG_01, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_02 = block(PurumodModBlocks.OAK_TINY_LOG_02, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_12 = block(PurumodModBlocks.OAK_TINY_LOG_12, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_01 = block(PurumodModBlocks.SPRUCE_TINY_LOG_01, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_11 = block(PurumodModBlocks.OAK_TINY_LOG_11, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_10 = block(PurumodModBlocks.OAK_TINY_LOG_10, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_09 = block(PurumodModBlocks.OAK_TINY_LOG_09, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_08 = block(PurumodModBlocks.OAK_TINY_LOG_08, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_07 = block(PurumodModBlocks.OAK_TINY_LOG_07, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_06 = block(PurumodModBlocks.OAK_TINY_LOG_06, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_05 = block(PurumodModBlocks.OAK_TINY_LOG_05, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_04 = block(PurumodModBlocks.OAK_TINY_LOG_04, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_03 = block(PurumodModBlocks.OAK_TINY_LOG_03, null);
	public static final RegistryObject<Item> SEAT = REGISTRY.register("seat_spawn_egg",
			() -> new ForgeSpawnEggItem(PurumodModEntities.SEAT, -1, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_02 = block(PurumodModBlocks.SPRUCE_TINY_LOG_02, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_03 = block(PurumodModBlocks.SPRUCE_TINY_LOG_03, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_04 = block(PurumodModBlocks.SPRUCE_TINY_LOG_04, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_05 = block(PurumodModBlocks.SPRUCE_TINY_LOG_05, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_06 = block(PurumodModBlocks.SPRUCE_TINY_LOG_06, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_07 = block(PurumodModBlocks.SPRUCE_TINY_LOG_07, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_08 = block(PurumodModBlocks.SPRUCE_TINY_LOG_08, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_09 = block(PurumodModBlocks.SPRUCE_TINY_LOG_09, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_10 = block(PurumodModBlocks.SPRUCE_TINY_LOG_10, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_11 = block(PurumodModBlocks.SPRUCE_TINY_LOG_11, null);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_12 = block(PurumodModBlocks.SPRUCE_TINY_LOG_12, null);
	public static final RegistryObject<Item> OAK_TINY_LOG = REGISTRY.register("oak_tiny_log", () -> new OakTinyLogItem());
	public static final RegistryObject<Item> SPRUCE_TINY_LOG = REGISTRY.register("spruce_tiny_log", () -> new SpruceTinyLogItem());
	public static final RegistryObject<Item> BIRCH_TINY_LOG = REGISTRY.register("birch_tiny_log", () -> new BirchTinyLogItem());
	public static final RegistryObject<Item> JUNGLE_TINY_LOG = REGISTRY.register("jungle_tiny_log", () -> new JungleTinyLogItem());
	public static final RegistryObject<Item> ACACIA_TINY_LOG = REGISTRY.register("acacia_tiny_log", () -> new AcaciaTinyLogItem());
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG = REGISTRY.register("dark_oak_tiny_log", () -> new DarkOakTinyLogItem());
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_01 = block(PurumodModBlocks.JUNGLE_TINY_LOG_01, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_01 = block(PurumodModBlocks.BIRCH_TINY_LOG_01, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_01 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_01, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_01 = block(PurumodModBlocks.ACACIA_TINY_LOG_01, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_02 = block(PurumodModBlocks.ACACIA_TINY_LOG_02, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_02 = block(PurumodModBlocks.BIRCH_TINY_LOG_02, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_02 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_02, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_02 = block(PurumodModBlocks.JUNGLE_TINY_LOG_02, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_03 = block(PurumodModBlocks.ACACIA_TINY_LOG_03, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_03 = block(PurumodModBlocks.BIRCH_TINY_LOG_03, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_03 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_03, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_03 = block(PurumodModBlocks.JUNGLE_TINY_LOG_03, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_04 = block(PurumodModBlocks.ACACIA_TINY_LOG_04, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_04 = block(PurumodModBlocks.BIRCH_TINY_LOG_04, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_04 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_04, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_04 = block(PurumodModBlocks.JUNGLE_TINY_LOG_04, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_05 = block(PurumodModBlocks.ACACIA_TINY_LOG_05, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_05 = block(PurumodModBlocks.BIRCH_TINY_LOG_05, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_05 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_05, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_05 = block(PurumodModBlocks.JUNGLE_TINY_LOG_05, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_06 = block(PurumodModBlocks.ACACIA_TINY_LOG_06, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_06 = block(PurumodModBlocks.BIRCH_TINY_LOG_06, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_06 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_06, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_06 = block(PurumodModBlocks.JUNGLE_TINY_LOG_06, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_07 = block(PurumodModBlocks.ACACIA_TINY_LOG_07, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_07 = block(PurumodModBlocks.BIRCH_TINY_LOG_07, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_07 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_07, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_07 = block(PurumodModBlocks.JUNGLE_TINY_LOG_07, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_08 = block(PurumodModBlocks.ACACIA_TINY_LOG_08, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_08 = block(PurumodModBlocks.BIRCH_TINY_LOG_08, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_08 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_08, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_08 = block(PurumodModBlocks.JUNGLE_TINY_LOG_08, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_09 = block(PurumodModBlocks.ACACIA_TINY_LOG_09, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_09 = block(PurumodModBlocks.BIRCH_TINY_LOG_09, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_09 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_09, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_09 = block(PurumodModBlocks.JUNGLE_TINY_LOG_09, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_10 = block(PurumodModBlocks.ACACIA_TINY_LOG_10, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_10 = block(PurumodModBlocks.BIRCH_TINY_LOG_10, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_10 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_10, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_10 = block(PurumodModBlocks.JUNGLE_TINY_LOG_10, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_11 = block(PurumodModBlocks.ACACIA_TINY_LOG_11, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_11 = block(PurumodModBlocks.BIRCH_TINY_LOG_11, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_11 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_11, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_11 = block(PurumodModBlocks.JUNGLE_TINY_LOG_11, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_12 = block(PurumodModBlocks.ACACIA_TINY_LOG_12, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_12 = block(PurumodModBlocks.BIRCH_TINY_LOG_12, null);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_12 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_12, null);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_12 = block(PurumodModBlocks.JUNGLE_TINY_LOG_12, null);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_BACKUP = REGISTRY.register("acacia_tiny_log_backup",
			() -> new AcaciaTinyLogBackupItem());
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_BACKUP = REGISTRY.register("spruce_tiny_log_backup",
			() -> new SpruceTinyLogBackupItem());
	public static final RegistryObject<Item> BIRCH_TINY_LOG_BACKUP = REGISTRY.register("birch_tiny_log_backup", () -> new BirchTinyLogBackupItem());
	public static final RegistryObject<Item> OAK_TINY_LOG_BACKUP = REGISTRY.register("oak_tiny_log_backup", () -> new OakTinyLogBackupItem());
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_BACKUP = REGISTRY.register("jungle_tiny_log_backup",
			() -> new JungleTinyLogBackupItem());
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_BACKUP = REGISTRY.register("dark_oak_tiny_log_backup",
			() -> new DarkOakTinyLogBackupItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
