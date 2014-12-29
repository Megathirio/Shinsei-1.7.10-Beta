package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperSwordCast extends ItemShinsei {
    public ItemCopperSwordCast(){
        super();
        this.setUnlocalizedName(Names.Materials.COPPER + Names.Forms.SWORD + Names.Types.CAST);
        this.setMaxDamage(32);
        this.setNoRepair();

    }


}
