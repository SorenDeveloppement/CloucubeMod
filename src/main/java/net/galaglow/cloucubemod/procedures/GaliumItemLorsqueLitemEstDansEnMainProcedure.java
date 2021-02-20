package net.galaglow.cloucubemod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.galaglow.cloucubemod.item.GaliumItemItem;
import net.galaglow.cloucubemod.CloucubemodModElements;
import net.galaglow.cloucubemod.CloucubemodMod;

import java.util.Random;
import java.util.Map;

@CloucubemodModElements.ModElement.Tag
public class GaliumItemLorsqueLitemEstDansEnMainProcedure extends CloucubemodModElements.ModElement {
	public GaliumItemLorsqueLitemEstDansEnMainProcedure(CloucubemodModElements instance) {
		super(instance, 6);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CloucubemodMod.LOGGER.warn("Failed to load dependency entity for procedure GaliumItemLorsqueLitemEstDansEnMain!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				CloucubemodMod.LOGGER.warn("Failed to load dependency itemstack for procedure GaliumItemLorsqueLitemEstDansEnMain!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(GaliumItemItem.block, (int) (1)))
				: false)) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
		}
	}
}
