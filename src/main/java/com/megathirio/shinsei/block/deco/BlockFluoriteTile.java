package com.megathirio.shinsei.block.deco;

import com.megathirio.shinsei.block.PlateShinsei;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockFluoriteTile extends PlateShinsei {
    public BlockFluoriteTile(){
        super(Material.glass);
        this.setBlockName(Names.Materials.FLUORITE + Names.Forms.TILE);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + Names.Materials.FLUORITE + Names.Forms.BLOCK);
    }

}
