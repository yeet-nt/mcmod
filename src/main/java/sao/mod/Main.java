package sao.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sao.mod.proxy.ProxyCommon;
import sao.mod.util.References;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Main {

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
	public static ProxyCommon proxy;

	public static void preInit(FMLPreInitializationEvent event) {} {

	}

	public static void Init(FMLInitializationEvent event) {} {

	}

	public static void postInit(FMLPostInitializationEvent event) {} {

	}

}

