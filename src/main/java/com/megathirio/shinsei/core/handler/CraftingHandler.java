package com.megathirio.shinsei.core.handler;

import com.megathirio.shinsei.init.ShinseiItems;
import com.megathirio.shinsei.init.ShinseiTools;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;


public class CraftingHandler {

    @SubscribeEvent
	public void onCrafting(ItemCraftedEvent event){
		
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++){
			if(event.craftMatrix.getStackInSlot(i) != null){

                ItemStack axeCast = event.craftMatrix.getStackInSlot(i);
                if(axeCast != null && axeCast.getItem() == ShinseiTools.axeCast){
                    ItemStack k = new ItemStack(ShinseiTools.axeCast, 2, (axeCast.getItemDamage() + 1));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack pickaxeCast = event.craftMatrix.getStackInSlot(i);
                if(pickaxeCast != null && pickaxeCast.getItem() == ShinseiTools.pickaxeCast){
                    ItemStack k = new ItemStack(ShinseiTools.pickaxeCast, 2, (pickaxeCast.getItemDamage() + 1));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack hoeCast = event.craftMatrix.getStackInSlot(i);
                if(hoeCast != null && hoeCast.getItem() == ShinseiTools.hoeCast){
                    ItemStack k = new ItemStack(ShinseiTools.hoeCast, 2, (hoeCast.getItemDamage() + 1));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack shovelCast = event.craftMatrix.getStackInSlot(i);
                if(shovelCast != null && shovelCast.getItem() == ShinseiTools.shovelCast){
                    ItemStack k = new ItemStack(ShinseiTools.shovelCast, 2, (shovelCast.getItemDamage() + 1));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack swordCast = event.craftMatrix.getStackInSlot(i);
                if(swordCast != null && swordCast.getItem() == ShinseiTools.swordCast){
                    ItemStack k = new ItemStack(ShinseiTools.swordCast, 2, (swordCast.getItemDamage() + 1));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeBrass = event.craftMatrix.getStackInSlot(i);
                if(axeBrass != null && axeBrass.getItem() == ShinseiTools.brassAxe){
                    ItemStack k = new ItemStack(ShinseiTools.brassAxe, 2, (axeBrass.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeBronze = event.craftMatrix.getStackInSlot(i);
                if(axeBronze != null && axeBronze.getItem() == ShinseiTools.bronzeAxe){
                    ItemStack k = new ItemStack(ShinseiTools.bronzeAxe, 2, (axeBronze.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeCopper = event.craftMatrix.getStackInSlot(i);
                if(axeCopper != null && axeCopper.getItem() == ShinseiTools.copperAxe){
                    ItemStack k = new ItemStack(ShinseiTools.copperAxe, 2, (axeCopper.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeDiamond = event.craftMatrix.getStackInSlot(i);
                if(axeDiamond != null && axeDiamond.getItem() == Items.diamond_axe){
                    ItemStack k = new ItemStack(Items.diamond_axe, 2, (axeDiamond.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeGold = event.craftMatrix.getStackInSlot(i);
                if(axeGold != null && axeGold.getItem() == Items.golden_axe){
                    ItemStack k = new ItemStack(Items.golden_axe, 2, (axeGold.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeIron = event.craftMatrix.getStackInSlot(i);
                if(axeIron != null && axeIron.getItem() == Items.iron_axe){
                    ItemStack k = new ItemStack(Items.iron_axe, 2, (axeIron.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeSilver = event.craftMatrix.getStackInSlot(i);
                if(axeSilver != null && axeSilver.getItem() == ShinseiTools.silverAxe){
                    ItemStack k = new ItemStack(ShinseiTools.silverAxe, 2, (axeSilver.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeSteel = event.craftMatrix.getStackInSlot(i);
                if(axeSteel != null && axeSteel.getItem() == ShinseiTools.steelAxe){
                    ItemStack k = new ItemStack(ShinseiTools.steelAxe, 2, (axeSteel.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeStainlessSteel = event.craftMatrix.getStackInSlot(i);
                if(axeStainlessSteel != null && axeStainlessSteel.getItem() == ShinseiTools.stainlessSteelAxe){
                    ItemStack k = new ItemStack(ShinseiTools.stainlessSteelAxe, 2, (axeStainlessSteel.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeStone = event.craftMatrix.getStackInSlot(i);
                if(axeStone != null && axeStone.getItem() == Items.stone_axe){
                    ItemStack k = new ItemStack(Items.stone_axe, 2, (axeStone.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeTitanium = event.craftMatrix.getStackInSlot(i);
                if(axeTitanium != null && axeTitanium.getItem() == ShinseiTools.titaniumAxe){
                    ItemStack k = new ItemStack(ShinseiTools.titaniumAxe, 2, (axeTitanium.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack axeWood = event.craftMatrix.getStackInSlot(i);
                if(axeWood != null && axeWood.getItem() == Items.wooden_axe){
                    ItemStack k = new ItemStack(Items.wooden_axe, 2, (axeWood.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack pickaxeBrass = event.craftMatrix.getStackInSlot(i);
                if(pickaxeBrass != null && pickaxeBrass.getItem() == ShinseiTools.brassPickaxe){
                    ItemStack k = new ItemStack(ShinseiTools.brassPickaxe, 2, (pickaxeBrass.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack chiselBrass = event.craftMatrix.getStackInSlot(i);
                if(chiselBrass != null && chiselBrass.getItem() == ShinseiTools.brassChisel){
                    ItemStack k = new ItemStack(ShinseiTools.brassChisel, 2, (chiselBrass.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack chiselBronze = event.craftMatrix.getStackInSlot(i);
                if(chiselBronze != null && chiselBronze.getItem() == ShinseiTools.bronzeChisel){
                    ItemStack k = new ItemStack(ShinseiTools.bronzeChisel, 2, (chiselBronze.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack chiselCopper = event.craftMatrix.getStackInSlot(i);
                if(chiselCopper != null && chiselCopper.getItem() == ShinseiTools.copperChisel){
                    ItemStack k = new ItemStack(ShinseiTools.copperChisel, 2, (chiselCopper.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack chiselIron = event.craftMatrix.getStackInSlot(i);
                if(chiselIron != null && chiselIron.getItem() == ShinseiTools.ironChisel){
                    ItemStack k = new ItemStack(ShinseiTools.ironChisel, 2, (chiselIron.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack chiselStainlessSteel = event.craftMatrix.getStackInSlot(i);
                if(chiselStainlessSteel != null && chiselStainlessSteel.getItem() == ShinseiTools.stainlessSteelChisel){
                    ItemStack k = new ItemStack(ShinseiTools.stainlessSteelChisel, 2, (chiselStainlessSteel.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack chiselSteel = event.craftMatrix.getStackInSlot(i);
                if(chiselSteel != null && chiselSteel.getItem() == ShinseiTools.steelChisel){
                    ItemStack k = new ItemStack(ShinseiTools.steelChisel, 2, (chiselSteel.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack chiselStone = event.craftMatrix.getStackInSlot(i);
                if(chiselStone != null && chiselStone.getItem() == ShinseiTools.stoneChisel){
                    ItemStack k = new ItemStack(ShinseiTools.stoneChisel, 2, (chiselStone.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack chiselTitanium = event.craftMatrix.getStackInSlot(i);
                if(chiselTitanium != null && chiselTitanium.getItem() == ShinseiTools.titaniumChisel){
                    ItemStack k = new ItemStack(ShinseiTools.titaniumChisel, 2, (chiselTitanium.getItemDamage() + 2));

                    if(k.getItemDamage() >= k.getMaxDamage()){
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

            }
		}
	}

	
}
