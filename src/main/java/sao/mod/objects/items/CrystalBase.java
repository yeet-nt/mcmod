package sao.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sao.mod.Main;
import sao.mod.init.ItemInit;
import sao.mod.util.IHasModel;

public class CrystalBase extends Item implements IHasModel 
{
	public CrystalBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.DECORATIONS);
		this.maxStackSize = 1;
		ItemInit.ITEMS.add(this);
	}	
	@Override
	public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0 , "inventory");
	}
	@Override
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }

}

