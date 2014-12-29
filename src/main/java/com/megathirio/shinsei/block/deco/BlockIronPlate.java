package com.megathirio.shinsei.block.deco;

import com.megathirio.shinsei.block.PlateShinsei;
import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class BlockIronPlate extends PlateShinsei {
    public BlockIronPlate(){
        super(Material.iron);
        this.setBlockName(Names.Materials.IRON + Names.Forms.PLATE);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + Names.Materials.IRON + Names.Forms.BLOCK);
    }

}
