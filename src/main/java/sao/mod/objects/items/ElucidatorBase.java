package sao.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sao.mod.Main;
import sao.mod.init.ItemInit;
import sao.mod.util.IHasModel;

public class ElucidatorBase extends Item implements IHasModel 
{
	public ElucidatorBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.DECORATIONS);
		
		ItemInit.ITEMS.add(this);
	}	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0 , "inventory");
	}

}
