
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
import net.mcreator.purumod.block.SpruceTinyLog12Block;
import net.mcreator.purumod.block.SpruceTinyLog01Block;
import net.mcreator.purumod.block.OakWoodenStoolBlock;
import net.mcreator.purumod.block.OakWoodenChairBlock;
import net.mcreator.purumod.block.OakTinyLog12Block;
import net.mcreator.purumod.block.OakTinyLog11Block;
import net.mcreator.purumod.block.OakTinyLog10Block;
import net.mcreator.purumod.block.OakTinyLog09Block;
import net.mcreator.purumod.block.OakTinyLog08Block;
import net.mcreator.purumod.block.OakTinyLog07Block;
import net.mcreator.purumod.block.OakTinyLog06Block;
import net.mcreator.purumod.block.OakTinyLog05Block;
import net.mcreator.purumod.block.OakTinyLog04Block;
import net.mcreator.purumod.block.OakTinyLog03Block;
import net.mcreator.purumod.block.OakTinyLog02Block;
import net.mcreator.purumod.block.OakTinyLog01Block;
import net.mcreator.purumod.block.JungleWoodenStoolBlock;
import net.mcreator.purumod.block.JungleTinyLog12Block;
import net.mcreator.purumod.block.JungleTinyLog01Block;
import net.mcreator.purumod.block.DarkOakWoodenStoolBlock;
import net.mcreator.purumod.block.DarkOakTinyLog12Block;
import net.mcreator.purumod.block.DarkOakTinyLog01Block;
import net.mcreator.purumod.block.BirchWoodenStoolBlock;
import net.mcreator.purumod.block.BirchTinyLog12Block;
import net.mcreator.purumod.block.BirchTinyLog01Block;
import net.mcreator.purumod.block.AcaciaWoodenStoolBlock;
import net.mcreator.purumod.block.AcaciaTinyLog12Block;
import net.mcreator.purumod.block.AcaciaTinyLog01Block;

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
	public static final Block OAK_WOODEN_CHAIR = register(new OakWoodenChairBlock());
	public static final Block OAK_TINY_LOG_01 = register(new OakTinyLog01Block());
	public static final Block OAK_TINY_LOG_02 = register(new OakTinyLog02Block());
	public static final Block OAK_TINY_LOG_12 = register(new OakTinyLog12Block());
	public static final Block BIRCH_TINY_LOG_01 = register(new BirchTinyLog01Block());
	public static final Block DARK_OAK_TINY_LOG_01 = register(new DarkOakTinyLog01Block());
	public static final Block JUNGLE_TINY_LOG_01 = register(new JungleTinyLog01Block());
	public static final Block SPRUCE_TINY_LOG_01 = register(new SpruceTinyLog01Block());
	public static final Block ACACIA_TINY_LOG_01 = register(new AcaciaTinyLog01Block());
	public static final Block DARK_OAK_TINY_LOG_12 = register(new DarkOakTinyLog12Block());
	public static final Block BIRCH_TINY_LOG_12 = register(new BirchTinyLog12Block());
	public static final Block JUNGLE_TINY_LOG_12 = register(new JungleTinyLog12Block());
	public static final Block SPRUCE_TINY_LOG_12 = register(new SpruceTinyLog12Block());
	public static final Block ACACIA_TINY_LOG_12 = register(new AcaciaTinyLog12Block());
	public static final Block OAK_TINY_LOG_11 = register(new OakTinyLog11Block());
	public static final Block OAK_TINY_LOG_10 = register(new OakTinyLog10Block());
	public static final Block OAK_TINY_LOG_09 = register(new OakTinyLog09Block());
	public static final Block OAK_TINY_LOG_08 = register(new OakTinyLog08Block());
	public static final Block OAK_TINY_LOG_07 = register(new OakTinyLog07Block());
	public static final Block OAK_TINY_LOG_06 = register(new OakTinyLog06Block());
	public static final Block OAK_TINY_LOG_05 = register(new OakTinyLog05Block());
	public static final Block OAK_TINY_LOG_04 = register(new OakTinyLog04Block());
	public static final Block OAK_TINY_LOG_03 = register(new OakTinyLog03Block());

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
			OakWoodenChairBlock.registerRenderLayer();
			OakTinyLog01Block.registerRenderLayer();
			OakTinyLog02Block.registerRenderLayer();
			OakTinyLog12Block.registerRenderLayer();
			BirchTinyLog01Block.registerRenderLayer();
			DarkOakTinyLog01Block.registerRenderLayer();
			JungleTinyLog01Block.registerRenderLayer();
			SpruceTinyLog01Block.registerRenderLayer();
			AcaciaTinyLog01Block.registerRenderLayer();
			DarkOakTinyLog12Block.registerRenderLayer();
			BirchTinyLog12Block.registerRenderLayer();
			JungleTinyLog12Block.registerRenderLayer();
			SpruceTinyLog12Block.registerRenderLayer();
			AcaciaTinyLog12Block.registerRenderLayer();
			OakTinyLog11Block.registerRenderLayer();
			OakTinyLog10Block.registerRenderLayer();
			OakTinyLog09Block.registerRenderLayer();
			OakTinyLog08Block.registerRenderLayer();
			OakTinyLog07Block.registerRenderLayer();
			OakTinyLog06Block.registerRenderLayer();
			OakTinyLog05Block.registerRenderLayer();
			OakTinyLog04Block.registerRenderLayer();
			OakTinyLog03Block.registerRenderLayer();
		}
	}
}
