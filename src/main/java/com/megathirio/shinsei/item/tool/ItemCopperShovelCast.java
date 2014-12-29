package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemCopperShovelCast extends ItemShinsei {
    public ItemCopperShovelCast(){
        super();
        this.setUnlocalizedName(Names.Materials.COPPER + Names.Forms.SHOVEL + Names.Types.CAST);
        this.setMaxDamage(32);
        this.setNoRepair();

    }


}
