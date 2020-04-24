package com.mod.nemixmod.init;

import com.mod.nemixmod.NemixMod;
import com.mod.nemixmod.Reference;
import com.mod.nemixmod.blocks.BlockBasic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockMod
{
	public static Block nemix_block, nemix_ore;
	public static void init()
	{
		nemix_block = new BlockBasic(Material.rock).setBlockName("nemix_block").setCreativeTab(NemixMod.nemixtab).setBlockTextureName(Reference.MOD_ID + ":nemix_block");
		nemix_ore = new BlockBasic(Material.rock).setBlockName("nemix_ore").setCreativeTab(NemixMod.nemixtab).setBlockTextureName(Reference.MOD_ID + ":nemix_ore");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(nemix_block, nemix_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(nemix_ore, nemix_ore.getUnlocalizedName().substring(5));
		GameRegistry.addSmelting(BlockMod.nemix_ore, new ItemStack(ItemMod.nemix_ingot, 1), 10.0F);
		GameRegistry.addRecipe(new ItemStack(BlockMod.nemix_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.nemix_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_ingot, 9), new Object[] {"#", '#', BlockMod.nemix_block});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_sword, 1), new Object[] {"  N", "  N", "  S", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_sword, 1), new Object[] {" N ", " N ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_sword, 1), new Object[] {"N  ", "N  ", "S  ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_pickaxe, 1), new Object[] {"NNN", " S ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_axe, 1), new Object[] {"NN ", "NS ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_hoe, 1), new Object[] {"NN ", " S ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_helmet, 1), new Object[] {"NNN", "N N", 'N', ItemMod.nemix_ingot,});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_chestplate, 1), new Object[] {"NNN", "NNN", "N N", 'N', ItemMod.nemix_ingot,});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_leggings, 1), new Object[] {"NNN", "N N", "N N", 'N', ItemMod.nemix_ingot,});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_boots, 1), new Object[] {"N N", "N N", 'N', ItemMod.nemix_ingot,});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_shovel, 1), new Object[] {" N ", " S ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_stick, 1), new Object[] {"DND", "DND", 'N', ItemMod.nemix_ingot, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_core, 1), new Object[] {" B ", "BNB", " B ", 'N', Items.nether_star, 'B', BlockMod.nemix_block});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_core, 1), new Object[] {"OOO", "OCO", "OOO", 'O', Blocks.obsidian, 'C', ItemMod.nemix_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_sword, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_ingot, 'S', ItemMod.nemix_sword, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_pickaxe, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_ingot, 'S', ItemMod.nemix_pickaxe, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_axe, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_ingot, 'S', ItemMod.nemix_axe, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_hoe, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_ingot, 'S', ItemMod.nemix_hoe, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_shovel, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_ingot, 'S', ItemMod.nemix_shovel, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_ingot, 9), new Object[] {"III", "ISI", "III", 'I', ItemMod.nemix_core_ingot, 'S', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_core_ingot, 1), new Object[] {"III", "ISI", "III", 'I', ItemMod.nemix_ingot, 'S', ItemMod.nemix_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_apple, 1), new Object[] {"III", "ISI", "III", 'I', ItemMod.nemix_ingot, 'S', Items.apple});
		
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_helmet, 1), new Object[] {"III", "I I", "   ", 'I', ItemMod.nemix_reinforced_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_chestplate, 1), new Object[] {"I I", "III", "III", 'I', ItemMod.nemix_reinforced_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_leggings, 1), new Object[] {"III", "I I", "I I", 'I', ItemMod.nemix_reinforced_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_boots, 1), new Object[] {"I I", "I I", 'I', ItemMod.nemix_reinforced_ingot});
		
		
	}
}
