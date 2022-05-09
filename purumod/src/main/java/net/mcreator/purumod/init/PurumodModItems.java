
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

import net.mcreator.purumod.item.OakTinyLogItemItem;
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
	public static final RegistryObject<Item> OAK_TINY_LOG_ITEM = REGISTRY.register("oak_tiny_log_item", () -> new OakTinyLogItemItem());
	public static final RegistryObject<Item> OAK_TINY_LOG_01 = block(PurumodModBlocks.OAK_TINY_LOG_01, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_02 = block(PurumodModBlocks.OAK_TINY_LOG_02, null);
	public static final RegistryObject<Item> OAK_TINY_LOG_12 = block(PurumodModBlocks.OAK_TINY_LOG_12, null);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_01 = block(PurumodModBlocks.BIRCH_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_01 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_01 = block(PurumodModBlocks.JUNGLE_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_01 = block(PurumodModBlocks.SPRUCE_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_01 = block(PurumodModBlocks.ACACIA_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DARK_OAK_TINY_LOG_12 = block(PurumodModBlocks.DARK_OAK_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BIRCH_TINY_LOG_12 = block(PurumodModBlocks.BIRCH_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> JUNGLE_TINY_LOG_12 = block(PurumodModBlocks.JUNGLE_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SPRUCE_TINY_LOG_12 = block(PurumodModBlocks.SPRUCE_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ACACIA_TINY_LOG_12 = block(PurumodModBlocks.ACACIA_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
