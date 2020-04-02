package com.mod.nemixmod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister
{
	public static void mainRegistry() 
	{
		registerWorldGen(new WorldGenNemix(), -1);
		registerWorldGen(new WorldGenNemix(), -0);
		registerWorldGen(new WorldGenNemix(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator IGenerator, int probability)
	{
		GameRegistry.registerWorldGenerator(IGenerator, probability);
	}
}
