
package net.galaglow.cloucubemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.galaglow.cloucubemod.procedures.GaliumItemLorsqueLitemEstDansEnMainProcedure;
import net.galaglow.cloucubemod.itemgroup.CloucubeModItemGroup;
import net.galaglow.cloucubemod.CloucubemodModElements;

import java.util.Map;
import java.util.HashMap;

@CloucubemodModElements.ModElement.Tag
public class GaliumItemItem extends CloucubemodModElements.ModElement {
	@ObjectHolder("cloucubemod:galium_item")
	public static final Item block = null;
	public GaliumItemItem(CloucubemodModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CloucubeModItemGroup.tab).maxDamage(10000).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("galium_item");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return -0.1F;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (selected) {
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("itemstack", itemstack);
				GaliumItemLorsqueLitemEstDansEnMainProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
