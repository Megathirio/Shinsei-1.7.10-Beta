package com.megathirio.shinsei.item.food;

import com.megathirio.shinsei.item.FoodShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemBeefCured extends FoodShinsei{

    //Default Food Properties
    public ItemBeefCured(){
        super(4, .6f, true);
        this.setUnlocalizedName(Names.Foods.BEEF_CURED);
//      this.setPotionEffect(Potion ID, Tick Duration, Level, Chance);

    }
}
