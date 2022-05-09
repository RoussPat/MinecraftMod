
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purumod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
