
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
import net.mcreator.purumod.block.OakWoodenStoolBlock;
import net.mcreator.purumod.block.OakWoodenChairBlock;
import net.mcreator.purumod.block.JungleWoodenStoolBlock;
import net.mcreator.purumod.block.DarkOakWoodenStoolBlock;
import net.mcreator.purumod.block.BirchWoodenStoolBlock;
import net.mcreator.purumod.block.AcaciaWoodenStoolBlock;
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
		}
	}
}
