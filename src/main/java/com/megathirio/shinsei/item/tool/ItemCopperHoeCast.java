package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperHoeCast extends ItemShinsei {
    public ItemCopperHoeCast(){
        super();
        this.setUnlocalizedName(Names.Materials.COPPER + Names.Forms.HOE + Names.Types.CAST);
        this.setMaxDamage(32);
        this.setNoRepair();

    }


}
