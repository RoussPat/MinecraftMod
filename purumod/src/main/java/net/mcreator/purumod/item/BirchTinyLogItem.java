package net.mcreator.purumod.item;

import net.mcreator.purumod.OnTinyLogItemUseProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;

public class BirchTinyLogItem extends Item {
    public BirchTinyLogItem() {
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

    @Override
    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = super.useOn(context);
        OnTinyLogItemUseProcedure.execute(context);
        return retval;
    }
}
