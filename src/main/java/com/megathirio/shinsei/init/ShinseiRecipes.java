package com.megathirio.shinsei.init;

import com.megathirio.shinsei.crafting.FoodRecipes;
import com.megathirio.shinsei.reference.ConfigValues;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ShinseiRecipes {

    public static void init(){

		//Override Recipes
        if (ConfigValues.booToolValue == false) {
            RecipeOverride.overrideCraftingRecipe();
        }

//            GameRegistry.addRecipe((IRecipe) new ToolPartRecipes());

        // Smelting
            //Ore -> Ingot
            GameRegistry.addSmelting(ShinseiBlocks.acanthiteOre, new ItemStack(ShinseiItems.silverIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.stibniteOre, new ItemStack(ShinseiItems.antimonyIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.borniteOre, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.cassiteriteOre, new ItemStack(ShinseiItems.tinIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chalcopyriteOre, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chromiteOre, new ItemStack(ShinseiItems.chromiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.cobaltiteOre, new ItemStack(ShinseiItems.cobaltIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.galenaOre, new ItemStack(ShinseiItems.leadIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.hematiteOre, new ItemStack(Items.iron_ingot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.molybdeniteOre, new ItemStack(ShinseiItems.molybdenumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.pentlanditeOre, new ItemStack(ShinseiItems.nickelIngot, 1), 1f);

            //Powder -> Ingot
            GameRegistry.addSmelting(ShinseiItems.aluminumPowder, new ItemStack(ShinseiItems.aluminumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.antimonyPowder, new ItemStack(ShinseiItems.antimonyIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.bariumPowder, new ItemStack(ShinseiItems.bariumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.bismuthPowder, new ItemStack(ShinseiItems.bismuthIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.brassPowder, new ItemStack(ShinseiItems.brassIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.bronzePowder, new ItemStack(ShinseiItems.bronzeIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.chromiumPowder, new ItemStack(ShinseiItems.chromiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.cobaltPowder, new ItemStack(ShinseiItems.cobaltIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.copperPowder, new ItemStack(ShinseiItems.copperIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.indiumPowder, new ItemStack(ShinseiItems.indiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.iridiumPowder, new ItemStack(ShinseiItems.iridiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.ironPowder, new ItemStack(Items.iron_ingot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.leadPowder, new ItemStack(ShinseiItems.leadIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.magnesiumPowder, new ItemStack(ShinseiItems.magnesiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.manganesePowder, new ItemStack(ShinseiItems.manganeseIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.molybdenumPowder, new ItemStack(ShinseiItems.molybdenumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.nickelPowder, new ItemStack(ShinseiItems.nickelIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.platinumPowder, new ItemStack(ShinseiItems.platinumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.silverPowder, new ItemStack(ShinseiItems.silverIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.stainlessSteelPowder, new ItemStack(ShinseiItems.stainlessSteelIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.steelPowder, new ItemStack(ShinseiItems.steelIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.tantalumPowder, new ItemStack(ShinseiItems.tantalumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.tinPowder, new ItemStack(ShinseiItems.tinIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.titaniumPowder, new ItemStack(ShinseiItems.titaniumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.tungstenPowder, new ItemStack(ShinseiItems.tungstenIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.vanadiumPowder, new ItemStack(ShinseiItems.vanadiumIngot, 1), 1f);
            GameRegistry.addSmelting(ShinseiItems.zincPowder, new ItemStack(ShinseiItems.zincIngot, 1), 1f);

            //Ore -> Powder
            GameRegistry.addSmelting(ShinseiBlocks.dolomiteOre, new ItemStack(ShinseiItems.dolomitePowder, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.realgarOre, new ItemStack(ShinseiItems.arsenicPowder, 4), 1f);

            //Misc
            GameRegistry.addSmelting(ShinseiBlocks.basaltCobble, new ItemStack(ShinseiBlocks.basaltBlock, 1), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.limestoneBlock, new ItemStack(ShinseiItems.quicklime, 2), 1f);
            GameRegistry.addSmelting(ShinseiBlocks.chalkBlock, new ItemStack(ShinseiItems.quicklime, 2), 1f);
            GameRegistry.addSmelting(ShinseiItems.chalkPowder, new ItemStack(ShinseiItems.quicklime, 1), 1f);

        //Shapeless
            //Foods
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.beefCured), Items.beef, "dustSalt", "dustSalt", "dustSalt"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.porkCured), Items.porkchop, "dustSalt", "dustSalt", "dustSalt"));

            //Foods - Poisoned
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.applePoisoned), Items.apple, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.beefPoisoned), Items.cooked_beef, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.breadPoisoned), Items.bread, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.carrotPoisoned), Items.carrot, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chickenPoisoned), Items.cooked_chicken, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cookiePoisoned), Items.cookie, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.fishCodPoisoned), new ItemStack(Items.cooked_fished, 1, 0), "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.fishSalmonPoisoned), new ItemStack(Items.cooked_fished, 1, 1), "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.melonPoisoned), Items.melon, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.milkPoisoned), Items.milk_bucket, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.piePoisoned), Items.pumpkin_pie, "dustArsenic", "dustArsenic"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.porkPoisoned), Items.cooked_porkchop, "dustArsenic", "dustArsenic"));

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.apple), ShinseiItems.applePoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cooked_beef), ShinseiItems.beefPoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.bread), ShinseiItems.breadPoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.carrot), ShinseiItems.carrotPoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cooked_chicken), ShinseiItems.chickenPoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cookie), ShinseiItems.cookiePoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cooked_fished, 1, 0), ShinseiItems.fishCodPoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cooked_fished, 1, 1), ShinseiItems.fishSalmonPoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.melon), ShinseiItems.melonPoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.milk_bucket), ShinseiItems.milkPoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.pumpkin_pie), ShinseiItems.piePoisoned, "dustActivatedCarbon"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.cooked_porkchop), ShinseiItems.porkPoisoned, "dustActivatedCarbon"));

            //Special Powders
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.causticPotash), "bucketSlakedLime", "dustPotash"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.yellowcakePowder), "dustCausticPotash", "dustUranium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedAmethystPowder), "dustAmethyst", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedAmethystPowder), "dustAmethyst", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedApatitePowder), "dustApatite", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedApatitePowder), "dustApatite", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedAquamarinePowder), "dustAquamarine", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedAquamarinePowder), "dustAquamarine", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedDiamondPowder), "dustDiamond", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedDiamondPowder), "dustDiamond", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedEmeraldPowder), "dustEmerald", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedEmeraldPowder), "dustEmerald", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedFluoritePowder), "dustFluorite", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedFluoritePowder), "dustFluorite", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedJadePowder), "dustJade", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedJadePowder), "dustJade", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedOnyxPowder), "dustOnyx", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedOnyxPowder), "dustOnyx", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedOpalPowder), "dustOpal", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedOpalPowder), "dustOpal", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedPeridotPowder), "dustPeridot", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedPeridotPowder), "dustPeridot", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedRubyPowder), "dustRuby", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedRubyPowder), "dustRuby", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedSapphirePowder), "dustSapphire", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedSapphirePowder), "dustSapphire", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedScarletEmeraldPowder), "dustScarletEmerald", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedScarletEmeraldPowder), "dustScarletEmerald", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedTopazPowder), "dustTopaz", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedTopazPowder), "dustTopaz", Items.glowstone_dust));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chargedTurquoisePowder), "dustTurquoise", Items.redstone));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.infusedTurquoisePowder), "dustTurquoise", Items.glowstone_dust));

            //Ingot -> Nugget
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumNugget, 9), "ingotAluminum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.antimonyNugget, 9), "ingotAntimony"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumNugget, 9), "ingotBarium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthNugget, 9), "ingotBismuth"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.brassNugget, 9), "ingotBrass"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bronzeNugget, 9), "ingotBronze"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumNugget, 9), "ingotChrome"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltNugget, 9), "ingotCobalt"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperNugget, 9), "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.indiumNugget, 9), "ingotIndium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.iridiumNugget, 9), "ingotIridium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ironNugget, 9), "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.leadNugget, 9), "ingotLead"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.magnesiumNugget, 9), "ingotMagnesium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.manganeseNugget, 9), "ingotManganese"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.molybdenumNugget, 9), "ingotMolybdenum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.nickelNugget, 9), "ingotNickel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.platinumNugget, 9), "ingotPlatinum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverNugget, 9), "ingotSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.stainlessSteelNugget, 9), "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.steelNugget, 9), "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tantalumNugget, 9), "ingotTantalum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinNugget, 9), "ingotTin"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.titaniumNugget, 9), "ingotTitanium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tungstenNugget, 9), "ingotTungsten"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.vanadiumNugget, 9), "ingotVanadium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.zincNugget, 9), "ingotZinc"));

            //Block -> Ingot
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumIngot, 9), "blockAluminum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.antimonyIngot, 9), "blockAntimony"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bariumIngot, 9), "blockBarium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthIngot, 9), "blockBismuth"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.brassIngot, 9), "blockBrass"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bronzeIngot, 9), "blockBronze"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.chromiumIngot, 9), "blockChrome"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.cobaltIngot, 9), "blockCobalt"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperIngot, 9), "blockCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.indiumIngot, 9), "blockIndium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.iridiumIngot, 9), "blockIridium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_ingot, 9), "blockIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.magnesiumIngot, 9), "blockMagnesium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.manganeseIngot, 9), "blockManganese"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.molybdenumIngot, 9), "blockMolybdenum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.nickelIngot, 9), "blockNickel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.leadIngot, 9), "blockLead"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.platinumIngot, 9), "blockPlatinum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.silverIngot, 9), "blockSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.stainlessSteelIngot, 9), "blockStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.steelIngot, 9), "blockSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tantalumIngot, 9), "blockTantalum"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tinIngot, 9), "blockTin"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.titaniumIngot, 9), "blockTitanium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.tungstenIngot, 9), "blockTungsten"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.vanadiumIngot, 9), "blockVanadium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.zincIngot, 9), "blockZinc"));

            //Block -> Gem/Crystal
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.apatiteCrystal, 9), "blockApatite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.amethystGem, 9), "blockAmethyst"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aquamarineGem, 9), "blockAquamarine"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.fluoriteCrystal, 9), "blockFluorite"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.jadeGem, 9), "blockJade"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.onyxGem, 9), "blockOnyx"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.opalGem, 9), "blockOpal"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.peridotGem, 9), "blockPeridot"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.rubyGem, 9), "blockRuby"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.sapphireGem, 9), "blockSapphire"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.scarletEmeraldGem, 9), ShinseiBlocks.scarletEmeraldBlock));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.topazGem, 9), "blockTopaz"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.turquoiseGem, 9), "blockTurquoise"));

            //Machines
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockStone"));

            //Misc
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.clay), ShinseiItems.silt, ShinseiItems.silt, ShinseiItems.silt, Blocks.dirt));

		//Shaped
            //Vanilla
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.emerald_block, 1), "@@@","@@@","@@@", '@', Items.emerald));

            //Handles
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodToolHandle, 1), "@","@", '@', "stickWood"));

            //Ingot -> Block
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aluminumBlock, 1), "@@@","@@@","@@@", '@', "ingotAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.antimonyBlock, 1), "@@@","@@@","@@@", '@', "ingotAntimony"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.bariumBlock, 1), "@@@","@@@","@@@", '@', "ingotBarium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.bismuthBlock, 1), "@@@","@@@","@@@", '@', "ingotBismuth"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.brassBlock, 1), "@@@","@@@","@@@", '@', "ingotBrass"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.bronzeBlock, 1), "@@@","@@@","@@@", '@', "ingotBronze"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.chromiumBlock, 1), "@@@","@@@","@@@", '@', "ingotChrome"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.cobaltBlock, 1), "@@@","@@@","@@@", '@', "ingotCobalt"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.copperBlock, 1), "@@@","@@@","@@@", '@', "ingotCopper"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.iron_block, 1), "@@@","@@@","@@@", '@', "ingotIron"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.leadBlock, 1), "@@@","@@@","@@@", '@', "ingotLead"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.magnesiumBlock, 1), "@@@","@@@","@@@", '@', "ingotMagnesium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.manganeseBlock, 1), "@@@","@@@","@@@", '@', "ingotManganese"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.molybdenumBlock, 1), "@@@","@@@","@@@", '@', "ingotMolybdenum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.nickelBlock, 1), "@@@","@@@","@@@", '@', "ingotNickel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.platinumBlock, 1), "@@@","@@@","@@@", '@', "ingotPlatinum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.silverBlock, 1), "@@@","@@@","@@@", '@', "ingotSilver"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.stainlessSteelBlock, 1), "@@@","@@@","@@@", '@', "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.steelBlock, 1), "@@@","@@@","@@@", '@', "ingotSteel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.tantalumBlock, 1), "@@@","@@@","@@@", '@', "ingotTantalum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.tinBlock, 1), "@@@","@@@","@@@", '@', "ingotTin"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.titaniumBlock, 1), "@@@","@@@","@@@", '@', "ingotTitanium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.tungstenBlock, 1), "@@@","@@@","@@@", '@', "ingotTungsten"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.vanadiumBlock, 1), "@@@","@@@","@@@", '@', "ingotVanadium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.zincBlock, 1), "@@@","@@@","@@@", '@', "ingotZinc"));

            //Gem/Crystal -> Block
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.amethystBlock, 1), "@@@","@@@","@@@", '@', "gemAmethyst"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.apatiteBlock, 1), "@@@","@@@","@@@", '@', "gemApatite"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aquamarineBlock, 1), "@@@","@@@","@@@", '@', "gemAquamarine"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.fluoriteBlock, 1), "@@@","@@@","@@@", '@', "gemFluorite"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.jadeBlock, 1), "@@@","@@@","@@@", '@', "gemJade"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.onyxBlock, 1), "@@@","@@@","@@@", '@', "gemOnyx"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.opalBlock, 1), "@@@","@@@","@@@", '@', "gemOpal"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.peridotBlock, 1), "@@@","@@@","@@@", '@', "gemPeridot"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.rubyBlock, 1), "@@@","@@@","@@@", '@', "gemRuby"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sapphireBlock, 1), "@@@","@@@","@@@", '@', "gemSapphire"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.scarletEmeraldBlock, 1), "@@@","@@@","@@@", '@', ShinseiItems.scarletEmeraldGem));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.topazBlock, 1), "@@@","@@@","@@@", '@', "gemTopaz"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.turquoiseBlock, 1), "@@@","@@@","@@@", '@', "gemTurquoise"));

            //Nugget -> Ingot
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.aluminumIngot, 1), "@@@","@@@","@@@", '@', "nuggetAluminum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.antimonyIngot, 1), "@@@","@@@","@@@", '@', "nuggetAntimony"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.bariumIngot, 1), "@@@","@@@","@@@", '@', "nuggetBarium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.bismuthIngot, 1), "@@@","@@@","@@@", '@', "nuggetBismuth"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.brassIngot, 1), "@@@","@@@","@@@", '@', "nuggetBrass"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.bronzeIngot, 1), "@@@","@@@","@@@", '@', "nuggetBronze"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.chromiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetChrome"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.cobaltIngot, 1), "@@@","@@@","@@@", '@', "nuggetCobalt"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.copperIngot, 1), "@@@","@@@","@@@", '@', "nuggetCopper"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.indiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetIndium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.iridiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetIridium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot, 1), "@@@","@@@","@@@", '@', "nuggetIron"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.leadIngot, 1), "@@@","@@@","@@@", '@', "nuggetLead"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.magnesiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetMagnesium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.manganeseIngot, 1), "@@@","@@@","@@@", '@', "nuggetManganese"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.molybdenumIngot, 1), "@@@","@@@","@@@", '@', "nuggetMolybdenum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.nickelIngot, 1), "@@@","@@@","@@@", '@', "nuggetNickel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.platinumIngot, 1), "@@@","@@@","@@@", '@', "nuggetPlatinum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.silverIngot, 1), "@@@","@@@","@@@", '@', "nuggetSilver"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.stainlessSteelIngot, 1), "@@@","@@@","@@@", '@', "nuggetStainlessSteel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.steelIngot, 1), "@@@","@@@","@@@", '@', "nuggetSteel"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.tantalumIngot, 1), "@@@","@@@","@@@", '@', "nuggetTantalum"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.tinIngot, 1), "@@@","@@@","@@@", '@', "nuggetTin"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.titaniumIngot, 1), "@@@","@@@","@@@", '@', "nuggetTitanium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.tungstenIngot, 1), "@@@","@@@","@@@", '@', "nuggetTungsten"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.vanadiumIngot, 1), "@@@","@@@","@@@", '@', "nuggetVanadium"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiItems.zincIngot, 1), "@@@","@@@","@@@", '@', "nuggetZinc"));

    //Temporary Recipes

        //Fuels
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(ShinseiTools.brassAxe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(ShinseiTools.bronzeAxe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(ShinseiTools.copperAxe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(ShinseiTools.silverAxe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(ShinseiTools.stainlessSteelAxe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(ShinseiTools.steelAxe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(ShinseiTools.titaniumAxe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(Items.wooden_axe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(Items.stone_axe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(Items.iron_axe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(Items.golden_axe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.splitWood, 2), new ItemStack(Items.diamond_axe, 1, OreDictionary.WILDCARD_VALUE), "logWood"));
        GameRegistry.addSmelting(Items.coal, new ItemStack(ShinseiItems.coke, 1), 1f);

        //Powder -> Gem/Crystal
        GameRegistry.addSmelting(ShinseiItems.amethystPowder, new ItemStack(ShinseiItems.amethystGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.apatitePowder, new ItemStack(ShinseiItems.apatiteCrystal, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.aquamarinePowder, new ItemStack(ShinseiItems.aquamarineGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.fluoritePowder, new ItemStack(ShinseiItems.fluoriteCrystal, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.jadePowder, new ItemStack(ShinseiItems.jadeGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.onyxPowder, new ItemStack(ShinseiItems.onyxGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.opalPowder, new ItemStack(ShinseiItems.opalGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.peridotPowder, new ItemStack(ShinseiItems.peridotGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.platinumPowder, new ItemStack(ShinseiItems.platinumIngot, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.rubyPowder, new ItemStack(ShinseiItems.rubyGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.sapphirePowder, new ItemStack(ShinseiItems.sapphireGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.scarletEmeraldPowder, new ItemStack(ShinseiItems.scarletEmeraldGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.topazPowder, new ItemStack(ShinseiItems.topazGem, 1), 1f);
        GameRegistry.addSmelting(ShinseiItems.turquoisePowder, new ItemStack(ShinseiItems.turquoiseGem, 1), 1f);

        //Alloya (Temporary)
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bronzePowder, 3), "dustCopper", "dustCopper", "dustTin", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.brassPowder, 2), "dustCopper", "dustZinc", "dustArsenic"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.vanadiumPowder, 1), "dustSalt", "dustCalcium", "dustMagnesium"));

        //Deco (Temporary)
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 0), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 15)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 1), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 0)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 2), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 4)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 3), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 3)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 4), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 6)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 5), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 8)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 6), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 2)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 7), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 12)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 8), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 10)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 9), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 13)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 10), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 14)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 11), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 9)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 12), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 5)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 13), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 1)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 14), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 7)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sidingBlock, 8, 15), "@@@","@#@","@@@", '@', new ItemStack(Blocks.planks) ,'#', new ItemStack(Items.dye, 1, 11)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.brickBlock, 1, 0), Blocks.brick_block, new ItemStack(Items.dye, 1, 7)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.brickBlock, 1, 1), Blocks.brick_block, new ItemStack(Items.dye, 1, 3)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.brickBlock, 1, 2), Blocks.brick_block, new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.stuccoBlock, 1), "dustLime", "dustLime", "dustLime", Blocks.sand, Items.water_bucket));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.stuccoBlock, 1), Blocks.sand, ShinseiFluids.slakedLimeBucket));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.graphiteBricks, 1), "@@ ","@@ ", '@', ShinseiItems.graphiteBrick));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.graphiteBrick, 1), "dustCoke", "dustAluminum", "dustGraphite"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.amethystLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedAmethystPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.apatiteLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedApatitePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aquamarineLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedAquamarinePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.diamondLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedDiamondPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.emeraldLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedEmeraldPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.fluoriteLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedFluoritePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.jadeLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedJadePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.onyxLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedOnyxPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.opalLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedOpalPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.peridotLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedPeridotPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.rubyLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedRubyPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sapphireLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedSapphirePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.scarletEmeraldLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedScarletEmeraldPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.topazLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedTopazPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.turquoiseLampOff, 1), "@#@","#$#","@#@", '@', "ingotLead" , '#', Blocks.glass_pane, '$', ShinseiItems.chargedTurquoisePowder));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.amethystStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedAmethystPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.apatiteStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedApatitePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.aquamarineStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedAquamarinePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.diamondStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedDiamondPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.emeraldStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedEmeraldPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.fluoriteStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedFluoritePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.jadeStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedJadePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.onyxStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedOnyxPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.opalStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedOpalPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.peridotStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedPeridotPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.rubyStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedRubyPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.sapphireStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedSapphirePowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.scarletEmeraldStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedScarletEmeraldPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.topazStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedTopazPowder));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.turquoiseStone, 1), "@#@","#$#","@#@", '@', "ingotTitanium" , '#', Blocks.glass_pane, '$', ShinseiItems.infusedTurquoisePowder));

        //Steel (Temporary)
        GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(ShinseiItems.pigIronIngot, 1), 1f);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gold_ingot, 2), "oreGold", "dustBorax"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.aluminumPowder, 2), "oreAluminum", "dustCryolite", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthPowder, 2), "oreBismuth", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.bismuthPowder, 4), "oreBismuth", "dustMagnesium", "dustCalcium"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.magnesiumPowder, 2), "dustDolomite", "dustFerrosilicon"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.manganesePowder, 2), "oreManganese", "dustSulphur", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.zincPowder, 2), "oreZinc", Items.redstone));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.carbonActivated, 1), "dustCalciumChloride", "dustCoke", Items.coal));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.calciumChloridePowder, 1), "dustCalcium", "dustSalt", Items.water_bucket));

        //Colored Stones (Temporary)
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 1),new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 0)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 2), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 4)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 3), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 3)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 4), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 6)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 5), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 8)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 6), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 2)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 7), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 12)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 8), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 10)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 9), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 13)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 10), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 14)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 11), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 9)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 12), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 5)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 13), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 14), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 7)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.marbleBlock, 1, 15), new ItemStack(ShinseiBlocks.marbleBlock, 1, 0), new ItemStack(Items.dye, 1, 11)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 1), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 0)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 2), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 4)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 3), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 3)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 4), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 6)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 5), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 8)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 6), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 2)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 7), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 12)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 8), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 10)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 9), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 13)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 10), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 14)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 11), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 9)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 12), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 5)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 13), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 14), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 7)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiBlocks.graniteBlock, 1, 15), new ItemStack(ShinseiBlocks.graniteBlock, 1, 0), new ItemStack(Items.dye, 1, 11)));

        //Fluids (Temporary)
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiFluids.slakedLimeBucket, 1), "dustQuicklime", "dustQuicklime", "dustQuicklime", Items.water_bucket));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiFluids.mercuryBucket, 1), "dustMercury", "dustCoke", Items.water_bucket));

        //Tool Recipes
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.copperHeatPlate, 1), ShinseiBlocks.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiItems.ironHeatPlate, 1), ShinseiBlocks.ironPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.axeCast, 1), ShinseiTools.stoneAxeHead, ShinseiBlocks.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.hoeCast, 1), ShinseiTools.stoneHoeHead, ShinseiBlocks.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.pickaxeCast, 1), ShinseiTools.stonePickaxeHead, ShinseiBlocks.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.shovelCast, 1), ShinseiTools.stoneShovelHead, ShinseiBlocks.copperPlate));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.swordCast, 1), ShinseiTools.stoneSwordBlade, ShinseiBlocks.copperPlate));

        //Tool Parts
            //Brass
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBrass"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBrass"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBrass"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBrass"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBrass"));

            //Bronze
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBronze"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBronze"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzePickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBronze"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBronze"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotBronze"));

            //Copper
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotCopper"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotCopper"));

            //Gold
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.goldSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotGold"));

            //Diamond
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), Items.diamond));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), Items.diamond));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), Items.diamond));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), Items.diamond));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.diamondSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), Items.diamond));

            //Iron
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotIron"));

            //Silver
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSilver"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSilver"));

            //Stainless Steel
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotStainlessSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotStainlessSteel"));

            //Steel
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSteel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotSteel"));

            //Stone
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneAxeHead, 1), "@@ ","@  ","   ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneAxeHead, 1), "@@ ","@  ","   ", '@', "blockStone"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneHoeHead, 1), " @ ","@  ","   ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneHoeHead, 1), " @ ","@  ","   ", '@', "blockStone"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stonePickaxeHead, 1), " @ ","@ @","   ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stonePickaxeHead, 1), " @ ","@ @","   ", '@', "blockStone"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneShovelHead, 1), " @ ","   ","   ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneShovelHead, 1), " @ ","   ","   ", '@', "blockStone"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneSwordBlade, 1), " @ "," @ "," @ ", '@', "blockCobble"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.stoneSwordBlade, 1), " @ "," @ "," @ ", '@', "blockStone"));

            //Titanium
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumAxeHead, 1), new ItemStack(ShinseiTools.axeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotTitanium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumHoeHead, 1), new ItemStack(ShinseiTools.hoeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotTitanium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumPickaxeHead, 1), new ItemStack(ShinseiTools.pickaxeCast, 1, OreDictionary.WILDCARD_VALUE), "ingotTitanium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumShovelHead, 1), new ItemStack(ShinseiTools.shovelCast, 1, OreDictionary.WILDCARD_VALUE), "ingotTitanium"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumSwordBlade, 1), new ItemStack(ShinseiTools.swordCast, 1, OreDictionary.WILDCARD_VALUE), "ingotTitanium"));

            //Wood
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodAxeHead, 1), "@@ ","@  ","   ", '@', "plankWood"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodHoeHead, 1), " @ ","@  ","   ", '@', "plankWood"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodPickaxeHead, 1), " @ ","@ @","   ", '@', "plankWood"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodShovelHead, 1), " @ ","   ","   ", '@', "plankWood"));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.woodSwordBlade, 1), " @ "," @ "," @ ", '@', "plankWood"));

        //Tools
            //Brass
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassAxe, 1), ShinseiTools.brassAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassChisel, 1), ShinseiItems.brassIngot, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassHoe, 1), ShinseiTools.brassHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassPickaxe, 1), ShinseiTools.brassPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassShovel, 1), ShinseiTools.brassShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.brassSword, 1), ShinseiTools.brassSwordBlade, ShinseiTools.woodToolHandle));

            //Bronze
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeAxe, 1), ShinseiTools.bronzeAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeChisel, 1), ShinseiItems.bronzeIngot, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeHoe, 1), ShinseiTools.bronzeHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzePickaxe, 1), ShinseiTools.bronzePickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeShovel, 1), ShinseiTools.bronzeShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.bronzeSword, 1), ShinseiTools.bronzeSwordBlade, ShinseiTools.woodToolHandle));

            //Copper
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperAxe, 1), ShinseiTools.copperAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperChisel, 1), ShinseiItems.copperIngot, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperHoe, 1), ShinseiTools.copperHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperPickaxe, 1), ShinseiTools.copperPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperShovel, 1), ShinseiTools.copperShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.copperSword, 1), ShinseiTools.copperSwordBlade, ShinseiTools.woodToolHandle));

            //Diamond
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_axe, 1), ShinseiTools.diamondAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_hoe, 1), ShinseiTools.diamondHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_pickaxe, 1), ShinseiTools.diamondPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_shovel, 1), ShinseiTools.diamondShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond_sword, 1), ShinseiTools.diamondSwordBlade, ShinseiTools.woodToolHandle));

            //Gold
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_axe, 1), ShinseiTools.goldAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_hoe, 1), ShinseiTools.goldHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_pickaxe, 1), ShinseiTools.goldPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_shovel, 1), ShinseiTools.goldShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.golden_sword, 1), ShinseiTools.goldSwordBlade, ShinseiTools.woodToolHandle));

            //Iron
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_axe, 1), ShinseiTools.ironAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.ironChisel, 1), Items.iron_ingot, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_hoe, 1), ShinseiTools.ironHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_pickaxe, 1), ShinseiTools.ironPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_shovel, 1), ShinseiTools.ironShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.iron_sword, 1), ShinseiTools.ironSwordBlade, ShinseiTools.woodToolHandle));

            //Silver
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverAxe, 1), ShinseiTools.silverAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverHoe, 1), ShinseiTools.silverHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverPickaxe, 1), ShinseiTools.silverPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverShovel, 1), ShinseiTools.silverShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.silverSword, 1), ShinseiTools.silverSwordBlade, ShinseiTools.woodToolHandle));

            //Stainless Steel
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelAxe, 1), ShinseiTools.stainlessSteelAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelChisel, 1), ShinseiItems.stainlessSteelIngot, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelHoe, 1), ShinseiTools.stainlessSteelHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelPickaxe, 1), ShinseiTools.stainlessSteelPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelShovel, 1), ShinseiTools.stainlessSteelShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stainlessSteelSword, 1), ShinseiTools.stainlessSteelSwordBlade, ShinseiTools.woodToolHandle));

            //Steel
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelAxe, 1), ShinseiTools.steelAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelChisel, 1), ShinseiItems.steelIngot, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelHoe, 1), ShinseiTools.steelHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelPickaxe, 1), ShinseiTools.steelPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelShovel, 1), ShinseiTools.steelShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.steelSword, 1), ShinseiTools.steelSwordBlade, ShinseiTools.woodToolHandle));

            //Stone
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_axe, 1), ShinseiTools.stoneAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stoneChisel, 1), "blockStone", ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.stoneChisel, 1), "blockCobble", ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_hoe, 1), ShinseiTools.stoneHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_pickaxe, 1), ShinseiTools.stonePickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_shovel, 1), ShinseiTools.stoneShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.stone_sword, 1), ShinseiTools.stoneSwordBlade, ShinseiTools.woodToolHandle));

            //Titanium
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumAxe, 1), ShinseiTools.titaniumAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumChisel, 1), ShinseiItems.titaniumIngot, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumHoe, 1), ShinseiTools.titaniumHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumPickaxe, 1), ShinseiTools.titaniumPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumShovel, 1), ShinseiTools.titaniumShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ShinseiTools.titaniumSword, 1), ShinseiTools.titaniumSwordBlade, ShinseiTools.woodToolHandle));

            //Wood
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_axe, 1), ShinseiTools.woodAxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_hoe, 1), ShinseiTools.woodHoeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_pickaxe, 1), ShinseiTools.woodPickaxeHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_shovel, 1), ShinseiTools.woodShovelHead, ShinseiTools.woodToolHandle));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.wooden_sword, 1), ShinseiTools.woodSwordBlade, ShinseiTools.woodToolHandle));
    }
}