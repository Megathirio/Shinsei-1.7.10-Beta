package com.megathirio.shinsei.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.crafting.RecipesTools;

public class FoodRecipes extends RecipesTools {
    private String[][] recipePatterns = new String[][] {{" X ", "X#X", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {" X", "X#", " #"}};
    private Object[][] recipeItems;

    public FoodRecipes()
    {
        this.recipeItems = new Object[][] {{Blocks.planks, Blocks.cobblestone, Items.iron_ingot, Items.diamond, Items.gold_ingot}, {Items.wooden_pickaxe, Items.stone_pickaxe, Items.iron_pickaxe, Items.diamond_pickaxe, Items.golden_pickaxe}, {Items.wooden_shovel, Items.stone_shovel, Items.iron_shovel, Items.diamond_shovel, Items.golden_shovel}, {Items.wooden_axe, Items.stone_axe, Items.iron_axe, Items.diamond_axe, Items.golden_axe}, {Items.wooden_hoe, Items.stone_hoe, Items.iron_hoe, Items.diamond_hoe, Items.golden_hoe}};
    }


}
