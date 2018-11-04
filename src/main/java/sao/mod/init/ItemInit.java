package sao.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import sao.mod.objects.items.ElucidatorBase;
import sao.mod.objects.items.Healcrystal;
import sao.mod.objects.items.ItemBase;
import sao.mod.objects.items.Telecrystal;

public class ItemInit {
	
	
public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item ETERNAL_ICE = new ItemBase("shard_eternal_ice"); //Add Crafting recipe --> Drops from Frost Dragon nest block
	
	public static final Item CRYSTALLITE_INGOT = new ItemBase("ingot_crystallite"); //Can be used to craft Dark Repulser --> add texture, crafting recipe
	
	public static final Item TELEPORT_CRYSTAL = new Telecrystal("crystal_teleport"); // Add Teleport function, texture
	
	public static final Item HEALING_CRYSTAL = new Healcrystal("crystal_healing"); //Add Healing fucntion, texture
	
	public static final Item ELUCIDATOR = new ElucidatorBase("sword_elucidator"); //Add Everything
	

}
