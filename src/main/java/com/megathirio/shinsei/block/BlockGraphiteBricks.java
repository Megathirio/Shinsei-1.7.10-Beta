package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockGraphiteBricks extends BlockShinsei {
    public BlockGraphiteBricks(){
        super(Material.iron);
        this.setBlockName(Names.Materials.GRAPHITE + Names.Forms.BRICKS);
        this.setHardness(2.0f);
        this.setResistance(3.2f);
        this.setHarvestLevel("pickaxe", 1);
    }
   
}
