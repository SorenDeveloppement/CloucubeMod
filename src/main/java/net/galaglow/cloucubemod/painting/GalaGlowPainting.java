
package net.galaglow.cloucubemod.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.galaglow.cloucubemod.CloucubemodModElements;

@CloucubemodModElements.ModElement.Tag
public class GalaGlowPainting extends CloucubemodModElements.ModElement {
	public GalaGlowPainting(CloucubemodModElements instance) {
		super(instance, 1);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(128, 128).setRegistryName("gala_glow"));
	}
}
