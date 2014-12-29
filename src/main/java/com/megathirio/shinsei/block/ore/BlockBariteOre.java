package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockBariteOre extends OreShinsei {
    public BlockBariteOre(){
        super(Material.rock);
        this.setBlockName(Names.Materials.BARITE + Names.Forms.ORE);
        this.setHardness(3.5f);
        this.setResistance(5.7f);
    }
}
