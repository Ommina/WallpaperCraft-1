package com.Aarron.WallpaperCraft.blocks.wool;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.Aarron.WallpaperCraft.creativeTab.Tab;


public class CheckeredWoolRed extends Block {

public IIcon[] icons = new IIcon[15];

	public CheckeredWoolRed(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName("CheckeredWoolRed");
		this.setHardness(0.4F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setStepSound(soundTypeCloth);
		this.setCreativeTab(Tab.WPtab);
	}

	@Override //Sets how many variations there are
	public IIcon getIcon(int side, int meta) {
		if (meta > 15)
			meta = 0;
		return this.icons[meta];

	}

	@Override //Registers the textures for each block. This is where I set the texture name.
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 15; i ++) {
			this.icons[i] = reg.registerIcon("wp:CheckeredWoolRed-" + i);
		}
}

	@Override //Makes it so that the block dropped has a meta value equal to the block broken
	public int damageDropped(int meta) {
		return meta;
}

	@Override //Tells Minecraft to assign a creative tab for each meta value of the block
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 15; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
} 
}