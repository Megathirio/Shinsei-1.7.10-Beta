package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockGalenaOre extends OreShinsei {
    public BlockGalenaOre(){
        super(Material.rock);
        this.setBlockName(Names.Materials.GALENA + Names.Forms.ORE);
        this.setHardness(2.5F);
        this.setResistance(6.5f);
    }
}
