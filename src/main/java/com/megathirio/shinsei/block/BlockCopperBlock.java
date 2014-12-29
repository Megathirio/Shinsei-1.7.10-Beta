package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockCopperBlock extends BlockShinsei {
    public BlockCopperBlock(){
        super(Material.iron);
        this.setBlockName(Names.Materials.COPPER + Names.Forms.BLOCK);
        this.setHardness(3.5f);
        this.setResistance(5.7f);
    }

}
