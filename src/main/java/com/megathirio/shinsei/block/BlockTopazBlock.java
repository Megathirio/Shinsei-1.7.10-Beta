package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockTopazBlock extends BlockShinsei {
    public BlockTopazBlock(){
        super(Material.rock);
        this.setBlockName(Names.Materials.TOPAZ + Names.Forms.BLOCK);
        this.setHardness(8f);
        this.setResistance(12.9f);
        this.setHarvestLevel("pickaxe", 3);
        this.setLightLevel(.5f);
    }
   
}
