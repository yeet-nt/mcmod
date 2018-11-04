package sao.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import sao.mod.objects.blocks.BlockBase;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block Block_Dragon_Nest = new BlockBase("block_dragon_nest", Material.SNOW);

}
