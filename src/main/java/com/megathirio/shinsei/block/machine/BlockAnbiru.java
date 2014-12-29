package com.megathirio.shinsei.block.machine;

import com.megathirio.shinsei.Main;
import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class BlockAnbiru extends BlockShinsei
{
    private final Random random = new Random();
    private static boolean boolKeepInv;
    @SideOnly(Side.CLIENT)
    private IIcon iconBottom;
    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconBlock;

    public BlockAnbiru()
    {
        super(Material.iron);
        this.setBlockName(Names.Forms.ANBIRU);
        this.setCreativeTab(ShinseiTabs.MACHINES_TAB);
    }

    public Item getItemDropped(int intI, Random random, int intJ)
    {
        return Item.getItemFromBlock(ShinseiBlocks.anbiru);
    }

    private void setDefaultDirection(World world, int intX, int intY, int intZ)
    {
        if (!world.isRemote)
        {
            Block block = world.getBlock(intX, intY, intZ - 1);
            Block block1 = world.getBlock(intX, intY, intZ + 1);
            Block block2 = world.getBlock(intX - 1, intY, intZ);
            Block block3 = world.getBlock(intX + 1, intY, intZ);
            byte b0 = 3;
            //if func_149730_j = true then block can't be replaced by leaves
            if (block.func_149730_j() && !block1.func_149730_j())
            {
                b0 = 3;
            }

            if (block1.func_149730_j() && !block.func_149730_j())
            {
                b0 = 2;
            }

            if (block2.func_149730_j() && !block3.func_149730_j())
            {
                b0 = 5;
            }

            if (block3.func_149730_j() && !block2.func_149730_j())
            {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(intX, intY, intZ, b0, 2);
        }
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int intSide, int intMeta)
    {
        return intSide == 1 ? this.iconTop : (intSide == 0 ? this.iconTop : (intSide != intMeta ? this.iconBlock : this.iconBlock));
    }

    @SideOnly(Side.CLIENT)
    public void registericonBlocks(IIconRegister iconRegister)
    {
        this.iconBlock = iconRegister.registerIcon(Names.Forms.ANBIRU);
        this.iconBottom = iconRegister.registerIcon(Names.Forms.ANBIRU + Names.Directions.BOTTOM);
        this.iconTop = iconRegister.registerIcon(Names.Forms.ANBIRU + Names.Directions.TOP);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int intX, int intY, int intZ, EntityPlayer entityPlayer, int intSide, float fltX, float fltY, float fltZ)
    {
        if (!entityPlayer.isSneaking()) {
            entityPlayer.openGui(Main.instance, ShinseiBlocks.guiIDAnbiru, world, intX, intY, intZ);
            return true;
        }else{
            return false;
        }
    }

    /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(World world, int intX, int intY, int intZ, int p_149736_5_)
    {
        return Container.calcRedstoneFromInventory((IInventory) world.getTileEntity(intX, intY, intZ));
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int intX, int intY, int intZ)
    {
        return Item.getItemFromBlock(ShinseiBlocks.anbiru);
    }
}