package sao.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import sao.mod.objects.items.CrystalBase;
import sao.mod.objects.items.ElucidatorBase;
import sao.mod.objects.items.ItemBase;

public class ItemInit {
	
	
public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item ETERNAL_ICE = new ItemBase("shard_eternal_ice"); //Add Crafting recipe, Drops from Elite Dragon snow
	
	public static final Item CRYSTALLITE_INGOT = new ItemBase("ingot_crystallite"); //Add Everything
	
	public static final Item TELEPORT_CRYSTAL = new CrystalBase("crystal_teleport"); // Add Everything
	
	public static final Item HEALING_CRYSTAL = new CrystalBase("crystal_healing"); //Add Everything
	
	public static final Item ELUCIDATOR = new ElucidatorBase("sword_elucidator"); //Add Everything
	

}
