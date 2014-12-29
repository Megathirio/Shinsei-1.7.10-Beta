package com.megathirio.shinsei.block.machine;

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

public class BlockFanesu extends BlockContainer
{
    private final Random random = new Random();
    private final boolean boolOn;
    private static boolean boolKeepInv;
    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconBlock;

    public BlockFanesu(boolean boolOn)
    {
        super(Material.rock);
        this.boolOn = boolOn;
        this.setBlockName(Names.Forms.FANESU);
        this.setCreativeTab(ShinseiTabs.MACHINES_TAB);
    }

    public Item getItemDropped(int intI, Random random, int intJ)
    {
        return Item.getItemFromBlock(ShinseiBlocks.fanesuOff);
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World world, int intX, int intY, int intZ)
    {
        super.onBlockAdded(world, intX, intY, intZ);
        this.setDefaultDirection(world, intX, intY, intZ);
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
        this.iconBlock = iconRegister.registerIcon(Names.Forms.FANESU);
        this.iconBlock = iconRegister.registerIcon(this.boolOn ? Names.Forms.FANESU + Names.States.ON + Names.Directions.FRONT: Names.Forms.FANESU + Names.States.OFF + Names.Directions.FRONT);
        this.iconTop = iconRegister.registerIcon(Names.Forms.FANESU);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int intX, int intY, int intZ, EntityPlayer entityPlayer, int intSide, float fltX, float fltY, float fltZ)
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityFurnace tileentityfurnace = (TileEntityFurnace)world.getTileEntity(intX, intY, intZ);

            if (tileentityfurnace != null)
            {
                entityPlayer.func_146101_a(tileentityfurnace);
            }

            return true;
        }
    }

    /**
     * Update which block the furnace is using depending on whether or not it is burning
     */
    public static void updateFanesuBlockState(boolean boolOn, World world, int intX, int intY, int intZ)
    {
        int l = world.getBlockMetadata(intX, intY, intZ);
        TileEntity tileentity = world.getTileEntity(intX, intY, intZ);
        boolKeepInv = true;

        if (boolOn)
        {
            world.setBlock(intX, intY, intZ, ShinseiBlocks.fanesuOn);
        }
        else
        {
            world.setBlock(intX, intY, intZ, ShinseiBlocks.fanesuOff);
        }

        boolKeepInv = false;
        world.setBlockMetadataWithNotify(intX, intY, intZ, l, 2);

        if (tileentity != null)
        {
            tileentity.validate();
            world.setTileEntity(intX, intY, intZ, tileentity);
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World world, int intI)
    {
        return new TileEntityFurnace();
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World world, int intX, int intY, int intZ, EntityLivingBase entityLiving, ItemStack itemStack)
    {
        int l = MathHelper.floor_double((double) (entityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            world.setBlockMetadataWithNotify(intX, intY, intZ, 2, 2);
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(intX, intY, intZ, 5, 2);
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(intX, intY, intZ, 3, 2);
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(intX, intY, intZ, 4, 2);
        }

        if (itemStack.hasDisplayName())
        {
            ((TileEntityFurnace)world.getTileEntity(intX, intY, intZ)).func_145951_a(itemStack.getDisplayName());
        }
    }

    public void breakBlock(World world, int intX, int intY, int intZ, Block blockOld, int intOldMeta)
    {
        if ( boolKeepInv)
        {
            TileEntityFurnace tileentityfurnace = (TileEntityFurnace)world.getTileEntity(intX, intY, intZ);

            if (tileentityfurnace != null)
            {
                for (int i1 = 0; i1 < tileentityfurnace.getSizeInventory(); ++i1)
                {
                    ItemStack itemstack = tileentityfurnace.getStackInSlot(i1);

                    if (itemstack != null)
                    {
                        float f = this.random.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.random.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0)
                        {
                            int j1 = this.random.nextInt(21) + 10;

                            if (j1 > itemstack.stackSize)
                            {
                                j1 = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j1;
                            EntityItem entityitem = new EntityItem(world, (double)((float)intX + f), (double)((float)intY + f1), (double)((float)intZ + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound())
                            {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);
                            world.spawnEntityInWorld(entityitem);
                        }
                    }
                }

                world.func_147453_f(intX, intY, intZ, blockOld);
            }
        }

        super.breakBlock(world, intX, intY, intZ, blockOld, intOldMeta);
    }

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int intX, int intY, int intZ, Random random)
    {
        if (this.boolOn)
        {
            int l = world.getBlockMetadata(intX, intY, intZ);
            float f = (float)intX + 0.5F;
            float f1 = (float)intY + 0.0F + random.nextFloat() * 6.0F / 16.0F;
            float f2 = (float)intZ + 0.5F;
            float f3 = 0.52F;
            float f4 = random.nextFloat() * 0.6F - 0.3F;

            if (l == 4)
            {
                world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 5)
            {
                world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 2)
            {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 3)
            {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
            }
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
        return Item.getItemFromBlock(ShinseiBlocks.fanesuOff);
    }
}