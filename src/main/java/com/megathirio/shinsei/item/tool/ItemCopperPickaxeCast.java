package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperPickaxeCast extends ItemShinsei {
    public ItemCopperPickaxeCast(){
        super();
        this.setUnlocalizedName(Names.Materials.COPPER + Names.Forms.PICKAXE + Names.Types.CAST);
        this.setMaxDamage(32);
        this.setNoRepair();

    }


}
