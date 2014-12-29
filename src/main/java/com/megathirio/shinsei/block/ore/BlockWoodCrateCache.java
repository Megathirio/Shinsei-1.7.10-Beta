package com.megathirio.shinsei.block.ore;

import com.megathirio.shinsei.block.OreShinsei;
import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.init.ShinseiTools;
import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockWoodCrateCache extends OreShinsei {

    Item itemDrop = null;
    int intQty = 1;

    public BlockWoodCrateCache(){
        super(Material.wood);
        this.setBlockName(Names.Materials.WOOD + Names.Forms.CRATE + Names.Types.CACHE);
        this.setHarvestLevel("axe", 1);
    }

    @Override
    public Item getItemDropped(int intX, Random random, int intY) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 5){
            itemDrop = ShinseiTools.titaniumAxe;
        }else if(intWeight <= 10) {
            itemDrop = ShinseiItems.cobaltIngot;
        }else if(intWeight <= 15) {
            itemDrop = ShinseiItems.beefCured;
        }else if(intWeight <= 20) {
            itemDrop = ShinseiItems.chargedPeridotPowder;
        }else if(intWeight <= 25) {
            itemDrop = ShinseiItems.infusedRubyPowder;
        }else if(intWeight <= 30) {
            itemDrop = ShinseiItems.infusedJadePowder;
        }else if(intWeight <= 35) {
            itemDrop = Items.cookie;
        }else if(intWeight <= 40) {
            itemDrop = ShinseiTools.bronzeSwordBlade;
        }else if(intWeight <= 45) {
            itemDrop = ShinseiTools.brassHoe;
        }else if(intWeight <= 50) {
            itemDrop = ShinseiTools.axeCast;
        }else if(intWeight <= 55) {
            itemDrop = ShinseiItems.cookiePoisoned;
        }else if(intWeight <= 75) {
            itemDrop = ShinseiItems.onyxGem;
        }else{
            itemDrop = ShinseiTools.woodToolHandle;
        }
        return itemDrop;
    }

    @Override
    public int quantityDropped(Random random) {
        int intWeight = random.nextInt(100) + 1;
        if (intWeight <= 20){
            intQty = 3;
        }else if(intWeight <= 40){
            intQty = 2;
        }else {
            intQty = 1;
        }
        return intQty;
    }
}
