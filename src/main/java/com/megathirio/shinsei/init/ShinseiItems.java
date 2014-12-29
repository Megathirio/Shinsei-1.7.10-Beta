package com.megathirio.shinsei.init;

import com.megathirio.shinsei.item.*;
import com.megathirio.shinsei.item.food.*;
import com.megathirio.shinsei.item.fuel.ItemCokeNugget;
import com.megathirio.shinsei.item.fuel.ItemWoodSplit;
import com.megathirio.shinsei.item.gem.*;
import com.megathirio.shinsei.item.nugget.*;
import com.megathirio.shinsei.item.powder.*;
import com.megathirio.shinsei.item.ingot.*;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBucket;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiItems {

//Item Variables

    //Gems/Crystals
    public static ItemShinsei amethystGem = new ItemAmethystGem();
    public static ItemShinsei apatiteCrystal = new ItemApatiteCrystal();
    public static ItemShinsei aquamarineGem = new ItemAquamarineGem();
    public static ItemShinsei fluoriteCrystal = new ItemFluoriteCrystal();
    public static ItemShinsei jadeGem = new ItemJadeGem();
    public static ItemShinsei onyxGem = new ItemOnyxGem();
    public static ItemShinsei opalGem = new ItemOpalGem();
    public static ItemShinsei peridotGem = new ItemPeridotGem();
    public static ItemShinsei rubyGem = new ItemRubyGem();
    public static ItemShinsei scarletEmeraldGem = new ItemScarletEmeraldGem();
    public static ItemShinsei sapphireGem = new ItemSapphireGem();
    public static ItemShinsei topazGem = new ItemTopazGem();
    public static ItemShinsei turquoiseGem = new ItemTurquoiseGem();

    // Ingots
    public static ItemShinsei aluminumIngot = new ItemAluminumIngot();
    public static ItemShinsei antimonyIngot = new ItemAntimonyIngot();
    public static ItemShinsei bariumIngot = new ItemBariumIngot();
    public static ItemShinsei bismuthIngot = new ItemBismuthIngot();
    public static ItemShinsei brassIngot = new ItemBrassIngot();
    public static ItemShinsei bronzeIngot = new ItemBronzeIngot();
    public static ItemShinsei chromiumIngot = new ItemChromiumIngot();
    public static ItemShinsei cobaltIngot = new ItemCobaltIngot();
    public static ItemShinsei copperIngot = new ItemCopperIngot();
    public static ItemShinsei graphiteBrick = new ItemGraphiteBrick();
    public static ItemShinsei indiumIngot = new ItemIndiumIngot();
    public static ItemShinsei iridiumIngot = new ItemIridiumIngot();
    public static ItemShinsei leadIngot = new ItemLeadIngot();
    public static ItemShinsei magnesiumIngot = new ItemMagnesiumIngot();
    public static ItemShinsei manganeseIngot = new ItemManganeseIngot();
    public static ItemShinsei molybdenumIngot = new ItemMolybdenumIngot();
    public static ItemShinsei nickelIngot = new ItemNickelIngot();
    public static ItemShinsei platinumIngot = new ItemPlatinumIngot();
    public static ItemShinsei pigIronIngot = new ItemPigIronIngot();
    public static ItemShinsei silverIngot = new ItemSilverIngot();
    public static ItemShinsei stainlessSteelIngot = new ItemStainlessSteelIngot();
    public static ItemShinsei steelIngot = new ItemSteelIngot();
    public static ItemShinsei tantalumIngot = new ItemTantalumIngot();
    public static ItemShinsei tinIngot = new ItemTinIngot();
    public static ItemShinsei titaniumIngot = new ItemTitaniumIngot();
    public static ItemShinsei tungstenIngot = new ItemTungstenIngot();
    public static ItemShinsei vanadiumIngot = new ItemVanadiumIngot();
    public static ItemShinsei zincIngot = new ItemZincIngot();

    //Nuggets
    public static ItemShinsei aluminumNugget = new ItemAluminumNugget();
    public static ItemShinsei antimonyNugget = new ItemAntimonyNugget();
    public static ItemShinsei bariumNugget = new ItemBariumNugget();
    public static ItemShinsei bismuthNugget = new ItemBismuthNugget();
    public static ItemShinsei brassNugget = new ItemBrassNugget();
    public static ItemShinsei bronzeNugget = new ItemBronzeNugget();
    public static ItemShinsei chromiumNugget = new ItemChromiumNugget();
    public static ItemShinsei cobaltNugget = new ItemCobaltNugget();
    public static ItemShinsei copperNugget = new ItemCopperNugget();
    public static ItemShinsei indiumNugget = new ItemIndiumNugget();
    public static ItemShinsei iridiumNugget = new ItemIridiumNugget();
    public static ItemShinsei ironNugget = new ItemIronNugget();
    public static ItemShinsei leadNugget = new ItemLeadNugget();
    public static ItemShinsei magnesiumNugget = new ItemMagnesiumNugget();
    public static ItemShinsei manganeseNugget = new ItemManganeseNugget();
    public static ItemShinsei molybdenumNugget = new ItemMolybdenumNugget();
    public static ItemShinsei nickelNugget = new ItemNickelNugget();
    public static ItemShinsei platinumNugget = new ItemPlatinumNugget();
    public static ItemShinsei silverNugget = new ItemSilverNugget();
    public static ItemShinsei stainlessSteelNugget = new ItemStainlessSteelNugget();
    public static ItemShinsei steelNugget = new ItemSteelNugget();
    public static ItemShinsei tantalumNugget = new ItemTantalumNugget();
    public static ItemShinsei tinNugget = new ItemTinNugget();
    public static ItemShinsei titaniumNugget = new ItemTitaniumNugget();
    public static ItemShinsei tungstenNugget = new ItemTungstenNugget();
    public static ItemShinsei vanadiumNugget = new ItemVanadiumNugget();
    public static ItemShinsei zincNugget = new ItemZincNugget();

    //Powders - Metals
    public static ItemShinsei aluminumPowder = new ItemAluminumPowder();
    public static ItemShinsei antimonyPowder = new ItemAntimonyPowder();
    public static FoodShinsei arsenicPowder = new ItemArsenicPowder();
    public static ItemShinsei bismuthPowder = new ItemBismuthPowder();
    public static ItemShinsei bariumPowder = new ItemBariumPowder();
    public static ItemShinsei brassPowder = new ItemBrassPowder();
    public static ItemShinsei bronzePowder = new ItemBronzePowder();
    public static ItemShinsei chromiumPowder = new ItemChromiumPowder();
    public static ItemShinsei cinnabarPowder = new ItemCinnabarPowder();
    public static ItemShinsei cobaltPowder = new ItemCobaltPowder();
    public static ItemShinsei copperPowder = new ItemCopperPowder();
    public static ItemShinsei cryolitePowder = new ItemCryolitePowder();
    public static ItemShinsei dolomitePowder = new ItemDolomitePowder();
    public static ItemShinsei goldPowder = new ItemGoldPowder();
    public static ItemShinsei graphitePowder = new ItemGraphitePowder();
    public static ItemShinsei indiumPowder = new ItemIndiumPowder();
    public static ItemShinsei iridiumPowder = new ItemIridiumPowder();
    public static ItemShinsei ironPowder = new ItemIronPowder();
    public static ItemShinsei leadPowder = new ItemLeadPowder();
    public static ItemShinsei magnesiumPowder = new ItemMagnesiumPowder();
    public static ItemShinsei manganesePowder = new ItemManganesePowder();
    public static ItemShinsei molybdenumPowder = new ItemMolybdenumPowder();
    public static ItemShinsei nickelPowder = new ItemNickelPowder();
    public static ItemShinsei platinumPowder = new ItemPlatinumPowder();
    public static ItemShinsei silverPowder = new ItemSilverPowder();
    public static ItemShinsei stainlessSteelPowder = new ItemStainlessSteelPowder();
    public static ItemShinsei steelPowder = new ItemSteelPowder();
    public static ItemShinsei tantalumPowder = new ItemTantalumPowder();
    public static ItemShinsei tinPowder = new ItemTinPowder();
    public static ItemShinsei titaniumPowder = new ItemTitaniumPowder();
    public static ItemShinsei tungstenPowder = new ItemTungstenPowder();
    public static ItemShinsei vanadiumPowder = new ItemVanadiumPowder();
    public static ItemShinsei zincPowder = new ItemZincPowder();

    //Powders - Gems/Crystals
    public static ItemShinsei amethystPowder = new ItemAmethystPowder();
    public static ItemShinsei chargedAmethystPowder = new ItemChargedAmethystPowder();
    public static ItemShinsei infusedAmethystPowder = new ItemInfusedAmethystPowder();
    public static ItemShinsei apatitePowder = new ItemApatitePowder();
    public static ItemShinsei chargedApatitePowder = new ItemChargedApatitePowder();
    public static ItemShinsei infusedApatitePowder = new ItemInfusedApatitePowder();
    public static ItemShinsei aquamarinePowder = new ItemAquamarinePowder();
    public static ItemShinsei chargedAquamarinePowder = new ItemChargedAquamarinePowder();
    public static ItemShinsei infusedAquamarinePowder = new ItemInfusedAquamarinePowder();
    public static ItemShinsei diamondPowder = new ItemDiamondPowder();
    public static ItemShinsei chargedDiamondPowder = new ItemChargedDiamondPowder();
    public static ItemShinsei infusedDiamondPowder = new ItemInfusedDiamondPowder();
    public static ItemShinsei emeraldPowder = new ItemEmeraldPowder();
    public static ItemShinsei chargedEmeraldPowder = new ItemChargedEmeraldPowder();
    public static ItemShinsei infusedEmeraldPowder = new ItemInfusedEmeraldPowder();
    public static ItemShinsei fluoritePowder = new ItemFluoritePowder();
    public static ItemShinsei chargedFluoritePowder = new ItemChargedFluoritePowder();
    public static ItemShinsei infusedFluoritePowder = new ItemInfusedFluoritePowder();
    public static ItemShinsei jadePowder = new ItemJadePowder();
    public static ItemShinsei chargedJadePowder = new ItemChargedJadePowder();
    public static ItemShinsei infusedJadePowder = new ItemInfusedJadePowder();
    public static ItemShinsei onyxPowder = new ItemOnyxPowder();
    public static ItemShinsei chargedOnyxPowder = new ItemChargedOnyxPowder();
    public static ItemShinsei infusedOnyxPowder = new ItemInfusedOnyxPowder();
    public static ItemShinsei opalPowder = new ItemOpalPowder();
    public static ItemShinsei chargedOpalPowder = new ItemChargedOpalPowder();
    public static ItemShinsei infusedOpalPowder = new ItemInfusedOpalPowder();
    public static ItemShinsei peridotPowder = new ItemPeridotPowder();
    public static ItemShinsei chargedPeridotPowder = new ItemChargedPeridotPowder();
    public static ItemShinsei infusedPeridotPowder = new ItemInfusedPeridotPowder();
    public static ItemShinsei rubyPowder = new ItemRubyPowder();
    public static ItemShinsei chargedRubyPowder = new ItemChargedRubyPowder();
    public static ItemShinsei infusedRubyPowder = new ItemInfusedRubyPowder();
    public static ItemShinsei sapphirePowder = new ItemSapphirePowder();
    public static ItemShinsei chargedSapphirePowder = new ItemChargedSapphirePowder();
    public static ItemShinsei infusedSapphirePowder = new ItemInfusedSapphirePowder();
    public static ItemShinsei scarletEmeraldPowder = new ItemScarletEmeraldPowder();
    public static ItemShinsei chargedScarletEmeraldPowder = new ItemChargedScarletEmeraldPowder();
    public static ItemShinsei infusedScarletEmeraldPowder = new ItemInfusedScarletEmeraldPowder();
    public static ItemShinsei topazPowder = new ItemTopazPowder();
    public static ItemShinsei chargedTopazPowder = new ItemChargedTopazPowder();
    public static ItemShinsei infusedTopazPowder = new ItemInfusedTopazPowder();
    public static ItemShinsei turquoisePowder = new ItemTurquoisePowder();
    public static ItemShinsei chargedTurquoisePowder = new ItemChargedTurquoisePowder();
    public static ItemShinsei infusedTurquoisePowder = new ItemInfusedTurquoisePowder();

    //Powders - Minerals
    public static ItemShinsei boraxPowder = new ItemBoraxPowder();
    public static ItemShinsei chalkPowder = new ItemChalkPowder();
    public static ItemShinsei calciumPowder = new ItemCalciumPowder();
    public static ItemShinsei calciumChloridePowder = new ItemCalciumChloridePowder();
    public static FoodShinsei carbonActivated = new ItemCarbonActivated();
    public static ItemShinsei gypsumPowder = new ItemGypsumPowder();
    public static ItemShinsei quicklime = new ItemQuicklimePowder();
    public static ItemShinsei salt = new ItemSaltPowder();
    public static ItemShinsei silt = new ItemSiltPowder();
    public static ItemShinsei sulphur = new ItemSulphurPowder();

    //Powders - Misc
    public static ItemShinsei causticPotash = new ItemCausticPotash();
    public static ItemShinsei ferrosiliconPowder = new ItemFerrosiliconPowder();
    public static ItemShinsei potashPowder = new ItemPotashPowder();
    public static ItemShinsei uraniumPowder = new ItemUraniumPowder();
    public static ItemShinsei yellowcakePowder = new ItemYellowcakePowder();

    //Fuels
    public static ItemShinsei splitWood = new ItemWoodSplit();
    public static ItemShinsei coke = new ItemCokeNugget();

    //Foods
    public static FoodShinsei beefCured = new ItemBeefCured();
    public static FoodShinsei porkCured = new ItemPorkCured();

    //Foods - Poisoned
    public static FoodShinsei applePoisoned = new ItemApplePoisoned();
    public static FoodShinsei beefPoisoned = new ItemBeefPoisoned();
    public static FoodShinsei breadPoisoned = new ItemBreadPoisoned();
    public static FoodShinsei carrotPoisoned = new ItemCarrotPoisoned();
    public static FoodShinsei chickenPoisoned = new ItemChickenPoisoned();
    public static FoodShinsei cookiePoisoned = new ItemCookiePoisoned();
    public static FoodShinsei fishCodPoisoned = new ItemFishCodPoisoned();
    public static FoodShinsei fishSalmonPoisoned = new ItemFishSalmonPoisoned();
    public static FoodShinsei melonPoisoned = new ItemMelonPoisoned();
    public static FoodShinsei milkPoisoned = new ItemMilkPoisoned();
    public static FoodShinsei piePoisoned = new ItemPiePoisoned();
    public static FoodShinsei porkPoisoned = new ItemPorkPoisoned();

//    public static ItemBucket pewterCup = new ItemPewterCup();

    //General
    public static ItemShinsei copperHeatPlate = new ItemCopperPlateHeat();
    public static ItemShinsei ironHeatPlate = new ItemIronPlateHeat();

    //Item Initialization
	public static void init(){
		
	//Item Initialzation
//        GameRegistry.registerItem(pewterCup, "pewterCup");

        //Gems/Crystals
        GameRegistry.registerItem(amethystGem, Names.Materials.AMETHYST + Names.Forms.NUGGET);
        GameRegistry.registerItem(apatiteCrystal, Names.Materials.APATITE + Names.Forms.NUGGET);
        GameRegistry.registerItem(aquamarineGem, Names.Materials.AQUAMARINE + Names.Forms.NUGGET);
        GameRegistry.registerItem(fluoriteCrystal, Names.Materials.FLUORITE + Names.Forms.NUGGET);
        GameRegistry.registerItem(jadeGem, Names.Materials.JADE + Names.Forms.NUGGET);
        GameRegistry.registerItem(onyxGem, Names.Materials.ONYX + Names.Forms.NUGGET);
        GameRegistry.registerItem(opalGem, Names.Materials.OPAL + Names.Forms.NUGGET);
        GameRegistry.registerItem(peridotGem, Names.Materials.PERIDOT + Names.Forms.NUGGET);
        GameRegistry.registerItem(rubyGem, Names.Materials.RUBY + Names.Forms.NUGGET);
        GameRegistry.registerItem(scarletEmeraldGem, Names.Materials.SCARLET_EMERALD + Names.Forms.NUGGET);
        GameRegistry.registerItem(sapphireGem, Names.Materials.SAPPHIRE + Names.Forms.NUGGET);
        GameRegistry.registerItem(topazGem, Names.Materials.TOPAZ + Names.Forms.NUGGET);
        GameRegistry.registerItem(turquoiseGem, Names.Materials.TURQUOISE + Names.Forms.NUGGET);

        //Ingots
        GameRegistry.registerItem(aluminumIngot, Names.Materials.ALUMINUM + Names.Forms.INGOT);
        GameRegistry.registerItem(antimonyIngot, Names.Materials.ANTIMONY + Names.Forms.INGOT);
        GameRegistry.registerItem(bariumIngot, Names.Materials.BARIUM + Names.Forms.INGOT);
        GameRegistry.registerItem(bismuthIngot, Names.Materials.BISMUTH + Names.Forms.INGOT);
        GameRegistry.registerItem(brassIngot, Names.Materials.BRASS + Names.Forms.INGOT);
        GameRegistry.registerItem(bronzeIngot, Names.Materials.BRONZE + Names.Forms.INGOT);
        GameRegistry.registerItem(chromiumIngot, Names.Materials.CHROMIUM + Names.Forms.INGOT);
        GameRegistry.registerItem(cobaltIngot, Names.Materials.COBALT + Names.Forms.INGOT);
        GameRegistry.registerItem(copperIngot, Names.Materials.COPPER + Names.Forms.INGOT);
        GameRegistry.registerItem(graphiteBrick, Names.Materials.GRAPHITE + Names.Materials.BRICK);
        GameRegistry.registerItem(indiumIngot, Names.Materials.INDIUM + Names.Forms.INGOT);
        GameRegistry.registerItem(iridiumIngot, Names.Materials.IRIDIUM + Names.Forms.INGOT);
        GameRegistry.registerItem(leadIngot, Names.Materials.LEAD + Names.Forms.INGOT);
        GameRegistry.registerItem(magnesiumIngot, Names.Materials.MAGNESIUM + Names.Forms.INGOT);
        GameRegistry.registerItem(manganeseIngot, Names.Materials.MANGANESE + Names.Forms.INGOT);
        GameRegistry.registerItem(molybdenumIngot, Names.Materials.MOLYBDENUM + Names.Forms.INGOT);
        GameRegistry.registerItem(nickelIngot, Names.Materials.NICKEL + Names.Forms.INGOT);
        GameRegistry.registerItem(pigIronIngot, Names.Materials.PIG_IRON + Names.Forms.INGOT);
        GameRegistry.registerItem(platinumIngot, Names.Materials.PLATINUM + Names.Forms.INGOT);
        GameRegistry.registerItem(silverIngot, Names.Materials.SILVER + Names.Forms.INGOT);
        GameRegistry.registerItem(stainlessSteelIngot, Names.Materials.STAINLESS_STEEL + Names.Forms.INGOT);
        GameRegistry.registerItem(steelIngot, Names.Materials.STEEL + Names.Forms.INGOT);
        GameRegistry.registerItem(tantalumIngot, Names.Materials.TANTALUM + Names.Forms.INGOT);
        GameRegistry.registerItem(tinIngot, Names.Materials.TIN + Names.Forms.INGOT);
        GameRegistry.registerItem(titaniumIngot, Names.Materials.TITANIUM + Names.Forms.INGOT);
        GameRegistry.registerItem(tungstenIngot, Names.Materials.TUNGSTEN + Names.Forms.INGOT);
        GameRegistry.registerItem(vanadiumIngot, Names.Materials.VANADIUM + Names.Forms.INGOT);
        GameRegistry.registerItem(zincIngot, Names.Materials.ZINC + Names.Forms.INGOT);

        //Nuggets
        GameRegistry.registerItem(aluminumNugget, Names.Materials.ALUMINUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(antimonyNugget, Names.Materials.ANTIMONY + Names.Forms.NUGGET);
        GameRegistry.registerItem(bariumNugget, Names.Materials.BARIUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(bismuthNugget, Names.Materials.BISMUTH + Names.Forms.NUGGET);
        GameRegistry.registerItem(brassNugget, Names.Materials.BRASS + Names.Forms.NUGGET);
        GameRegistry.registerItem(bronzeNugget, Names.Materials.BRONZE + Names.Forms.NUGGET);
        GameRegistry.registerItem(chromiumNugget, Names.Materials.CHROMIUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(cobaltNugget, Names.Materials.COBALT + Names.Forms.NUGGET);
        GameRegistry.registerItem(copperNugget, Names.Materials.COPPER + Names.Forms.NUGGET);
        GameRegistry.registerItem(indiumNugget, Names.Materials.INDIUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(iridiumNugget, Names.Materials.IRIDIUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(ironNugget, Names.Materials.IRON + Names.Forms.NUGGET);
        GameRegistry.registerItem(leadNugget, Names.Materials.LEAD + Names.Forms.NUGGET);
        GameRegistry.registerItem(magnesiumNugget, Names.Materials.MAGNESIUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(manganeseNugget, Names.Materials.MANGANESE + Names.Forms.NUGGET);
        GameRegistry.registerItem(molybdenumNugget, Names.Materials.MOLYBDENUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(nickelNugget, Names.Materials.NICKEL + Names.Forms.NUGGET);
        GameRegistry.registerItem(platinumNugget, Names.Materials.PLATINUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(silverNugget, Names.Materials.SILVER + Names.Forms.NUGGET);
        GameRegistry.registerItem(stainlessSteelNugget, Names.Materials.STAINLESS_STEEL + Names.Forms.NUGGET);
        GameRegistry.registerItem(steelNugget, Names.Materials.STEEL + Names.Forms.NUGGET);
        GameRegistry.registerItem(tinNugget, Names.Materials.TIN + Names.Forms.NUGGET);
        GameRegistry.registerItem(tantalumNugget, Names.Materials.TANTALUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(titaniumNugget, Names.Materials.TITANIUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(tungstenNugget, Names.Materials.TUNGSTEN + Names.Forms.NUGGET);
        GameRegistry.registerItem(vanadiumNugget, Names.Materials.VANADIUM + Names.Forms.NUGGET);
        GameRegistry.registerItem(zincNugget, Names.Materials.ZINC + Names.Forms.NUGGET);

        //Powders - Metals
        GameRegistry.registerItem(aluminumPowder, Names.Materials.ALUMINUM + Names.Forms.POWDER);
        GameRegistry.registerItem(antimonyPowder, Names.Materials.ANTIMONY + Names.Forms.POWDER);
        GameRegistry.registerItem(arsenicPowder, Names.Materials.ARSENIC + Names.Forms.POWDER);
        GameRegistry.registerItem(bariumPowder, Names.Materials.BARIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(bismuthPowder, Names.Materials.BISMUTH + Names.Forms.POWDER);
        GameRegistry.registerItem(brassPowder, Names.Materials.BRASS + Names.Forms.POWDER);
        GameRegistry.registerItem(bronzePowder, Names.Materials.BRONZE + Names.Forms.POWDER);
        GameRegistry.registerItem(chromiumPowder, Names.Materials.CHROMIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(cinnabarPowder, Names.Materials.CINNABAR + Names.Forms.POWDER);
        GameRegistry.registerItem(cobaltPowder, Names.Materials.COBALT + Names.Forms.POWDER);
        GameRegistry.registerItem(copperPowder, Names.Materials.COPPER + Names.Forms.POWDER);
        GameRegistry.registerItem(cryolitePowder, Names.Materials.CRYOLITE + Names.Forms.POWDER);
        GameRegistry.registerItem(dolomitePowder, Names.Materials.DOLOMITE + Names.Forms.POWDER);
        GameRegistry.registerItem(goldPowder, Names.Materials.GOLD + Names.Forms.POWDER);
        GameRegistry.registerItem(graphitePowder, Names.Materials.GRAPHITE + Names.Forms.POWDER);
        GameRegistry.registerItem(indiumPowder, Names.Materials.INDIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(iridiumPowder, Names.Materials.IRIDIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(ironPowder, Names.Materials.IRON + Names.Forms.POWDER);
        GameRegistry.registerItem(leadPowder, Names.Materials.LEAD + Names.Forms.POWDER);
        GameRegistry.registerItem(magnesiumPowder, Names.Materials.MAGNESIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(manganesePowder, Names.Materials.MANGANESE + Names.Forms.POWDER);
        GameRegistry.registerItem(molybdenumPowder, Names.Materials.MOLYBDENUM + Names.Forms.POWDER);
        GameRegistry.registerItem(nickelPowder, Names.Materials.NICKEL + Names.Forms.POWDER);
        GameRegistry.registerItem(platinumPowder, Names.Materials.PLATINUM + Names.Forms.POWDER);
        GameRegistry.registerItem(silverPowder, Names.Materials.SILVER + Names.Forms.POWDER);
        GameRegistry.registerItem(stainlessSteelPowder, Names.Materials.STAINLESS_STEEL + Names.Forms.POWDER);
        GameRegistry.registerItem(steelPowder, Names.Materials.STEEL + Names.Forms.POWDER);
        GameRegistry.registerItem(tantalumPowder, Names.Materials.TANTALUM + Names.Forms.POWDER);
        GameRegistry.registerItem(tinPowder, Names.Materials.TIN + Names.Forms.POWDER);
        GameRegistry.registerItem(titaniumPowder, Names.Materials.TITANIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(tungstenPowder, Names.Materials.TUNGSTEN + Names.Forms.POWDER);
        GameRegistry.registerItem(vanadiumPowder, Names.Materials.VANADIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(zincPowder, Names.Materials.ZINC + Names.Forms.POWDER);

        //Powders - Gems/Crystals
        GameRegistry.registerItem(amethystPowder, Names.Materials.AMETHYST + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedAmethystPowder, Names.Materials.AMETHYST + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedAmethystPowder, Names.Materials.AMETHYST + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(apatitePowder, Names.Materials.APATITE + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedApatitePowder, Names.Materials.APATITE + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedApatitePowder, Names.Materials.APATITE + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(aquamarinePowder, Names.Materials.AQUAMARINE + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedAquamarinePowder, Names.Materials.AQUAMARINE + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedAquamarinePowder, Names.Materials.AQUAMARINE + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(diamondPowder, Names.Materials.DIAMOND + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedDiamondPowder, Names.Materials.DIAMOND + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedDiamondPowder, Names.Materials.DIAMOND + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(emeraldPowder, Names.Materials.EMERALD + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedEmeraldPowder, Names.Materials.EMERALD + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedEmeraldPowder, Names.Materials.EMERALD + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(fluoritePowder, Names.Materials.FLUORITE + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedFluoritePowder, Names.Materials.FLUORITE + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedFluoritePowder, Names.Materials.FLUORITE + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(jadePowder, Names.Materials.JADE + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedJadePowder, Names.Materials.JADE + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedJadePowder, Names.Materials.JADE + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(onyxPowder, Names.Materials.ONYX + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedOnyxPowder, Names.Materials.ONYX + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedOnyxPowder, Names.Materials.ONYX + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(opalPowder, Names.Materials.OPAL + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedOpalPowder, Names.Materials.OPAL + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedOpalPowder, Names.Materials.OPAL + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(peridotPowder, Names.Materials.PERIDOT + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedPeridotPowder, Names.Materials.PERIDOT + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedPeridotPowder, Names.Materials.PERIDOT + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(rubyPowder, Names.Materials.RUBY + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedRubyPowder, Names.Materials.RUBY + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedRubyPowder, Names.Materials.RUBY + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(sapphirePowder, Names.Materials.SAPPHIRE + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedSapphirePowder, Names.Materials.SAPPHIRE + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedSapphirePowder, Names.Materials.SAPPHIRE + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(scarletEmeraldPowder, Names.Materials.SCARLET_EMERALD + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedScarletEmeraldPowder, Names.Materials.SCARLET_EMERALD + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedScarletEmeraldPowder, Names.Materials.SCARLET_EMERALD + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(topazPowder, Names.Materials.TOPAZ + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedTopazPowder, Names.Materials.TOPAZ + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedTopazPowder, Names.Materials.TOPAZ + Names.Forms.POWDER + Names.States.INFUSED);
        GameRegistry.registerItem(turquoisePowder, Names.Materials.TURQUOISE + Names.Forms.POWDER);
        GameRegistry.registerItem(chargedTurquoisePowder, Names.Materials.TURQUOISE + Names.Forms.POWDER + Names.States.CHARGED);
        GameRegistry.registerItem(infusedTurquoisePowder, Names.Materials.TURQUOISE + Names.Forms.POWDER + Names.States.INFUSED);

        //Powders - Minerals
        GameRegistry.registerItem(boraxPowder, Names.Materials.BORAX + Names.Forms.POWDER);
        GameRegistry.registerItem(chalkPowder, Names.Materials.CHALK + Names.Forms.POWDER);
        GameRegistry.registerItem(calciumPowder, Names.Materials.CALCIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(calciumChloridePowder, Names.Materials.CALCIUM_CHLORIDE + Names.Forms.POWDER);
        GameRegistry.registerItem(carbonActivated, Names.Materials.CARBON + Names.States.ACTIVATED);
        GameRegistry.registerItem(gypsumPowder, Names.Materials.GYPSUM + Names.Forms.POWDER);
        GameRegistry.registerItem(quicklime, Names.Materials.QUICKLIME + Names.Forms.POWDER);
        GameRegistry.registerItem(salt, Names.Materials.SALT + Names.Forms.POWDER);
        GameRegistry.registerItem(silt, Names.Materials.SILT + Names.Forms.POWDER);
        GameRegistry.registerItem(sulphur, Names.Materials.SULPHUR + Names.Forms.POWDER);

        //Powders - Misc
        GameRegistry.registerItem(causticPotash, Names.Materials.POTASH + Names.Forms.POWDER + Names.States.CAUSTIC);
        GameRegistry.registerItem(ferrosiliconPowder, Names.Materials.FERROSILICON + Names.Forms.POWDER);
        GameRegistry.registerItem(potashPowder, Names.Materials.POTASH + Names.Forms.POWDER);
        GameRegistry.registerItem(uraniumPowder, Names.Materials.URANIUM + Names.Forms.POWDER);
        GameRegistry.registerItem(yellowcakePowder, Names.Materials.YELLOWCAKE + Names.Forms.POWDER);

        //Fuels
        GameRegistry.registerItem(splitWood, Names.Materials.WOOD + Names.States.SPLIT);
        GameRegistry.registerItem(coke, Names.Materials.COKE + Names.Forms.POWDER);

        //Foods
        GameRegistry.registerItem(beefCured, Names.Foods.BEEF_CURED);
        GameRegistry.registerItem(porkCured, Names.Foods.PORK_CURED);

        //Foods - Poisoned
        GameRegistry.registerItem(applePoisoned, Names.Materials.APPLE);
        GameRegistry.registerItem(beefPoisoned, Names.Materials.BEEF + Names.States.POISONED);
        GameRegistry.registerItem(breadPoisoned, Names.Materials.BREAD);
        GameRegistry.registerItem(carrotPoisoned, Names.Materials.CARROT);
        GameRegistry.registerItem(chickenPoisoned, Names.Materials.CHICKEN + Names.States.POISONED);
        GameRegistry.registerItem(cookiePoisoned, Names.Materials.COOKIE);
        GameRegistry.registerItem(fishCodPoisoned, Names.Materials.FISH + Names.States.POISONED_COD + Names.States.POISONED);
        GameRegistry.registerItem(fishSalmonPoisoned, Names.Materials.FISH + Names.States.POISONED_SALMON + Names.States.POISONED);
        GameRegistry.registerItem(melonPoisoned, Names.Materials.MELON);
        GameRegistry.registerItem(milkPoisoned, Names.States.POISONED_BUCKET + Names.Materials.MILK);
        GameRegistry.registerItem(piePoisoned, Names.States.POISONED_PIE + Names.Materials.PIE);
        GameRegistry.registerItem(porkPoisoned, Names.Materials.PORK + Names.States.POISONED);

        //General
        GameRegistry.registerItem(copperHeatPlate, Names.Materials.COPPER + Names.Types.HEAT + Names.Forms.PLATE);
        GameRegistry.registerItem(ironHeatPlate, Names.Materials.IRON + Names.Types.HEAT + Names.Forms.PLATE);
	}
}
