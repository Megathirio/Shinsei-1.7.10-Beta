package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockHematiteOre extends OreShinsei {
    public BlockHematiteOre(){
        super(Material.rock);
        this.setBlockName(Names.Materials.HEMATITE + Names.Forms.ORE);
        this.setHardness(5.0f);
        this.setResistance(8.1f);
    }
}