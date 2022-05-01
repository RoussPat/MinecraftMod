package net.mcreator.purumod.procedures;

import net.mcreator.purumod.PurumodMod;
import net.mcreator.purumod.block.OakTinyLog01Block;
import net.mcreator.purumod.init.PurumodModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.Objects;

public class OnTinyLogItemUseProcedure {
    static Logger logger = PurumodMod.LOGGER;

    public static void execute(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState blockstate = context.getLevel().getBlockState(pos);
        ItemStack itemstack = context.getItemInHand();
        Player player = context.getPlayer();
        Direction clickedFace = context.getClickedFace();
        InteractionHand hand = context.getHand();
        logger.info("OnTinyLogItemUseProcedure called with args :");
        logger.info(world.toString());
        logger.info(pos.toString());
        logger.info(blockstate.toString());
        logger.info(itemstack.toString());
        logger.info(player.toString());
        String descriptionId = Objects.requireNonNull(blockstate.getBlock().getRegistryName()).toString();
        if (descriptionId.contains("tiny_log")) {
            logger.info("Tiny Log detected");
            String[] descriptionIdSplit = descriptionId.split("_");
            String woodType = descriptionIdSplit[0];
            int stackSize = Integer.parseInt(descriptionIdSplit[descriptionIdSplit.length - 1]);

            if (stackSize < 12) {
                if (itemstack.getCount() > 1) {
                    itemstack.setCount(itemstack.getCount() - 1);
                    BlockState newBlock = getNextBlock(blockstate.getBlock());
                    copyAllProperties(world.getBlockState(pos), newBlock);
                    Direction initialDirection = blockstate.getValue(HorizontalDirectionalBlock.FACING);
                    world.setBlock(pos, newBlock, 3);
                    setDirectionForBlock(world,initialDirection,pos);
                }
            } else {

                placeBlockNormaly(world, pos, player, clickedFace);
            }
        } else {
            placeBlockNormaly(world, pos, player, clickedFace);
        }
    }

    private static void placeBlockNormaly(Level world, BlockPos pos, Player player, Direction clickedFace) {
        var newpos = computeNewPos(clickedFace, pos);
        world.setBlock(newpos, PurumodModBlocks.OAK_TINY_LOG_01.defaultBlockState(), 3);
        setDirectionForBlock(world, player.getDirection(), newpos);

    }

    private static void setDirectionForBlock(Level world, Direction direction, BlockPos pos) {
        BlockState _bs = world.getBlockState(pos);
        Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
        if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(direction)) {
            world.setBlock(pos, _bs.setValue(_dp, direction), 3);
        } else {
            _property = _bs.getBlock().getStateDefinition().getProperty("axis");
            if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(direction.getAxis()))
                world.setBlock(pos, _bs.setValue(_ap, direction.getAxis()), 3);
        }
    }

    private static BlockPos computeNewPos(Direction clickedFace, BlockPos pos) {
        return new BlockPos(pos.getX() + clickedFace.getStepX(), pos.getY() + clickedFace.getStepY(), pos.getZ() + clickedFace.getStepZ());
    }

    private static BlockState getNextBlock(Block block) {
        if (PurumodModBlocks.OAK_TINY_LOG_01.equals(block)) {
            return PurumodModBlocks.OAK_TINY_LOG_02.defaultBlockState();
        } else if (PurumodModBlocks.OAK_TINY_LOG_02.equals(block)) {
            return PurumodModBlocks.OAK_TINY_LOG_12.defaultBlockState();
        }
        return PurumodModBlocks.OAK_TINY_LOG_01.defaultBlockState();

    }

    private static BlockState copyAllProperties(BlockState source, BlockState destination) {
        for (Map.Entry<Property<?>, Comparable<?>> entry : source.getValues().entrySet()) {
            Property property = source.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (property != null && destination.getValue(property) != null) {
                try {
                    destination = destination.setValue(property, (Comparable) entry.getValue());
                } catch (Exception e) {
                }
            }
        }
        return destination;
    }
}
