package com.megathirio.shinsei.item.food;

import com.megathirio.shinsei.init.ShinseiTabs;
import com.megathirio.shinsei.item.FoodShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemFishSalmonPoisoned extends FoodShinsei{

    //Default Food Properties
    public ItemFishSalmonPoisoned(){
        super(0, 0f, false);
        this.setUnlocalizedName(Names.Materials.FISH + Names.States.POISONED_SALMON + Names.States.POISONED);
        this.setPotionEffect(19, 720, 1, 80);
        this.setCreativeTab(ShinseiTabs.FOODS_TAB);

    }
}
