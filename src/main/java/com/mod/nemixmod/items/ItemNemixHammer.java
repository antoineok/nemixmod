package com.mod.nemixmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import scala.collection.parallel.ParIterableLike.Min;
import scala.swing.TextComponent;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Time;

import org.apache.commons.logging.Log;

import com.mod.nemixmod.init.BlockMod;
import com.mod.nemixmod.init.ItemMod;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;

public class ItemNemixHammer extends ItemPickaxe {


	protected ItemNemixHammer(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		// TODO Auto-generated constructor stub
	}

	public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z,
			EntityLivingBase elb) {
		boolean isCobble = world.getBlock(x, y, z) == Blocks.cobblestone;
		boolean isStone = world.getBlock(x, y, z) == Blocks.stone;
		boolean isStoneBrick = world.getBlock(x, y, z) == Blocks.stonebrick;
		boolean isSandtone = world.getBlock(x, y, z) == Blocks.sandstone;

		boolean[] vanillaBlocks = new boolean[] { isCobble, isStone, isStoneBrick, isSandtone };
		float yaw = Minecraft.getMinecraft().thePlayer.prevRenderYawOffset;

		while (yaw > 360) {
			System.out.print("On retire un tour" + "\n");
			yaw = yaw - 360;
		}

		while (yaw < 0) {
			System.out.print("On ajoute un tour" + "\n");
			yaw = yaw + 360;
		}

		if (yaw >= 135 && yaw < 225) {
			System.out.print("North" + yaw + "\n");
			if (y < 6) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(
						EnumChatFormatting.GOLD + "Tu ne peut pas utiliser le nemix hammer en desous de la"));
				Minecraft.getMinecraft().thePlayer
						.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "couche 6...."));
			} else if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2]) {
				for (int ix = -1; ix < 2; ++ix) {
					for (int iy = -1; iy < 2; ++iy) {
						for (int iz = -1; iz < 2; ++iz) {

							if (world.getBlock(x, y, z) != Blocks.bedrock) {
								{
									world.func_147480_a((x + ix), (y + iy), z, true);
									stack.setItemDamage(stack.getItemDamage() - 1);
									System.out.print("X : " + x + "\n");
									System.out.print("IX : " + ix + "\n");
									System.out.print("Y : " + y + "\n");
									System.out.print("IY : " + iy + "\n");
									System.out.print("Z : " + z + "\n");
									System.out.print("IZ : " + iz + "\n");
								}
							}

						}

					}
				}
			}
		} else if (yaw >= 225 && yaw < 315) {
			System.out.print("East" + yaw + "\n");
			if (y < 6) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(
						EnumChatFormatting.GOLD + "Tu ne peut pas utiliser le nemix hammer en desous de la"));
				Minecraft.getMinecraft().thePlayer
						.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "couche 6...."));
			} else if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2]) {
				for (int ix = -1; ix < 2; ++ix) {
					for (int iy = -1; iy < 2; ++iy) {
						for (int iz = -1; iz < 2; ++iz) {

							if (world.getBlock(x, y, z) != Blocks.bedrock) {
								{
									world.func_147480_a(x, (y + iy), (z+iz), true);
									stack.setItemDamage(stack.getItemDamage() - 1);
									System.out.print("X : " + x + "\n");
									System.out.print("IX : " + ix + "\n");
									System.out.print("Y : " + y + "\n");
									System.out.print("IY : " + iy + "\n");
									System.out.print("Z : " + z + "\n");
									System.out.print("IZ : " + iz + "\n");
								}
							}	

						}

					}
				}
			}
		} else if (yaw >= 46 && yaw < 135) {
			System.out.print("West" + yaw + "\n");
			if (y < 6) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(
						EnumChatFormatting.GOLD + "Tu ne peut pas utiliser le nemix hammer en desous de la"));
				Minecraft.getMinecraft().thePlayer
						.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "couche 6...."));
			} else if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2]) {
				for (int ix = -1; ix < 2; ++ix) {
					for (int iy = -1; iy < 2; ++iy) {
						for (int iz = -1; iz < 2; ++iz) {

							if (world.getBlock(x, y, z) != Blocks.bedrock) {
								{
									world.func_147480_a(x, y+iy, z+iz, true);
									stack.setItemDamage(stack.getItemDamage() - 1);
									System.out.print("X : " + x + "\n");
									System.out.print("IX : " + ix + "\n");
									System.out.print("Y : " + y + "\n");
									System.out.print("IY : " + iy + "\n");
									System.out.print("Z : " + z + "\n");
									System.out.print("IZ : " + iz + "\n");
									
								}
							}	

						}

					}
				}
			}
			
			
		} else 
		{
			System.out.print("South" + yaw + "\n");
			if (y < 6) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(
						EnumChatFormatting.GOLD + "Tu ne peut pas utiliser le nemix hammer en desous de la"));
				Minecraft.getMinecraft().thePlayer
						.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "couche 6...."));
			} else if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2]) {
				for (int ix = -1; ix < 2; ++ix) {
					for (int iy = -1; iy < 2; ++iy) {
						for (int iz = -1; iz < 2; ++iz) {

							if (world.getBlock(x, y, z) != Blocks.bedrock) {
								{
									world.func_147480_a((x + ix), (y + iy), z, true);
									stack.setItemDamage(stack.getItemDamage() - 1);
									System.out.print("X : " + x + "\n");
									System.out.print("IX : " + ix + "\n");
									System.out.print("Y : " + y + "\n");
									System.out.print("IY : " + iy + "\n");
									System.out.print("Z : " + z + "\n");
									System.out.print("IZ : " + iz + "\n");
								}
							}

						}

					}
				}
			}
			return true;
		}

				
		stack.setItemDamage(stack.getItemDamage() - 1);
		
		return false;
	}
	


}