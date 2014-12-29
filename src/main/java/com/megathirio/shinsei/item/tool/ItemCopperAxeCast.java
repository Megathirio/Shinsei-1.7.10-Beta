package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperAxeCast extends ItemShinsei {
    public ItemCopperAxeCast(){
        super();
        this.setUnlocalizedName(Names.Materials.COPPER + Names.Forms.AXE + Names.Types.CAST);
        this.setMaxDamage(32);
        this.setNoRepair();
    }


}
