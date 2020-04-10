package com.mod.nemixmod.items;

import com.mod.nemixmod.Reference;
import com.mod.nemixmod.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemNemixArmor extends ItemArmor
{

	public ItemNemixArmor(ArmorMaterial material, int metaData)
	{
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ItemMod.nemix_leggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/nemix_layer_2.png";
		}
		
		else if(stack.getItem() == ItemMod.nemix_helmet || stack.getItem() == ItemMod.nemix_chestplate || stack.getItem() == ItemMod.nemix_boots) 
		{ 
			return Reference.MOD_ID + ":textures/models/armor/nemix_layer_1.png";
		}
		return null;
		
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
		
		if(this == ItemMod.nemix_helmet) 
		{
			player.addPotionEffect(new PotionEffect(16, 400, 0));
		}
		
		if(this == ItemMod.nemix_chestplate) 
		{
			player.addPotionEffect(new PotionEffect(5, 400, 0));
		}
		if(this == ItemMod.nemix_leggings) 
		{
			player.addPotionEffect(new PotionEffect(1, 400, 0));
		}
		
		if(this == ItemMod.nemix_boots) 
		{
			player.addPotionEffect(new PotionEffect(8, 400, 0));
		}
		
    }
	
}
