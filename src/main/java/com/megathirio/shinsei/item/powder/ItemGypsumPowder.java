package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.item.PowderShinsei;
import com.megathirio.shinsei.reference.Names;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class ItemGypsumPowder extends PowderShinsei {
    public ItemGypsumPowder(){
        super();
        this.setUnlocalizedName(Names.Materials.GYPSUM + Names.Forms.POWDER);
    }

    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int intX, int intY, int intZ, int intI, float fltX, float fltY, float fltZ) {
        if (applyBonemeal(itemStack, world, intX, intY, intZ, entityPlayer)) {
            if (!world.isRemote) {
                world.playAuxSFX(2005, intX, intY, intZ, 0);
            }

            return true;
        }
        return false;
    }
    public static boolean applyBonemeal(ItemStack itemStack, World world, int intX, int intY, int intZ, EntityPlayer player)
    {
        Block block = world.getBlock(intX, intY, intZ);

        BonemealEvent event = new BonemealEvent(player, world, block, intX, intY, intZ);
        if (MinecraftForge.EVENT_BUS.post(event))
        {
            return false;
        }

        if (event.getResult() == Event.Result.ALLOW)
        {
            if (!world.isRemote)
            {
                itemStack.stackSize--;
            }
            return true;
        }

        if (block instanceof IGrowable)
        {
            IGrowable igrowable = (IGrowable)block;

            if (igrowable.func_149851_a(world, intX, intY, intZ, world.isRemote))
            {
                if (!world.isRemote)
                {
                    if (igrowable.func_149852_a(world, world.rand, intX, intY, intZ))
                    {
                        igrowable.func_149853_b(world, world.rand, intX, intY, intZ);
                    }

                    --itemStack.stackSize;
                }

                return true;
            }
        }

        return false;
    }

    }
