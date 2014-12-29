package com.megathirio.shinsei.init;

import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ShinseiTabs {
    public static final CreativeTabs ORES_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.ORE_TAB) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiBlocks.acanthiteOre);
        }
    };

    public static final CreativeTabs ITEMS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.ITEM_TAB) {
        @Override
        public Item getTabIconItem() {
            return ShinseiItems.amethystGem;
        }
    };

    public static final CreativeTabs POWDERS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.POWDER_TAB) {
        @Override
        public Item getTabIconItem() {
            return ShinseiItems.infusedDiamondPowder;
        }
    };

    public static final CreativeTabs BLOCKS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.BLOCK_TAB) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiBlocks.steelBlock);
        }
    };

    public static final CreativeTabs DECO_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.DECO_TAB) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiBlocks.jadeLampOn);
        }
    };

    public static final CreativeTabs TOOLS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.TOOL_TAB) {
        @Override
        public Item getTabIconItem() {
            return ShinseiTools.copperPickaxe;
        }
    };

    public static final CreativeTabs MACHINES_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.MACHINE_TAB) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ShinseiBlocks.fanesuOff);
        }
    };

    public static final CreativeTabs FOODS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.FOOD_TAB) {
        @Override
        public Item getTabIconItem() { return ShinseiItems.chickenPoisoned; }
    };

    public static final CreativeTabs FLUIDS_TAB = new CreativeTabs(Reference.RESOURCE_PREFIX + Names.Tabs.FLUID_TAB) {
        @Override
        public Item getTabIconItem() {
            return ShinseiFluids.slakedLimeBucket;
        }
    };

}