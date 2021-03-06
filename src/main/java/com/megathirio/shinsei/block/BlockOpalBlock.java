package com.megathirio.shinsei.block;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockOpalBlock extends BlockShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockOpalBlock(){
        super(Material.rock);
        this.setBlockName(Names.Materials.OPAL + Names.Forms.BLOCK);
        this.setHardness(6.0f);
        this.setResistance(9.7f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5f);
    }
}
