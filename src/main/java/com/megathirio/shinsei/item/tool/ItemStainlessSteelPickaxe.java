package com.megathirio.shinsei.item.tool;

import com.megathirio.shinsei.item.ShinseiMaterials;
import com.megathirio.shinsei.reference.Names;

public class ItemStainlessSteelPickaxe extends PickaxeShinsei {
    public ItemStainlessSteelPickaxe(){
        super(ShinseiMaterials.materialStainlessSteel);
        this.setUnlocalizedName(Names.Materials.STAINLESS_STEEL + Names.Forms.PICKAXE);
    }


}
