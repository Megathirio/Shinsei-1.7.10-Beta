package com.megathirio.shinsei.item.food;

import com.megathirio.shinsei.item.FoodShinsei;
import com.megathirio.shinsei.reference.Names;

public class ItemPorkCured extends FoodShinsei{

    //Default Food Properties
    public ItemPorkCured(){
        super(4, .6f, true);
        this.setUnlocalizedName(Names.Foods.PORK_CURED);
//      this.setPotionEffect(Potion ID, Tick Duration, Level, Chance);

    }
}
