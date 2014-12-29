package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockLeadBlock extends BlockShinsei {
    public BlockLeadBlock(){
        super(Material.iron);
        this.setBlockName(Names.Materials.LEAD + Names.Forms.BLOCK);
        this.setHardness(2.5F);
        this.setResistance(4.0f);
    }
   
}
