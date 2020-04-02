package com.mod.nemixmod.items;

import com.mod.nemixmod.Reference;
import com.mod.nemixmod.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemNemixReinforcedArmor extends ItemArmor {


	public ItemNemixReinforcedArmor(ArmorMaterial material, int metaData)
	{
		super(material, 0, metaData);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ItemMod.nemix_reinforced_leggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/nemix_layer_2.png";
		}
		
		else if(stack.getItem() == ItemMod.nemix_reinforced_helmet || stack.getItem() == ItemMod.nemix_reinforced_chestplate || stack.getItem() == ItemMod.nemix_reinforced_boots) 
		{ 
			return Reference.MOD_ID + ":textures/models/armor/nemix_layer_1.png";
		}
		return null;
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
		
		if(this == ItemMod.nemix_reinforced_helmet) 
		{
			player.addPotionEffect(new PotionEffect(16, 400, 1));
		}
		
		if(this == ItemMod.nemix_reinforced_chestplate) 
		{
			player.addPotionEffect(new PotionEffect(5, 400, 1));
		}
		if(this == ItemMod.nemix_reinforced_leggings) 
		{
			player.addPotionEffect(new PotionEffect(1, 400, 1));
		}
		
		if(this == ItemMod.nemix_reinforced_boots) 
		{
			player.addPotionEffect(new PotionEffect(8, 400, 1));
		}
		
		
		
        ItemStack boots = player.getEquipmentInSlot(1);
        ItemStack leggings = player.getEquipmentInSlot(2);
        ItemStack chestPlate = player.getEquipmentInSlot(3);
        ItemStack helmet = player.getEquipmentInSlot(4);

        if(boots != null && boots.getItem() == ItemMod.nemix_reinforced_boots && leggings != null && leggings.getItem() == ItemMod.nemix_reinforced_leggings && chestPlate != null && chestPlate.getItem() == ItemMod.nemix_reinforced_chestplate && helmet != null && helmet.getItem() == ItemMod.nemix_reinforced_helmet)
        {
        	player.addPotionEffect(new PotionEffect(14, 20, 1));
        }

		
		
		
		
    }
	
    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(repair.getItem() == ItemMod.nemix_ingot || repair.getItem() == ItemMod.nemix_ingot)
        {
            return true;
        }
        return false;
    }
    
    
	
	
}
