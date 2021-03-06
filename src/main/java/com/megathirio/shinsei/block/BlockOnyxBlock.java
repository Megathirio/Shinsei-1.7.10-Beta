package com.megathirio.shinsei.block;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOnyxBlock extends BlockShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockOnyxBlock(){
        super(Material.rock);
        this.setBlockName(Names.Materials.ONYX + Names.Forms.BLOCK);
        this.setHardness(6.0f);
        this.setResistance(9.7f);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(.5f);
    }
}
