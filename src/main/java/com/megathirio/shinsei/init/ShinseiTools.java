package com.megathirio.shinsei.init;

import com.megathirio.shinsei.item.ItemShinsei;
import com.megathirio.shinsei.item.tool.*;
import com.megathirio.shinsei.item.tool.part.*;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiTools {
//Tool Varriables

    //Tools
        //Axes
        public static AxeShinsei brassAxe = new ItemBrassAxe();
        public static AxeShinsei bronzeAxe = new ItemBronzeAxe();
        public static AxeShinsei copperAxe = new ItemCopperAxe();
        public static AxeShinsei silverAxe = new ItemSilverAxe();
        public static AxeShinsei stainlessSteelAxe = new ItemStainlessSteelAxe();
        public static AxeShinsei steelAxe = new ItemSteelAxe();
        public static AxeShinsei titaniumAxe = new ItemTitaniumAxe();

        //Chisels
        public static ChiselShinsei brassChisel = new ItemBrassChisel();
        public static ChiselShinsei bronzeChisel = new ItemBronzeChisel();
        public static ChiselShinsei copperChisel = new ItemCopperChisel();
        public static ChiselShinsei ironChisel = new ItemIronChisel();
        public static ChiselShinsei stainlessSteelChisel = new ItemStainlessSteelChisel();
        public static ChiselShinsei steelChisel = new ItemSteelChisel();
        public static ChiselShinsei stoneChisel = new ItemStoneChisel();
        public static ChiselShinsei titaniumChisel = new ItemTitaniumChisel();

        //Hoes
        public static HoeShinsei brassHoe = new ItemBrassHoe();
        public static HoeShinsei bronzeHoe = new ItemBronzeHoe();
        public static HoeShinsei copperHoe = new ItemCopperHoe();
        public static HoeShinsei silverHoe = new ItemSilverHoe();
        public static HoeShinsei stainlessSteelHoe = new ItemStainlessSteelHoe();
        public static HoeShinsei steelHoe = new ItemSteelHoe();
        public static HoeShinsei titaniumHoe = new ItemTitaniumHoe();

        //Pickaxes
        public static PickaxeShinsei brassPickaxe = new ItemBrassPickaxe();
        public static PickaxeShinsei bronzePickaxe = new ItemBronzePickaxe();
        public static PickaxeShinsei copperPickaxe = new ItemCopperPickaxe();
        public static PickaxeShinsei silverPickaxe = new ItemSilverPickaxe();
        public static PickaxeShinsei stainlessSteelPickaxe = new ItemStainlessSteelPickaxe();
        public static PickaxeShinsei steelPickaxe = new ItemSteelPickaxe();
        public static PickaxeShinsei titaniumPickaxe = new ItemTitaniumPickaxe();

        //Shovels
        public static ShovelShinsei brassShovel = new ItemBrassShovel();
        public static ShovelShinsei bronzeShovel = new ItemBronzeShovel();
        public static ShovelShinsei copperShovel = new ItemCopperShovel();
        public static ShovelShinsei silverShovel = new ItemSilverShovel();
        public static ShovelShinsei stainlessSteelShovel = new ItemStainlessSteelShovel();
        public static ShovelShinsei steelShovel = new ItemSteelShovel();
        public static ShovelShinsei titaniumShovel = new ItemTitaniumShovel();

        //Swords
        public static SwordShinsei brassSword = new ItemBrassSword();
        public static SwordShinsei bronzeSword = new ItemBronzeSword();
        public static SwordShinsei copperSword = new ItemCopperSword();
        public static SwordShinsei silverSword = new ItemSilverSword();
        public static SwordShinsei stainlessSteelSword = new ItemStainlessSteelSword();
        public static SwordShinsei steelSword = new ItemSteelSword();
        public static SwordShinsei titaniumSword = new ItemTitaniumSword();

    //Tool Parts
        //Misc
        public static ItemShinsei woodToolHandle = new ItemWoodToolHandle();

        //Axes
        public static ItemShinsei brassAxeHead = new ItemBrassAxeHead();
        public static ItemShinsei bronzeAxeHead = new ItemBronzeAxeHead();
        public static ItemShinsei copperAxeHead = new ItemCopperAxeHead();
        public static ItemShinsei diamondAxeHead = new ItemDiamondAxeHead();
        public static ItemShinsei goldAxeHead = new ItemGoldAxeHead();
        public static ItemShinsei ironAxeHead = new ItemIronAxeHead();
        public static ItemShinsei silverAxeHead = new ItemSilverAxeHead();
        public static ItemShinsei stainlessSteelAxeHead = new ItemStainlessSteelAxeHead();
        public static ItemShinsei steelAxeHead = new ItemSteelAxeHead();
        public static ItemShinsei stoneAxeHead = new ItemStoneAxeHead();
        public static ItemShinsei titaniumAxeHead = new ItemTitaniumAxeHead();
        public static ItemShinsei woodAxeHead = new ItemWoodAxeHead();

        //Hoes
        public static ItemShinsei brassHoeHead = new ItemBrassHoeHead();
        public static ItemShinsei bronzeHoeHead = new ItemBronzeHoeHead();
        public static ItemShinsei copperHoeHead = new ItemCopperHoeHead();
        public static ItemShinsei diamondHoeHead = new ItemDiamondHoeHead();
        public static ItemShinsei goldHoeHead = new ItemGoldHoeHead();
        public static ItemShinsei ironHoeHead = new ItemIronHoeHead();
        public static ItemShinsei silverHoeHead = new ItemSilverHoeHead();
        public static ItemShinsei stainlessSteelHoeHead = new ItemStainlessSteelHoeHead();
        public static ItemShinsei steelHoeHead = new ItemSteelHoeHead();
        public static ItemShinsei stoneHoeHead = new ItemStoneHoeHead();
        public static ItemShinsei titaniumHoeHead = new ItemTitaniumHoeHead();
        public static ItemShinsei woodHoeHead = new ItemWoodHoeHead();

        //Pickaxes
        public static ItemShinsei brassPickaxeHead = new ItemBrassPickaxeHead();
        public static ItemShinsei bronzePickaxeHead = new ItemBronzePickaxeHead();
        public static ItemShinsei copperPickaxeHead = new ItemCopperPickaxeHead();
        public static ItemShinsei diamondPickaxeHead = new ItemDiamondPickaxeHead();
        public static ItemShinsei goldPickaxeHead = new ItemGoldPickaxeHead();
        public static ItemShinsei ironPickaxeHead = new ItemIronPickaxeHead();
        public static ItemShinsei silverPickaxeHead = new ItemSilverPickaxeHead();
        public static ItemShinsei stainlessSteelPickaxeHead = new ItemStainlessSteelPickaxeHead();
        public static ItemShinsei steelPickaxeHead = new ItemSteelPickaxeHead();
        public static ItemShinsei stonePickaxeHead = new ItemStonePickaxeHead();
        public static ItemShinsei titaniumPickaxeHead = new ItemTitaniumPickaxeHead();
        public static ItemShinsei woodPickaxeHead = new ItemWoodPickaxeHead();

        //Shovels
        public static ItemShinsei brassShovelHead = new ItemBrassShovelHead();
        public static ItemShinsei bronzeShovelHead = new ItemBronzeShovelHead();
        public static ItemShinsei copperShovelHead = new ItemCopperShovelHead();
        public static ItemShinsei diamondShovelHead = new ItemDiamondShovelHead();
        public static ItemShinsei goldShovelHead = new ItemGoldShovelHead();
        public static ItemShinsei ironShovelHead = new ItemIronShovelHead();
        public static ItemShinsei silverShovelHead = new ItemSilverShovelHead();
        public static ItemShinsei stainlessSteelShovelHead = new ItemStainlessSteelShovelHead();
        public static ItemShinsei steelShovelHead = new ItemSteelShovelHead();
        public static ItemShinsei stoneShovelHead = new ItemStoneShovelHead();
        public static ItemShinsei titaniumShovelHead = new ItemTitaniumShovelHead();
        public static ItemShinsei woodShovelHead = new ItemWoodShovelHead();

        //Swords
        public static ItemShinsei brassSwordBlade = new ItemBrassSwordBlade();
        public static ItemShinsei bronzeSwordBlade = new ItemBronzeSwordBlade();
        public static ItemShinsei copperSwordBlade = new ItemCopperSwordBlade();
        public static ItemShinsei diamondSwordBlade = new ItemDiamondSwordBlade();
        public static ItemShinsei goldSwordBlade = new ItemGoldSwordBlade();
        public static ItemShinsei ironSwordBlade = new ItemIronSwordBlade();
        public static ItemShinsei silverSwordBlade = new ItemSilverSwordBlade();
        public static ItemShinsei stainlessSteelSwordBlade = new ItemStainlessSteelSwordBlade();
        public static ItemShinsei steelSwordBlade = new ItemSteelSwordBlade();
        public static ItemShinsei stoneSwordBlade = new ItemStoneSwordBlade();
        public static ItemShinsei titaniumSwordBlade = new ItemTitaniumSwordBlade();
        public static ItemShinsei woodSwordBlade = new ItemWoodSwordBlade();

    //Tool Casts
        public static ItemShinsei axeCast = new ItemCopperAxeCast();
        public static ItemShinsei hoeCast = new ItemCopperHoeCast();
        public static ItemShinsei pickaxeCast = new ItemCopperPickaxeCast();
        public static ItemShinsei shovelCast = new ItemCopperShovelCast();
        public static ItemShinsei swordCast = new ItemCopperSwordCast();

//Tool Initialization
	public static void init(){
    //Tools
        //Axes
        GameRegistry.registerItem(brassAxe, Names.Materials.BRASS + Names.Forms.AXE);
        GameRegistry.registerItem(bronzeAxe, Names.Materials.BRONZE + Names.Forms.AXE);
        GameRegistry.registerItem(copperAxe, Names.Materials.COPPER + Names.Forms.AXE);
        GameRegistry.registerItem(silverAxe, Names.Materials.SILVER + Names.Forms.AXE);
        GameRegistry.registerItem(stainlessSteelAxe, Names.Materials.STAINLESS_STEEL + Names.Forms.AXE);
        GameRegistry.registerItem(steelAxe, Names.Materials.STEEL + Names.Forms.AXE);
        GameRegistry.registerItem(titaniumAxe, Names.Materials.TITANIUM + Names.Forms.AXE);

        //Chisels
        GameRegistry.registerItem(brassChisel, Names.Materials.BRASS + Names.Forms.CHISEL);
        GameRegistry.registerItem(bronzeChisel, Names.Materials.BRONZE + Names.Forms.CHISEL);
        GameRegistry.registerItem(copperChisel, Names.Materials.COPPER + Names.Forms.CHISEL);
        GameRegistry.registerItem(ironChisel, Names.Materials.IRON + Names.Forms.CHISEL);
        GameRegistry.registerItem(stainlessSteelChisel, Names.Materials.STAINLESS_STEEL + Names.Forms.CHISEL);
        GameRegistry.registerItem(steelChisel, Names.Materials.STEEL + Names.Forms.CHISEL);
        GameRegistry.registerItem(stoneChisel, Names.Materials.STONE + Names.Forms.CHISEL);
        GameRegistry.registerItem(titaniumChisel, Names.Materials.TITANIUM + Names.Forms.CHISEL);

        //Hoes
        GameRegistry.registerItem(brassHoe, Names.Materials.BRASS + Names.Forms.HOE);
        GameRegistry.registerItem(bronzeHoe, Names.Materials.BRONZE + Names.Forms.HOE);
        GameRegistry.registerItem(copperHoe, Names.Materials.COPPER + Names.Forms.HOE);
        GameRegistry.registerItem(silverHoe, Names.Materials.SILVER + Names.Forms.HOE);
        GameRegistry.registerItem(stainlessSteelHoe, Names.Materials.STAINLESS_STEEL + Names.Forms.HOE);
        GameRegistry.registerItem(steelHoe, Names.Materials.STEEL + Names.Forms.HOE);
        GameRegistry.registerItem(titaniumHoe, Names.Materials.TITANIUM + Names.Forms.HOE);

        //Pickaxes
        GameRegistry.registerItem(brassPickaxe, Names.Materials.BRASS + Names.Forms.PICKAXE);
        GameRegistry.registerItem(bronzePickaxe, Names.Materials.BRONZE + Names.Forms.PICKAXE);
        GameRegistry.registerItem(copperPickaxe, Names.Materials.COPPER + Names.Forms.PICKAXE);
        GameRegistry.registerItem(silverPickaxe, Names.Materials.SILVER + Names.Forms.PICKAXE);
        GameRegistry.registerItem(stainlessSteelPickaxe, Names.Materials.STAINLESS_STEEL + Names.Forms.PICKAXE);
        GameRegistry.registerItem(steelPickaxe, Names.Materials.STEEL + Names.Forms.PICKAXE);
        GameRegistry.registerItem(titaniumPickaxe, Names.Materials.TITANIUM + Names.Forms.PICKAXE);

        //Shovels
        GameRegistry.registerItem(brassShovel, Names.Materials.BRASS + Names.Forms.SHOVEL);
        GameRegistry.registerItem(bronzeShovel, Names.Materials.BRONZE + Names.Forms.SHOVEL);
        GameRegistry.registerItem(copperShovel, Names.Materials.COPPER + Names.Forms.SHOVEL);
        GameRegistry.registerItem(silverShovel, Names.Materials.SILVER + Names.Forms.SHOVEL);
        GameRegistry.registerItem(stainlessSteelShovel, Names.Materials.STAINLESS_STEEL + Names.Forms.SHOVEL);
        GameRegistry.registerItem(steelShovel, Names.Materials.STEEL + Names.Forms.SHOVEL);
        GameRegistry.registerItem(titaniumShovel, Names.Materials.TITANIUM + Names.Forms.SHOVEL);

        //Swords
        GameRegistry.registerItem(brassSword, Names.Materials.BRASS + Names.Forms.SWORD);
        GameRegistry.registerItem(bronzeSword, Names.Materials.BRONZE + Names.Forms.SWORD);
        GameRegistry.registerItem(copperSword, Names.Materials.COPPER + Names.Forms.SWORD);
        GameRegistry.registerItem(silverSword, Names.Materials.SILVER + Names.Forms.SWORD);
        GameRegistry.registerItem(stainlessSteelSword, Names.Materials.STAINLESS_STEEL + Names.Forms.SWORD);
        GameRegistry.registerItem(steelSword, Names.Materials.STEEL + Names.Forms.SWORD);
        GameRegistry.registerItem(titaniumSword, Names.Materials.TITANIUM + Names.Forms.SWORD);

    //Tool Parts
        //Misc
        GameRegistry.registerItem(woodToolHandle, Names.Materials.WOOD + Names.Forms.TOOL + Names.Types.HANDLE);

        //Axes
        GameRegistry.registerItem(brassAxeHead, Names.Materials.BRASS + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(bronzeAxeHead, Names.Materials.BRONZE + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(copperAxeHead, Names.Materials.COPPER + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(diamondAxeHead, Names.Materials.DIAMOND + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(goldAxeHead, Names.Materials.GOLD + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(ironAxeHead, Names.Materials.IRON + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(silverAxeHead, Names.Materials.SILVER + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(stainlessSteelAxeHead, Names.Materials.STAINLESS_STEEL + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(steelAxeHead, Names.Materials.STEEL + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(stoneAxeHead, Names.Forms.STONE + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(titaniumAxeHead, Names.Materials.TITANIUM + Names.Forms.AXE + Names.Types.HEAD);
        GameRegistry.registerItem(woodAxeHead, Names.Materials.WOOD + Names.Forms.AXE + Names.Forms.AXE + Names.Types.HEAD);

        //Hoes
        GameRegistry.registerItem(brassHoeHead, Names.Materials.BRASS + Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(bronzeHoeHead, Names.Materials.BRONZE+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(copperHoeHead, Names.Materials.COPPER + Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(diamondHoeHead, Names.Materials.DIAMOND+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(goldHoeHead, Names.Materials.GOLD+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(ironHoeHead, Names.Materials.IRON+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(silverHoeHead, Names.Materials.SILVER+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(stainlessSteelHoeHead, Names.Materials.STAINLESS_STEEL+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(steelHoeHead, Names.Materials.STEEL+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(stoneHoeHead, Names.Forms.STONE+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(titaniumHoeHead, Names.Materials.TITANIUM+ Names.Forms.HOE + Names.Types.HEAD);
        GameRegistry.registerItem(woodHoeHead, Names.Materials.WOOD+ Names.Forms.HOE + Names.Types.HEAD);

        //Pickaxes
        GameRegistry.registerItem(brassPickaxeHead, Names.Materials.BRASS + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(bronzePickaxeHead, Names.Materials.BRONZE + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(copperPickaxeHead, Names.Materials.COPPER + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(diamondPickaxeHead, Names.Materials.DIAMOND + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(goldPickaxeHead, Names.Materials.GOLD + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(ironPickaxeHead, Names.Materials.IRON + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(silverPickaxeHead, Names.Materials.SILVER + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(stainlessSteelPickaxeHead, Names.Materials.STAINLESS_STEEL + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(steelPickaxeHead, Names.Materials.STEEL + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(stonePickaxeHead, Names.Forms.STONE + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(titaniumPickaxeHead, Names.Materials.TITANIUM + Names.Forms.PICKAXE + Names.Types.HEAD);
        GameRegistry.registerItem(woodPickaxeHead, Names.Materials.WOOD + Names.Forms.PICKAXE + Names.Types.HEAD);

        //Shovels
        GameRegistry.registerItem(brassShovelHead, Names.Materials.BRASS + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(bronzeShovelHead, Names.Materials.BRONZE + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(copperShovelHead, Names.Materials.COPPER + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(diamondShovelHead, Names.Materials.DIAMOND + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(goldShovelHead, Names.Materials.GOLD + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(ironShovelHead, Names.Materials.IRON + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(silverShovelHead, Names.Materials.SILVER + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(stainlessSteelShovelHead, Names.Materials.STAINLESS_STEEL + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(steelShovelHead, Names.Materials.STEEL + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(stoneShovelHead, Names.Forms.STONE + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(titaniumShovelHead, Names.Materials.TITANIUM + Names.Forms.SHOVEL + Names.Types.HEAD);
        GameRegistry.registerItem(woodShovelHead, Names.Materials.WOOD + Names.Forms.SHOVEL + Names.Types.HEAD);

        //Swords
        GameRegistry.registerItem(brassSwordBlade, Names.Materials.BRASS + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(bronzeSwordBlade, Names.Materials.BRONZE + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(copperSwordBlade, Names.Materials.COPPER + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(diamondSwordBlade, Names.Materials.DIAMOND + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(goldSwordBlade, Names.Materials.GOLD + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(ironSwordBlade, Names.Materials.IRON + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(silverSwordBlade, Names.Materials.SILVER + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(stainlessSteelSwordBlade, Names.Materials.STAINLESS_STEEL + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(steelSwordBlade, Names.Materials.STEEL + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(stoneSwordBlade, Names.Forms.STONE + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(titaniumSwordBlade, Names.Materials.TITANIUM + Names.Forms.SWORD + Names.Types.BLADE);
        GameRegistry.registerItem(woodSwordBlade, Names.Materials.WOOD + Names.Forms.SWORD + Names.Types.BLADE);

        //Tool Casts
        GameRegistry.registerItem(axeCast, Names.Forms.AXE + Names.Types.CAST);
        GameRegistry.registerItem(hoeCast, Names.Forms.HOE + Names.Types.CAST);
        GameRegistry.registerItem(pickaxeCast, Names.Forms.PICKAXE + Names.Types.CAST);
        GameRegistry.registerItem(shovelCast, Names.Forms.SHOVEL + Names.Types.CAST);
        GameRegistry.registerItem(swordCast, Names.Forms.SWORD + Names.Types.CAST);
    }
}
