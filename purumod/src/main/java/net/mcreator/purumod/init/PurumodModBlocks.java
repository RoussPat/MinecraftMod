
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purumod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.purumod.block.SpruceWoodenStoolBlock;
import net.mcreator.purumod.block.OakWoodenStoolBlock;
import net.mcreator.purumod.block.JungleWoodenStoolBlock;
import net.mcreator.purumod.block.DarkOakWoodenStoolBlock;
import net.mcreator.purumod.block.BirchWoodenStoolBlock;
import net.mcreator.purumod.block.AcaciaWoodenStoolBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PurumodModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block OAK_WOODEN_STOOL = register(new OakWoodenStoolBlock());
	public static final Block BIRCH_WOODEN_STOOL = register(new BirchWoodenStoolBlock());
	public static final Block DARK_OAK_WOODEN_STOOL = register(new DarkOakWoodenStoolBlock());
	public static final Block SPRUCE_WOODEN_STOOL = register(new SpruceWoodenStoolBlock());
	public static final Block ACACIA_WOODEN_STOOL = register(new AcaciaWoodenStoolBlock());
	public static final Block JUNGLE_WOODEN_STOOL = register(new JungleWoodenStoolBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			OakWoodenStoolBlock.registerRenderLayer();
			BirchWoodenStoolBlock.registerRenderLayer();
			DarkOakWoodenStoolBlock.registerRenderLayer();
			SpruceWoodenStoolBlock.registerRenderLayer();
			AcaciaWoodenStoolBlock.registerRenderLayer();
			JungleWoodenStoolBlock.registerRenderLayer();
		}
	}
}
