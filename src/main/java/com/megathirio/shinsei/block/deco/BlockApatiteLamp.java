package com.megathirio.shinsei.block.deco;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class BlockApatiteLamp extends BlockShinsei {

    private final boolean boolOn;

    public BlockApatiteLamp(boolean boolOn) {
        super(Material.redstoneLight);
        this.boolOn = boolOn;
        this.setHardness(3.0f);
        this.setResistance(3.2f);
        if (boolOn) {
            this.setLightLevel(1.0f);
            this.setBlockName(Names.Materials.APATITE + Names.Forms.LAMP + Names.States.ON);
            this.setCreativeTab(null);
        }else{
            this.setBlockName(Names.Materials.APATITE + Names.Forms.LAMP + Names.States.OFF);
            this.setCreativeTab(ShinseiTabs.DECO_TAB);
        }
    }

    public void onBlockAdded(World world, int intX, int intY, int intZ) {

        if (!world.isRemote) {
            if (this.boolOn && !world.isBlockIndirectlyGettingPowered(intX, intY, intZ)) {
                world.scheduleBlockUpdate(intX, intY, intZ, this, 4);
            } else if (!this.boolOn && world.isBlockIndirectlyGettingPowered(intX, intY, intZ)) {
                world.setBlock(intX, intY, intZ, ShinseiBlocks.apatiteLampOn, 0, 2);
            }
        }
    }

    public void onNeighborBlockChange(World world, int intX, int intY, int intZ, Block block) {

        if (!world.isRemote) {
            if (this.boolOn && !world.isBlockIndirectlyGettingPowered(intX, intY, intZ)) {
                world.scheduleBlockUpdate(intX, intY, intZ, this, 4);
            } else if (!this.boolOn && world.isBlockIndirectlyGettingPowered(intX, intY, intZ)) {
                world.setBlock(intX, intY, intZ, ShinseiBlocks.apatiteLampOn, 0, 2);
            }
        }

    }

    public void updateTick(World world, int intX, int intY, int intZ, Random random) {

        if (!world.isRemote && this.boolOn && !world.isBlockIndirectlyGettingPowered(intX, intY, intZ)) {
            world.setBlock(intX, intY, intZ, ShinseiBlocks.apatiteLampOff, 0, 2);
        }
    }

    public Item getItemDropped(int intI, Random random, int intJ){
        return Item.getItemFromBlock(ShinseiBlocks.apatiteLampOff);
    }

    protected ItemStack createStackedBlock(int intI){
        return new ItemStack(ShinseiBlocks.apatiteLampOff);
    }


}