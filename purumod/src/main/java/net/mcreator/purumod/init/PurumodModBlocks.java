
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purumod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
<<<<<<< HEAD
=======
import net.mcreator.purumod.block.AcaciaTinyLog12Block;
import net.mcreator.purumod.block.AcaciaTinyLog01Block;
>>>>>>> a8fb418774a8d962e23bef616baad12207187cfe
import net.mcreator.purumod.PurumodMod;

public class PurumodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PurumodMod.MODID);
	public static final RegistryObject<Block> OAK_WOODEN_STOOL = REGISTRY.register("oak_wooden_stool", () -> new OakWoodenStoolBlock());
	public static final RegistryObject<Block> BIRCH_WOODEN_STOOL = REGISTRY.register("birch_wooden_stool", () -> new BirchWoodenStoolBlock());
	public static final RegistryObject<Block> DARK_OAK_WOODEN_STOOL = REGISTRY.register("dark_oak_wooden_stool", () -> new DarkOakWoodenStoolBlock());
	public static final RegistryObject<Block> SPRUCE_WOODEN_STOOL = REGISTRY.register("spruce_wooden_stool", () -> new SpruceWoodenStoolBlock());
	public static final RegistryObject<Block> ACACIA_WOODEN_STOOL = REGISTRY.register("acacia_wooden_stool", () -> new AcaciaWoodenStoolBlock());
	public static final RegistryObject<Block> JUNGLE_WOODEN_STOOL = REGISTRY.register("jungle_wooden_stool", () -> new JungleWoodenStoolBlock());
	public static final RegistryObject<Block> OAK_WOODEN_CHAIR = REGISTRY.register("oak_wooden_chair", () -> new OakWoodenChairBlock());
<<<<<<< HEAD
=======
	public static final RegistryObject<Block> OAK_TINY_LOG_01 = REGISTRY.register("oak_tiny_log_01", () -> new OakTinyLog01Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_02 = REGISTRY.register("oak_tiny_log_02", () -> new OakTinyLog02Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_12 = REGISTRY.register("oak_tiny_log_12", () -> new OakTinyLog12Block());
	public static final RegistryObject<Block> BIRCH_TINY_LOG_01 = REGISTRY.register("birch_tiny_log_01", () -> new BirchTinyLog01Block());
	public static final RegistryObject<Block> DARK_OAK_TINY_LOG_01 = REGISTRY.register("dark_oak_tiny_log_01", () -> new DarkOakTinyLog01Block());
	public static final RegistryObject<Block> JUNGLE_TINY_LOG_01 = REGISTRY.register("jungle_tiny_log_01", () -> new JungleTinyLog01Block());
	public static final RegistryObject<Block> SPRUCE_TINY_LOG_01 = REGISTRY.register("spruce_tiny_log_01", () -> new SpruceTinyLog01Block());
	public static final RegistryObject<Block> ACACIA_TINY_LOG_01 = REGISTRY.register("acacia_tiny_log_01", () -> new AcaciaTinyLog01Block());
	public static final RegistryObject<Block> DARK_OAK_TINY_LOG_12 = REGISTRY.register("dark_oak_tiny_log_12", () -> new DarkOakTinyLog12Block());
	public static final RegistryObject<Block> BIRCH_TINY_LOG_12 = REGISTRY.register("birch_tiny_log_12", () -> new BirchTinyLog12Block());
	public static final RegistryObject<Block> JUNGLE_TINY_LOG_12 = REGISTRY.register("jungle_tiny_log_12", () -> new JungleTinyLog12Block());
	public static final RegistryObject<Block> SPRUCE_TINY_LOG_12 = REGISTRY.register("spruce_tiny_log_12", () -> new SpruceTinyLog12Block());
	public static final RegistryObject<Block> ACACIA_TINY_LOG_12 = REGISTRY.register("acacia_tiny_log_12", () -> new AcaciaTinyLog12Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_11 = REGISTRY.register("oak_tiny_log_11", () -> new OakTinyLog11Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_10 = REGISTRY.register("oak_tiny_log_10", () -> new OakTinyLog10Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_09 = REGISTRY.register("oak_tiny_log_09", () -> new OakTinyLog09Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_08 = REGISTRY.register("oak_tiny_log_08", () -> new OakTinyLog08Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_07 = REGISTRY.register("oak_tiny_log_07", () -> new OakTinyLog07Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_06 = REGISTRY.register("oak_tiny_log_06", () -> new OakTinyLog06Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_05 = REGISTRY.register("oak_tiny_log_05", () -> new OakTinyLog05Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_04 = REGISTRY.register("oak_tiny_log_04", () -> new OakTinyLog04Block());
	public static final RegistryObject<Block> OAK_TINY_LOG_03 = REGISTRY.register("oak_tiny_log_03", () -> new OakTinyLog03Block());
>>>>>>> a8fb418774a8d962e23bef616baad12207187cfe

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
