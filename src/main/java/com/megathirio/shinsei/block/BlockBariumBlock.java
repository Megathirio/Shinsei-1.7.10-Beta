package com.megathirio.shinsei.block;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBariumBlock extends BlockShinsei {
    public BlockBariumBlock(){
        super(Material.iron);
        this.setBlockName(Names.Materials.BARIUM + Names.Forms.BLOCK);
        this.setHardness(3.5f);
        this.setResistance(5.7f);
    }
   
}
