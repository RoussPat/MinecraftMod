package net.mcreator.purumod.item;

import net.minecraft.world.item.*;

public class SpruceTinyLogBackupItem extends Item {
    public SpruceTinyLogBackupItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }
}
