package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.reference.Names;

public class ItemBronzeChisel extends ChiselShinsei {
    public ItemBronzeChisel(){
        super();
        this.setUnlocalizedName(Names.Materials.BRONZE + Names.Forms.CHISEL);
        this.setMaxDamage(25);
    }
}
