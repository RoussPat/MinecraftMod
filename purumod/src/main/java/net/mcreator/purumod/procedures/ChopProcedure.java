package net.mcreator.purumod.procedures;

import net.mcreator.purumod.init.PurumodModItems;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;
import java.util.function.Supplier;

public class ChopProcedure {
    public static void execute(Entity entity) {
        if (entity == null) return;
        if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
            if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem()) {
                if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
                    if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                        ItemStack _setstack = new ItemStack(PurumodModItems.OAK_TINY_LOG.get());
                        _setstack.setCount(12);
                        ((Slot) _slots.get(0)).set(_setstack);
                        _player.containerMenu.broadcastChanges();
                    }
                } else {
                    if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_LOG.asItem()) {
                        if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                            ItemStack _setstack = new ItemStack(PurumodModItems.SPRUCE_TINY_LOG.get());
                            _setstack.setCount(12);
                            ((Slot) _slots.get(0)).set(_setstack);
                            _player.containerMenu.broadcastChanges();
                        }
                    } else {
                        if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {
                            if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                                ItemStack _setstack = new ItemStack(PurumodModItems.BIRCH_TINY_LOG.get());
                                _setstack.setCount(12);
                                ((Slot) _slots.get(0)).set(_setstack);
                                _player.containerMenu.broadcastChanges();
                            }
                        } else {
                            if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_LOG.asItem()) {
                                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                                    ItemStack _setstack = new ItemStack(PurumodModItems.JUNGLE_TINY_LOG.get());
                                    _setstack.setCount(12);
                                    ((Slot) _slots.get(0)).set(_setstack);
                                    _player.containerMenu.broadcastChanges();
                                }
                            } else {
                                if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_LOG.asItem()) {
                                    if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                                        ItemStack _setstack = new ItemStack(PurumodModItems.ACACIA_TINY_LOG.get());
                                        _setstack.setCount(12);
                                        ((Slot) _slots.get(0)).set(_setstack);
                                        _player.containerMenu.broadcastChanges();
                                    }
                                } else {
                                    if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
                                        if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                                            ItemStack _setstack = new ItemStack(PurumodModItems.DARK_OAK_TINY_LOG.get());
                                            _setstack.setCount(12);
                                            ((Slot) _slots.get(0)).set(_setstack);
                                            _player.containerMenu.broadcastChanges();
                                        }
                                    } else {
                                        if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                                            ((Slot) _slots.get(0)).set(ItemStack.EMPTY);
                                            _player.containerMenu.broadcastChanges();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(0)).set(ItemStack.EMPTY);
                    _player.containerMenu.broadcastChanges();
                }
            }
        } else {
            if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
                ((Slot) _slots.get(0)).set(ItemStack.EMPTY);
                _player.containerMenu.broadcastChanges();
            }
        }
    }
}
