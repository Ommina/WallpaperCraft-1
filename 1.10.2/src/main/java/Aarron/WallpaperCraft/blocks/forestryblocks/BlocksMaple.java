package Aarron.WallpaperCraft.blocks.forestryblocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.blockStates.BlockStates;
import Aarron.WallpaperCraft.blockStates.BlockTypes3;
import Aarron.WallpaperCraft.blocks.IMetaBlock3;

public class BlocksMaple extends IMetaBlock3<BlockTypes3> {

	public BlocksMaple() {
		super(Material.WOOD, "blocksmaple");
		this.setSoundType(SoundType.WOOD);
	}

	@Override
	protected BlockTypes3 getDefaultStateVariant() {
		return BlockTypes3.Zero;
	}

	@Override
	protected BlockTypes3 fromMeta(int meta) {
		return BlockTypes3.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes3> getVariantEnum() {
		return BlockStates.WPblocks3;
	}
}