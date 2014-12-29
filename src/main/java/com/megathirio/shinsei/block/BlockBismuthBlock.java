package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBismuthBlock extends BlockShinsei {
    public BlockBismuthBlock(){
        super(Material.iron);
        this.setBlockName(Names.Materials.BISMUTH + Names.Forms.BLOCK);
        this.setHardness(2.25f);
        this.setResistance(3.6f);
    }
   
}
