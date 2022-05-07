
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purumod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.purumod.item.OakTinyLogItemItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PurumodModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item OAK_WOODEN_STOOL = register(PurumodModBlocks.OAK_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final Item BIRCH_WOODEN_STOOL = register(PurumodModBlocks.BIRCH_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final Item DARK_OAK_WOODEN_STOOL = register(PurumodModBlocks.DARK_OAK_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SPRUCE_WOODEN_STOOL = register(PurumodModBlocks.SPRUCE_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ACACIA_WOODEN_STOOL = register(PurumodModBlocks.ACACIA_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final Item JUNGLE_WOODEN_STOOL = register(PurumodModBlocks.JUNGLE_WOODEN_STOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_WOODEN_CHAIR = register(PurumodModBlocks.OAK_WOODEN_CHAIR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item OAK_TINY_LOG_ITEM = register(new OakTinyLogItemItem());
	public static final Item OAK_TINY_LOG_01 = register(PurumodModBlocks.OAK_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_02 = register(PurumodModBlocks.OAK_TINY_LOG_02, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_12 = register(PurumodModBlocks.OAK_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final Item BIRCH_TINY_LOG_01 = register(PurumodModBlocks.BIRCH_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final Item DARK_OAK_TINY_LOG_01 = register(PurumodModBlocks.DARK_OAK_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final Item JUNGLE_TINY_LOG_01 = register(PurumodModBlocks.JUNGLE_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SPRUCE_TINY_LOG_01 = register(PurumodModBlocks.SPRUCE_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ACACIA_TINY_LOG_01 = register(PurumodModBlocks.ACACIA_TINY_LOG_01, CreativeModeTab.TAB_DECORATIONS);
	public static final Item DARK_OAK_TINY_LOG_12 = register(PurumodModBlocks.DARK_OAK_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final Item BIRCH_TINY_LOG_12 = register(PurumodModBlocks.BIRCH_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final Item JUNGLE_TINY_LOG_12 = register(PurumodModBlocks.JUNGLE_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SPRUCE_TINY_LOG_12 = register(PurumodModBlocks.SPRUCE_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final Item ACACIA_TINY_LOG_12 = register(PurumodModBlocks.ACACIA_TINY_LOG_12, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_11 = register(PurumodModBlocks.OAK_TINY_LOG_11, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_10 = register(PurumodModBlocks.OAK_TINY_LOG_10, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_09 = register(PurumodModBlocks.OAK_TINY_LOG_09, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_08 = register(PurumodModBlocks.OAK_TINY_LOG_08, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_07 = register(PurumodModBlocks.OAK_TINY_LOG_07, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_06 = register(PurumodModBlocks.OAK_TINY_LOG_06, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_05 = register(PurumodModBlocks.OAK_TINY_LOG_05, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_04 = register(PurumodModBlocks.OAK_TINY_LOG_04, CreativeModeTab.TAB_DECORATIONS);
	public static final Item OAK_TINY_LOG_03 = register(PurumodModBlocks.OAK_TINY_LOG_03, CreativeModeTab.TAB_DECORATIONS);
	public static final Item SEAT = register(
			new SpawnEggItem(PurumodModEntities.SEAT, -1, -1, new Item.Properties().tab(null)).setRegistryName("seat_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
