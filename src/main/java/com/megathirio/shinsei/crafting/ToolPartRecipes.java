package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.init.ShinseiBlocks;
import com.megathirio.shinsei.init.ShinseiTools;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class ToolPartRecipes {
    private String[][] recipePatterns = new String[][] {{"@@ ", "@  ", "   "}, {" @ ", "@  ", "   "}, {" @ ", "@ @", "   "}, {" @ ", "   ", "   "}, {" @ ", " @ ", " @ "}};
    private Object[][] recipeItems;

    public ToolPartRecipes()
    {
        this.recipeItems = new Object[][] {{Blocks.planks, Blocks.cobblestone, Blocks.stone, ShinseiBlocks.limestoneBlock}, {ShinseiTools.woodAxeHead, ShinseiTools.stoneAxeHead}, {ShinseiTools.woodHoeHead, ShinseiTools.stoneHoeHead}, {ShinseiTools.woodPickaxeHead, ShinseiTools.stonePickaxeHead}, {ShinseiTools.woodShovelHead, ShinseiTools.stoneShovelHead}, {ShinseiTools.woodSwordBlade, ShinseiTools.stoneSwordBlade}};
    }

    /**
     * Adds the tool recipes to the CraftingManager.
     */
    public void addRecipes(CraftingManager craftingManager)
    {
        for (int i = 0; i < this.recipeItems[0].length - 2; ++i)
        {
            Object object = this.recipeItems[0][i];

            for (int j = 0; j < this.recipeItems.length - 1; ++j)
            {
                for (int k = 0; k < 2; ++k)
                {
                Item item = (Item)this.recipeItems[j + 1][k];
                    craftingManager.addRecipe(new ItemStack(item), new Object[] {this.recipePatterns[j], '@', object});
                }
            }
        }
    }


}
