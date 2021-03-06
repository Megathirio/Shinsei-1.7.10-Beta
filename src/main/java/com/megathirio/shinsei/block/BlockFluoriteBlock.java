package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockFluoriteBlock extends BlockShinsei {
    public BlockFluoriteBlock(){
        super(Material.rock);
        this.setBlockName(Names.Materials.FLUORITE + Names.Forms.BLOCK);
        this.setHardness(4.0f);
        this.setResistance(6.5f);
        this.setLightLevel(.5f);
    }
   
}
