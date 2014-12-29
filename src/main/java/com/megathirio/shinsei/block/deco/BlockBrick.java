package com.megathirio.shinsei.block.deco;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockBrick extends BlockShinsei {

	//Variables
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;

	//MetaBlock variables
	final static String[] subBlocks = new String[] {Names.Colors.GRAY, Names.Colors.TAN, Names.Colors.VARIEGATED};

	public BlockBrick(){
		
		//Block Properties
		super(Material.rock);
        this.setBlockName(Names.Materials.BRICK);
        this.setHardness(4.0f);
        this.setResistance(6.5f);
        this.setHarvestLevel("pickaxe", 1);
        this.setCreativeTab(ShinseiTabs.DECO_TAB);
    }

    //MetaBlock Texture Setup
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister){

        texture = new IIcon[subBlocks.length];
        for(int i = 0; i < subBlocks.length; i++){
            texture[i] = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + subBlocks[i]);
        }
    }

	//MetaBlocks added to CreativeTab
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){

		for(int i = 0; i < subBlocks.length; i++){
			list.add(new ItemStack(block, 1, i));
		}
	}

	//Sets MetaBlock Texture
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){

		return texture[meta];
	}

	//Sets MetaBlock
	public int damageDropped(int meta){

		return meta;
	}
}
