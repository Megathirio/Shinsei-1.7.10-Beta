package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockScarletEmeraldBlock extends BlockShinsei {
    public BlockScarletEmeraldBlock(){
        super(Material.rock);
        this.setBlockName(Names.Materials.SCARLET_EMERALD + Names.Forms.BLOCK);
        this.setHardness(7.5f);
        this.setResistance(12.1f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5f);
    }
   
}
