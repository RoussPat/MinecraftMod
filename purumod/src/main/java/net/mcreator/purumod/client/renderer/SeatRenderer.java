
package net.mcreator.purumod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.purumod.entity.SeatEntity;
import net.mcreator.purumod.client.model.Modelcustom_model;

public class SeatRenderer extends MobRenderer<SeatEntity, Modelcustom_model<SeatEntity>> {
	public SeatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeatEntity entity) {
		return new ResourceLocation("purumod:textures/t_seat.png");
	}
}
