package sao.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import sao.mod.Main;
import sao.mod.init.BlockInit;
import sao.mod.init.ItemInit;
import sao.mod.util.IHasModel;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) 
	{	
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.DECORATIONS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0 , "inventory");
	}

}
