package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBorniteOre extends OreShinsei {
    public BlockBorniteOre(){
        super(Material.rock);
        this.setBlockName(Names.Materials.BORNITE + Names.Forms.ORE);
        this.setHardness(3.0f);
        this.setResistance(4.9f);
    }
}
