
package net.galaglow.cloucubemod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.galaglow.cloucubemod.block.GaliumBlock;
import net.galaglow.cloucubemod.CloucubemodModElements;

@CloucubemodModElements.ModElement.Tag
public class CloucubeModItemGroup extends CloucubemodModElements.ModElement {
	public CloucubeModItemGroup(CloucubemodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcloucube_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GaliumBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
