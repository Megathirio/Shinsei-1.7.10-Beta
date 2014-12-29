package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.reference.Names;

public class ItemSteelChisel extends ChiselShinsei {
    public ItemSteelChisel(){
        super();
        this.setUnlocalizedName(Names.Materials.STEEL + Names.Forms.CHISEL);
        this.setMaxDamage(51);
    }
}
