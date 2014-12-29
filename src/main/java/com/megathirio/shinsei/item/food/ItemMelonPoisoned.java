package com.megathirio.shinsei.item.food;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.item.FoodShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemMelonPoisoned extends FoodShinsei{

    //Default Food Properties
    public ItemMelonPoisoned(){
        super(0, 0f, false);
        this.setUnlocalizedName(Names.Materials.MELON);
        this.setPotionEffect(19, 720, 1, 80);
        this.setCreativeTab(ShinseiTabs.FOODS_TAB);

    }
}
