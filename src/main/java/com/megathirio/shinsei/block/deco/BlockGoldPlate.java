package com.megathirio.shinsei.block.deco;

import com.megathirio.shinsei.block.PlateShinsei;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockGoldPlate extends PlateShinsei {

    public BlockGoldPlate(){

        super(Material.iron);
        this.setBlockName(Names.Materials.GOLD + Names.Forms.PLATE);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + Names.Materials.GOLD + Names.Forms.BLOCK);
    }

}