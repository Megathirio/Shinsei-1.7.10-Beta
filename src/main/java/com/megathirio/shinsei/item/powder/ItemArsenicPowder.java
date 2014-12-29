package com.megathirio.shinsei.item.powder;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.item.FoodShinsei;
import com.megathirio.shinsei.item.PowderShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemArsenicPowder extends FoodShinsei {
    public ItemArsenicPowder(){
        super(0, 0f, false);
        this.setUnlocalizedName(Names.Materials.ARSENIC + Names.Forms.POWDER);
        this.setPotionEffect(19, 360, 1, 80);
        this.setCreativeTab(ShinseiTabs.POWDERS_TAB);
    }
}
