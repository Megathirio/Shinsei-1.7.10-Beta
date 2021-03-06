package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockPlatinumBlock extends BlockShinsei {
    public BlockPlatinumBlock(){
        super(Material.iron);
        this.setBlockName(Names.Materials.PLATINUM + Names.Forms.BLOCK);
        this.setHardness(6.0f);
        this.setResistance(9.7f);
        this.setHarvestLevel("pickaxe", 2);
    }
   
}
