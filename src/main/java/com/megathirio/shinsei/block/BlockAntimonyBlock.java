package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockAntimonyBlock extends BlockShinsei {
    public BlockAntimonyBlock(){
        super(Material.iron);
        this.setBlockName(Names.Materials.ANTIMONY + Names.Forms.BLOCK);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
    }
   
}
