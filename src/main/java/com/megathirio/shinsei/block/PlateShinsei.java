package com.megathirio.shinsei.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class PlateShinsei extends Block{

	//Default Block Properties
	public PlateShinsei(Material material){

        super(Material.iron);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
        this.setTickRandomly(true);
        this.setCreativeTab(ShinseiTabs.DECO_TAB);
        this.func_150089_b(0);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypeMetal);
	}

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public void breakBlock(World world, int intX, int intY, int intZ, Block block, int intMeta){
        dropInventory(world, intX, intY, intZ);
        super.breakBlock(world, intX, intY, intZ, block, intMeta);
    }

    @Override
    public void onBlockPlacedBy(World world, int intX, int intY, int intZ, EntityLivingBase entityLiving, ItemStack istack){
        //if (world.getTileEntity(intX, intY, intZ) instanceof TileEntityShinsei){
            int direction = 0;
            int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

            if (facing == 0){
                direction = ForgeDirection.NORTH.ordinal();
            }else if (facing == 1){
                direction = ForgeDirection.EAST.ordinal();
            }else if (facing == 2){
                direction = ForgeDirection.SOUTH.ordinal();
            }else if (facing == 3){
                direction = ForgeDirection.WEST.ordinal();
            }

            if (istack.hasDisplayName()){
               // ((TileEntityShinsei) world.getTileEntity(intX, intY, intZ)).setCustomName(istack.getDisplayName());
            }

            // ((TileEntityShinsei) world.getTileEntity(intX, intY, intZ)).setOrientation(direction);
        }
    //}

    protected void dropInventory(World world, int intX, int intY, int intZ){
        TileEntity tileEntity = world.getTileEntity(intX, intY, intZ);
        if(!(tileEntity instanceof IInventory)){
            return;
        }

        IInventory inventory = (IInventory) tileEntity;

        for (int intI = 0; intI < inventory.getSizeInventory(); intI ++){
            ItemStack istack = inventory.getStackInSlot(intI);

            if (istack != null && istack.stackSize > 0){
                Random rand = new Random();

                float fltDX = rand.nextFloat() + 0.8F + 0.1F;
                float fltDY = rand.nextFloat() + 0.8F + 0.1F;
                float fltDZ = rand.nextFloat() + 0.8F + 0.1F;

                EntityItem entityItem = new EntityItem(world, intX + fltDX, intY + fltDY, intZ + fltDZ, istack.copy());

                if (istack.hasTagCompound()){
                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) istack.getTagCompound().copy());
                }

                float fltFactor = 0.5F;
                entityItem.motionX = rand.nextGaussian() * fltFactor;
                entityItem.motionY = rand.nextGaussian() * fltFactor + 0.2F;
                entityItem.motionZ = rand.nextGaussian() * fltFactor;
                world.spawnEntityInWorld(entityItem);
                istack.stackSize =0;
            }
        }
    }

        /**
         * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
         * cleared to be reused)
         */
        public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
        {
            byte b0 = 0;
            float f = 0.0625F;
            return AxisAlignedBB.getBoundingBox((double)p_149668_2_ + this.minX, (double)p_149668_3_ + this.minY, (double)p_149668_4_ + this.minZ, (double)p_149668_2_ + this.maxX, (double)((float)p_149668_3_ + (float)b0 * f), (double)p_149668_4_ + this.maxZ);
        }

        /**
         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
         */
        public boolean isOpaqueCube()
        {
            return false;
        }

        /**
         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
         */
        public boolean renderAsNormalBlock()
        {
            return false;
        }

        /**
         * Sets the block's bounds for rendering it as an item
         */
        public void setBlockBoundsForItemRender()
        {
            this.func_150089_b(0);
        }

        /**
         * Updates the blocks bounds based on its current state. Args: world, x, y, z
         */
        public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
        {
            this.func_150089_b(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));
        }

        protected void func_150089_b(int p_150089_1_)
        {
            byte b0 = 0;
            float f = (float)(1 * (1 + b0)) / 16.0F;
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
        }

        /**
         * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
         */
        public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
        {
            return super.canPlaceBlockAt(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_) && this.canBlockStay(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_);
        }

        /**
         * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
         * their own) Args: x, y, z, neighbor Block
         */
        public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
        {
            this.func_150090_e(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
        }

        private boolean func_150090_e(World p_150090_1_, int p_150090_2_, int p_150090_3_, int p_150090_4_)
        {
            if (!this.canBlockStay(p_150090_1_, p_150090_2_, p_150090_3_, p_150090_4_))
            {
                this.dropBlockAsItem(p_150090_1_, p_150090_2_, p_150090_3_, p_150090_4_, p_150090_1_.getBlockMetadata(p_150090_2_, p_150090_3_, p_150090_4_), 0);
                p_150090_1_.setBlockToAir(p_150090_2_, p_150090_3_, p_150090_4_);
                return false;
            }
            else
            {
                return true;
            }
        }

        /**
         * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
         */
        public boolean canBlockStay(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_)
        {
            return !p_149718_1_.isAirBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_);
        }

        /**
         * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
         * coordinates.  Args: blockAccess, x, y, z, side
         */
        @SideOnly(Side.CLIENT)
        public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
        {
            return p_149646_5_ == 1 ? true : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
        }

}
