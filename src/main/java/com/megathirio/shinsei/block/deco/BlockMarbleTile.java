package com.megathirio.shinsei.block.deco;

import com.megathirio.shinsei.block.PlateShinsei;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockMarbleTile extends PlateShinsei {

    //Variables
    @SideOnly(Side.CLIENT)
    private IIcon[] texture;

    //MetaBlock variables
    final static String[] subBlocks = new String[] {Names.Colors.WHITE, Names.Colors.BLACK, Names.Colors.BLUE, Names.Colors.BROWN, Names.Colors.CYAN, Names.Colors.GRAY, Names.Colors.GREEN, Names.Colors.LT_BLUE, Names.Colors.LIME, Names.Colors.MAGENTA, Names.Colors.ORANGE, Names.Colors.PINK, Names.Colors.PURPLE, Names.Colors.RED, Names.Colors.SILVER, Names.Colors.YELLOW};

    public BlockMarbleTile(){
        super(Material.rock);
        this.setBlockName(Names.Materials.MARBLE + Names.Forms.TILE);

    }

    //MetaBlock Texture Setup
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister){

        texture = new IIcon[subBlocks.length];
        for(int i = 0; i < subBlocks.length; i++){
            texture[i] = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + Names.Materials.MARBLE + subBlocks[i]);
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
