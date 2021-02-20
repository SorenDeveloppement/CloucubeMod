package net.galaglow.cloucubemod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

import net.galaglow.cloucubemod.block.GaliumFusionBlock;
import net.galaglow.cloucubemod.CloucubemodModElements;
import net.galaglow.cloucubemod.CloucubemodMod;

import java.util.Map;

@CloucubemodModElements.ModElement.Tag
public class GaliumQuandLeBlocVoisinChangeProcedure extends CloucubemodModElements.ModElement {
	public GaliumQuandLeBlocVoisinChangeProcedure(CloucubemodModElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CloucubemodMod.LOGGER.warn("Failed to load dependency x for procedure GaliumQuandLeBlocVoisinChange!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CloucubemodMod.LOGGER.warn("Failed to load dependency y for procedure GaliumQuandLeBlocVoisinChange!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CloucubemodMod.LOGGER.warn("Failed to load dependency z for procedure GaliumQuandLeBlocVoisinChange!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CloucubemodMod.LOGGER.warn("Failed to load dependency world for procedure GaliumQuandLeBlocVoisinChange!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ICE)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
				.getMaterial() == net.minecraft.block.material.Material.ICE)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
				.getMaterial() == net.minecraft.block.material.Material.ICE)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.ICE)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
				.getMaterial() == net.minecraft.block.material.Material.ICE)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
				.getMaterial() == net.minecraft.block.material.Material.ICE)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.LAVA)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = GaliumFusionBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
				.getMaterial() == net.minecraft.block.material.Material.LAVA)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = GaliumFusionBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
				.getMaterial() == net.minecraft.block.material.Material.LAVA)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = GaliumFusionBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
				.getMaterial() == net.minecraft.block.material.Material.LAVA)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = GaliumFusionBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
				.getMaterial() == net.minecraft.block.material.Material.LAVA)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = GaliumFusionBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
				.getMaterial() == net.minecraft.block.material.Material.LAVA)) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = GaliumFusionBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}
