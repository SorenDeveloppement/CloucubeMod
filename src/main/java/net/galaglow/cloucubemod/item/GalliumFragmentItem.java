
package net.galaglow.cloucubemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.galaglow.cloucubemod.itemgroup.CloucubeModItemGroup;
import net.galaglow.cloucubemod.CloucubemodModElements;

@CloucubemodModElements.ModElement.Tag
public class GalliumFragmentItem extends CloucubemodModElements.ModElement {
	@ObjectHolder("cloucubemod:gallium_fragment")
	public static final Item block = null;
	public GalliumFragmentItem(CloucubemodModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CloucubeModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("gallium_fragment");
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
			return 1F;
		}
	}
}
