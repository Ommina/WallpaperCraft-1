package Aarron.WallpaperCraft.Blocks.Carpets.Dotted;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.BlockStates.BlockStates;
import Aarron.WallpaperCraft.BlockStates.BlockTypes;
import Aarron.WallpaperCraft.Blocks.MetaBlock;


public class DottedCarpetBlue extends MetaBlock<BlockTypes> {

	public DottedCarpetBlue() {
		super(Material.CLOTH, "DottedCarpetBlue");
		this.setSoundType(SoundType.CLOTH);
	}

	@Override
	protected BlockTypes getDefaultStateVariant() {
		return BlockTypes.Zero;
	}

	@Override
	protected BlockTypes fromMeta(int meta) {
		return BlockTypes.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes> getVariantEnum() {
		return BlockStates.WPblocks;
	}
}