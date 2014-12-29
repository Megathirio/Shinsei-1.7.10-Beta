package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.reference.Names;

public class ItemStoneChisel extends ChiselShinsei {
    public ItemStoneChisel(){
        super();
        this.setUnlocalizedName(Names.Materials.STONE + Names.Forms.CHISEL);
        this.setMaxDamage(16);
    }
}
