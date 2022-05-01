
package net.mcreator.purumod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.purumod.init.PurumodModItems;
import net.mcreator.purumod.init.PurumodModBlocks;

import java.util.List;
import java.util.Collections;

public class DarkOakTinyLog12Block extends Block implements SimpleWaterloggedBlock

{
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public DarkOakTinyLog12Block() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(0f, 1f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
		setRegistryName("dark_oak_tiny_log_12");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		switch ((Direction) state.getValue(FACING)) {
			case SOUTH :
			default :
				return Shapes.or(box(0, 0, 0, 4, 4, 16), box(6, 0, 0, 10, 4, 16), box(11, 0, 0, 15, 4, 16), box(1, 4, 0, 5, 8, 16),
						box(5, 4, 0, 9, 8, 16), box(12, 4, 0, 16, 8, 16), box(0, 8, 0, 4, 12, 16), box(6, 8, 0, 10, 12, 16),
						box(10, 8, 0, 14, 12, 16), box(2, 12, 0, 6, 16, 16), box(6, 12, 0, 10, 16, 16), box(11, 12, 0, 15, 16.1, 16))
						.move(offset.x, offset.y, offset.z);
			case NORTH :
				return Shapes
						.or(box(12, 0, 0, 16, 4, 16), box(6, 0, 0, 10, 4, 16), box(1, 0, 0, 5, 4, 16), box(11, 4, 0, 15, 8, 16),
								box(7, 4, 0, 11, 8, 16), box(0, 4, 0, 4, 8, 16), box(12, 8, 0, 16, 12, 16), box(6, 8, 0, 10, 12, 16),
								box(2, 8, 0, 6, 12, 16), box(10, 12, 0, 14, 16, 16), box(6, 12, 0, 10, 16, 16), box(1, 12, 0, 5, 16.1, 16))
						.move(offset.x, offset.y, offset.z);
			case EAST :
				return Shapes
						.or(box(0, 0, 12, 16, 4, 16), box(0, 0, 6, 16, 4, 10), box(0, 0, 1, 16, 4, 5), box(0, 4, 11, 16, 8, 15),
								box(0, 4, 7, 16, 8, 11), box(0, 4, 0, 16, 8, 4), box(0, 8, 12, 16, 12, 16), box(0, 8, 6, 16, 12, 10),
								box(0, 8, 2, 16, 12, 6), box(0, 12, 10, 16, 16, 14), box(0, 12, 6, 16, 16, 10), box(0, 12, 1, 16, 16.1, 5))
						.move(offset.x, offset.y, offset.z);
			case WEST :
				return Shapes.or(box(0, 0, 0, 16, 4, 4), box(0, 0, 6, 16, 4, 10), box(0, 0, 11, 16, 4, 15), box(0, 4, 1, 16, 8, 5),
						box(0, 4, 5, 16, 8, 9), box(0, 4, 12, 16, 8, 16), box(0, 8, 0, 16, 12, 4), box(0, 8, 6, 16, 12, 10),
						box(0, 8, 10, 16, 12, 14), box(0, 12, 2, 16, 16, 6), box(0, 12, 6, 16, 16, 10), box(0, 12, 11, 16, 16.1, 15))
						.move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, WATERLOGGED);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;;
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos,
			BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.getLiquidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(PurumodModItems.OAK_TINY_LOG_ITEM, (int) (2)));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(PurumodModBlocks.DARK_OAK_TINY_LOG_12, renderType -> renderType == RenderType.cutout());
	}
}
