
package net.galaglow.cloucubemod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.galaglow.cloucubemod.itemgroup.CloucubeModItemGroup;
import net.galaglow.cloucubemod.item.GaliumItemItem;
import net.galaglow.cloucubemod.CloucubemodModElements;

import java.util.List;
import java.util.Collections;

@CloucubemodModElements.ModElement.Tag
public class GalliumOreBlock extends CloucubemodModElements.ModElement {
	@ObjectHolder("cloucubemod:gallium_ore")
	public static final Block block = null;
	public GalliumOreBlock(CloucubemodModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(CloucubeModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("gallium_ore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(GaliumItemItem.block, (int) (4)));
		}
	}
}
