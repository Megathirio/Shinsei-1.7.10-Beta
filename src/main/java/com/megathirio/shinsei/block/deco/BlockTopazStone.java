package com.megathirio.shinsei.block.deco;

import com.megathirio.shinsei.block.BlockShinsei;
import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;

public class BlockTopazStone extends BlockShinsei {
    public BlockTopazStone(){
        super(Material.rock);
        this.setBlockName(Names.Materials.TOPAZ + Names.Forms.STONE);
        this.setHardness(9f);
        this.setResistance(14.6f);
        this.setHarvestLevel("pickaxe", 3);
        this.setLightLevel(1.0f);
        this.setCreativeTab(ShinseiTabs.DECO_TAB);
    }
}
