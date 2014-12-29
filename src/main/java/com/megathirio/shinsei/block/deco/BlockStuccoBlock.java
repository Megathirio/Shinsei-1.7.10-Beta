package com.megathirio.shinsei.block.deco;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockStuccoBlock extends BlockShinsei {
    public BlockStuccoBlock(){
        super(Material.rock);
        this.setBlockName(Names.Materials.STUCCO + Names.Forms.BLOCK);
        this.setHardness(3.0f);
        this.setResistance(3.2f);
        this.setCreativeTab(ShinseiTabs.DECO_TAB);
    }
   
}
