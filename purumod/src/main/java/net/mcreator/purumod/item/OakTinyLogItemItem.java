
package net.mcreator.purumod.item;

import net.mcreator.purumod.PurumodMod;
import net.mcreator.purumod.procedures.OnTinyLogItemUseProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import org.apache.logging.log4j.Logger;

public class OakTinyLogItemItem extends Item {

    static Logger logger = PurumodMod.LOGGER;
    public OakTinyLogItemItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
        setRegistryName("oak_tiny_log_item");
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
