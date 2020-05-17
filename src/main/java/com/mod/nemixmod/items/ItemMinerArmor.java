package com.mod.nemixmod.items;

import com.mod.nemixmod.Reference;
import com.mod.nemixmod.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemMinerArmor extends ItemArmor
{

	public ItemMinerArmor(ArmorMaterial material, int metaData)
	{
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ItemMod.miner_leggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/miner_layer_2.png";
		}
		
		else if(stack.getItem() == ItemMod.miner_helmet || stack.getItem() == ItemMod.miner_chestplate || stack.getItem() == ItemMod.miner_boots) 
		{ 
			return Reference.MOD_ID + ":textures/models/armor/miner_layer_1.png";
		}
		return null;
		
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
		
		if(this == ItemMod.miner_helmet) 
		{
			player.addPotionEffect(new PotionEffect(16, 400, 0));
		}
		
    }
	
}
