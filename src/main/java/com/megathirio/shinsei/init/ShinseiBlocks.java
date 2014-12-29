package com.megathirio.shinsei.init;

import com.megathirio.shinsei.block.*;
import com.megathirio.shinsei.block.machine.BlockAnbiru;
import com.megathirio.shinsei.block.machine.BlockFanesu;
import com.megathirio.shinsei.block.mineral.*;
import com.megathirio.shinsei.block.deco.BlockMarble;
import com.megathirio.shinsei.block.ore.*;

import com.megathirio.shinsei.block.deco.*;
import com.megathirio.shinsei.item.*;
import com.megathirio.shinsei.reference.Names;
import com.megathirio.shinsei.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraftforge.fluids.BlockFluidClassic;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public final class ShinseiBlocks {

//Block Variables
	//Ores
    public static OreShinsei acanthiteOre = new BlockAcanthiteOre();
    public static OreShinsei amethystOre = new BlockAmethystOre();
    public static OreShinsei apatiteOre = new BlockApatiteOre();
	public static OreShinsei bariteOre = new BlockBariteOre();
    public static OreShinsei bauxiteOre = new BlockBauxiteOre();
    public static OreShinsei berylOre = new BlockBerylOre();
    public static OreShinsei bismuthOre = new BlockBismuthOre();
    public static OreShinsei borniteOre = new BlockBorniteOre();
    public static OreShinsei cassiteriteOre = new BlockCassiteriteOre();
    public static OreShinsei chalcedonyOre = new BlockChalcedonyOre();
    public static OreShinsei chalcopyriteOre = new BlockChalcopyriteOre();
    public static OreShinsei chromiteOre = new BlockChromiteOre();
    public static OreShinsei cinnabarOre = new BlockCinnabarOre();
    public static OreShinsei cobaltiteOre = new BlockCobaltiteOre();
    public static OreShinsei corundumOre = new BlockCorundumOre();
    public static OreShinsei cryoliteOre = new BlockCryoliteOre();
    public static OreShinsei dolomiteOre = new BlockDolomiteOre();
    public static OreShinsei fluoriteOre = new BlockFluoriteOre();
    public static OreShinsei galenaOre = new BlockGalenaOre();
    public static OreShinsei graphiteOre = new BlockGraphiteOre();
    public static OreShinsei hematiteOre = new BlockHematiteOre();
    public static OreShinsei ilmeniteOre = new BlockIlmeniteOre();
    public static OreShinsei jadeiteOre = new BlockJadeiteOre();
    public static OreShinsei meteoriteOre = new BlockMeteoriteOre();
    public static OreShinsei molybdeniteOre = new BlockMolybdeniteOre();
    public static OreShinsei olivineOre = new BlockOlivineOre();
    public static OreShinsei opalOre = new BlockOpalOre();
    public static OreShinsei pentlanditeOre = new BlockPentlanditeOre();
    public static OreShinsei pyrolusiteOre = new BlockPyrolusiteOre();
    public static OreShinsei realgarOre = new BlockRealgarOre();
    public static OreShinsei rutileOre = new BlockRutileOre();
    public static OreShinsei scheeliteOre = new BlockScheeliteOre();
    public static OreShinsei sperryliteOre = new BlockSperryliteOre();
    public static OreShinsei sphaleriteOre = new BlockSphaleriteOre();
    public static OreShinsei stibniteOre = new BlockStibniteOre();
    public static OreShinsei sulphurOre = new BlockSulphurOre();
    public static OreShinsei sylviteOre = new BlockSylviteOre();
    public static OreShinsei tantaliteOre = new BlockTantaliteOre();
    public static OreShinsei topazOre = new BlockTopazOre();
    public static OreShinsei turquoiseOre = new BlockTurquoiseOre();
    public static OreShinsei uraniniteOre = new BlockUraniniteOre();

    public static OreShinsei woodCrateCache = new BlockWoodCrateCache();

    //Metals
    public static BlockShinsei aluminumBlock = new BlockAluminumBlock();
    public static BlockShinsei antimonyBlock = new BlockAntimonyBlock();
    public static BlockShinsei bariumBlock = new BlockBariumBlock();
    public static BlockShinsei bismuthBlock = new BlockBismuthBlock();
    public static BlockShinsei brassBlock = new BlockBrassBlock();
    public static BlockShinsei bronzeBlock = new BlockBronzeBlock();
    public static BlockShinsei chromiumBlock = new BlockChromiumBlock();
    public static BlockShinsei cobaltBlock = new BlockCobaltBlock();
    public static BlockShinsei copperBlock = new BlockCopperBlock();
    public static BlockShinsei leadBlock = new BlockLeadBlock();
    public static BlockShinsei magnesiumBlock = new BlockMagnesiumBlock();
    public static BlockShinsei manganeseBlock = new BlockManganeseBlock();
    public static BlockShinsei molybdenumBlock = new BlockMolybdenumBlock();
    public static BlockShinsei nickelBlock = new BlockNickelBlock();
    public static BlockShinsei platinumBlock = new BlockPlatinumBlock();
    public static BlockShinsei silverBlock = new BlockSilverBlock();
    public static BlockShinsei stainlessSteelBlock = new BlockStainlessSteelBlock();
    public static BlockShinsei steelBlock = new BlockSteelBlock();
    public static BlockShinsei tantalumBlock = new BlockTantalumBlock();
    public static BlockShinsei tinBlock = new BlockTinBlock();
    public static BlockShinsei titaniumBlock = new BlockTitaniumBlock();
    public static BlockShinsei tungstenBlock = new BlockTungstenBlock();
    public static BlockShinsei vanadiumBlock = new BlockVanadiumBlock();
    public static BlockShinsei zincBlock = new BlockZincBlock();

    //Gems/Crystals
    public static BlockShinsei amethystBlock = new BlockAmethystBlock();
    public static BlockShinsei apatiteBlock = new BlockApatiteBlock();
    public static BlockShinsei aquamarineBlock = new BlockAquamarineBlock();
    public static BlockShinsei fluoriteBlock = new BlockFluoriteBlock();
    public static BlockShinsei jadeBlock = new BlockJadeBlock();
    public static BlockShinsei opalBlock = new BlockOpalBlock();
    public static BlockShinsei onyxBlock = new BlockOnyxBlock();
    public static BlockShinsei peridotBlock = new BlockPeridotBlock();
    public static BlockShinsei rubyBlock = new BlockRubyBlock();
    public static BlockShinsei sapphireBlock = new BlockSapphireBlock();
    public static BlockShinsei scarletEmeraldBlock = new BlockScarletEmeraldBlock();
    public static BlockShinsei topazBlock = new BlockTopazBlock();
    public static BlockShinsei turquoiseBlock = new BlockTurquoiseBlock();

    //Minerals
    public static BlockShinsei chalkBlock = new BlockChalk();
    public static BlockShinsei basaltBlock = new BlockBasalt();
    public static BlockShinsei basaltCobble = new BlockBasaltCobble();
    public static BlockShinsei boraxBlock = new BlockBorax();
    public static BlockShinsei limestoneBlock = new BlockLimestone();
    public static BlockShinsei marbleBlock = new BlockMarble();
	public static BlockShinsei siltstoneBlock = new BlockSiltstone();
    public static BlockShinsei graniteBlock = new BlockGranite();
    public static BlockShinsei gypsumBlock = new BlockGypsum();
    public static BlockShinsei haliteBlock = new BlockHalite();

    //Deco
    public static BlockShinsei brickBlock = new BlockBrick();
    public static BlockShinsei sidingBlock = new BlockSiding();
    public static BlockShinsei stuccoBlock = new BlockStuccoBlock();
    public static BlockShinsei graphiteBricks = new BlockGraphiteBricks();

    //Deco - Lamps
    public static BlockShinsei amethystLampOn = new BlockAmethystLamp(true);
    public static BlockShinsei amethystLampOff = new BlockAmethystLamp(false);
    public static BlockShinsei apatiteLampOn = new BlockApatiteLamp(true);
    public static BlockShinsei apatiteLampOff = new BlockApatiteLamp(false);
    public static BlockShinsei aquamarineLampOn = new BlockAquamarineLamp(true);
    public static BlockShinsei aquamarineLampOff = new BlockAquamarineLamp(false);
    public static BlockShinsei diamondLampOn = new BlockDiamondLamp(true);
    public static BlockShinsei diamondLampOff = new BlockDiamondLamp(false);
    public static BlockShinsei emeraldLampOn = new BlockEmeraldLamp(true);
    public static BlockShinsei emeraldLampOff = new BlockEmeraldLamp(false);
    public static BlockShinsei fluoriteLampOn = new BlockFluoriteLamp(true);
    public static BlockShinsei fluoriteLampOff = new BlockFluoriteLamp(false);
    public static BlockShinsei jadeLampOn = new BlockJadeLamp(true);
    public static BlockShinsei jadeLampOff = new BlockJadeLamp(false);
    public static BlockShinsei onyxLampOn = new BlockOnyxLamp(true);
    public static BlockShinsei onyxLampOff = new BlockOnyxLamp(false);
    public static BlockShinsei opalLampOn = new BlockOpalLamp(true);
    public static BlockShinsei opalLampOff = new BlockOpalLamp(false);
    public static BlockShinsei peridotLampOn = new BlockPeridotLamp(true);
    public static BlockShinsei peridotLampOff = new BlockPeridotLamp(false);
    public static BlockShinsei rubyLampOn = new BlockRubyLamp(true);
    public static BlockShinsei rubyLampOff = new BlockRubyLamp(false);
    public static BlockShinsei sapphireLampOn = new BlockSapphireLamp(true);
    public static BlockShinsei sapphireLampOff = new BlockSapphireLamp(false);
    public static BlockShinsei scarletEmeraldLampOn = new BlockScarletEmeraldLamp(true);
    public static BlockShinsei scarletEmeraldLampOff = new BlockScarletEmeraldLamp(false);
    public static BlockShinsei topazLampOn = new BlockTopazLamp(true);
    public static BlockShinsei topazLampOff = new BlockTopazLamp(false);
    public static BlockShinsei turquoiseLampOn = new BlockTurquoiseLamp(true);
    public static BlockShinsei turquoiseLampOff = new BlockTurquoiseLamp(false);

    //Deco - Stones (Infused)
    public static BlockShinsei amethystStone = new BlockAmethystStone();
    public static BlockShinsei apatiteStone = new BlockApatiteStone();
    public static BlockShinsei aquamarineStone = new BlockAquamarineStone();
    public static BlockShinsei diamondStone = new BlockDiamondStone();
    public static BlockShinsei emeraldStone = new BlockEmeraldStone();
    public static BlockShinsei fluoriteStone = new BlockFluoriteStone();
    public static BlockShinsei jadeStone = new BlockJadeStone();
    public static BlockShinsei opalStone = new BlockOpalStone();
    public static BlockShinsei onyxStone = new BlockOnyxStone();
    public static BlockShinsei peridotStone = new BlockPeridotStone();
    public static BlockShinsei rubyStone = new BlockRubyStone();
    public static BlockShinsei sapphireStone = new BlockSapphireStone();
    public static BlockShinsei scarletEmeraldStone = new BlockScarletEmeraldStone();
    public static BlockShinsei topazStone = new BlockTopazStone();
    public static BlockShinsei turquoiseStone = new BlockTurquoiseStone();

    //Deco - Plates
    public static PlateShinsei aluminumPlate = new BlockAluminumPlate();
    public static PlateShinsei antimonyPlate = new BlockAntimonyPlate();
    public static PlateShinsei bariumPlate = new BlockBariumPlate();
    public static PlateShinsei bismuthPlate = new BlockBismuthPlate();
    public static PlateShinsei brassPlate = new BlockBrassPlate();
    public static PlateShinsei bronzePlate = new BlockBronzePlate();
    public static PlateShinsei chromiumPlate = new BlockChromiumPlate();
    public static PlateShinsei cobaltPlate = new BlockCobaltPlate();
    public static PlateShinsei copperPlate = new BlockCopperPlate();
    public static PlateShinsei goldPlate = new BlockGoldPlate();
    public static PlateShinsei ironPlate = new BlockIronPlate();
    public static PlateShinsei magnesiumPlate = new BlockMagnesiumPlate();
    public static PlateShinsei manganesePlate = new BlockManganesePlate();
    public static PlateShinsei molybdenumPlate = new BlockMolybdenumPlate();
    public static PlateShinsei nickelPlate = new BlockNickelPlate();
    public static PlateShinsei pewterPlate = new BlockPewterPlate();
    public static PlateShinsei platinumPlate = new BlockPlatinumPlate();
    public static PlateShinsei silverPlate = new BlockSilverPlate();
    public static PlateShinsei stainlessSteelPlate = new BlockStainlessSteelPlate();
    public static PlateShinsei steelPlate = new BlockSteelPlate();
    public static PlateShinsei tantalumPlate = new BlockTantalumPlate();
    public static PlateShinsei tinPlate = new BlockTinPlate();
    public static PlateShinsei titaniumPlate = new BlockTitaniumPlate();
    public static PlateShinsei tungstenPlate = new BlockTungstenPlate();
    public static PlateShinsei vanadiumPlate = new BlockVanadiumPlate();
    public static PlateShinsei zincPlate = new BlockZincPlate();

    //Deco - Tiles
    public static PlateShinsei amethystTile = new BlockAmethystTile();
    public static PlateShinsei apatiteTile = new BlockApatiteTile();
    public static PlateShinsei aquamarineTile = new BlockAquamarineTile();
    public static PlateShinsei fluoriteTile = new BlockFluoriteTile();
    public static PlateShinsei diamondTile = new BlockDiamondTile();
    public static PlateShinsei emeraldTile = new BlockEmeraldTile();
    public static PlateShinsei jadeTile = new BlockJadeTile();
    public static PlateShinsei onyxTile = new BlockOnyxTile();
    public static PlateShinsei opalTile = new BlockOpalTile();
    public static PlateShinsei peridotTile = new BlockPeridotTile();
    public static PlateShinsei rubyTile = new BlockRubyTile();
    public static PlateShinsei sapphireTile = new BlockSapphireTile();
    public static PlateShinsei scarletEmeraldTile = new BlockScarletEmeraldTile();
    public static PlateShinsei topazTile = new BlockTopazTile();
    public static PlateShinsei turquoiseTile = new BlockTurquoiseTile();

    public static PlateShinsei marbleTile = new BlockMarbleTile();
    public static PlateShinsei graniteTile = new BlockGraniteTile();
    //Machines
    public static Block fanesuOn = new BlockFanesu(true);
    public static Block fanesuOff = new BlockFanesu(false);
    public static BlockShinsei anbiru = new BlockAnbiru();
    public static final int guiIDAnbiru = 1;
    //Fluids
    public static BlockFluidClassic slakedLimeBlock;

 	public static void init(){
	
	//Block Initialization
        //Ores
        GameRegistry.registerBlock(acanthiteOre, Names.Materials.ACANTHITE + Names.Forms.ORE);
        GameRegistry.registerBlock(amethystOre, Names.Materials.AMETHYST + Names.Forms.ORE);
        GameRegistry.registerBlock(apatiteOre, Names.Materials.APATITE + Names.Forms.ORE);
        GameRegistry.registerBlock(bariteOre, Names.Materials.BARITE + Names.Forms.ORE);
        GameRegistry.registerBlock(bauxiteOre, Names.Materials.BAUXITE + Names.Forms.ORE);
        GameRegistry.registerBlock(berylOre, Names.Materials.BERYL + Names.Forms.ORE);
        GameRegistry.registerBlock(bismuthOre, Names.Materials.BISMUTH + Names.Forms.ORE);
        GameRegistry.registerBlock(borniteOre, Names.Materials.BORNITE + Names.Forms.ORE);
        GameRegistry.registerBlock(woodCrateCache, Names.Materials.WOOD + Names.Forms.CRATE + Names.Types.CACHE);
        GameRegistry.registerBlock(cassiteriteOre, Names.Materials.CASSITERITE + Names.Forms.ORE);
        GameRegistry.registerBlock(chalcedonyOre, Names.Materials.CHALCEDONY + Names.Forms.ORE);
        GameRegistry.registerBlock(chalcopyriteOre, Names.Materials.CHALCOPYRITE + Names.Forms.ORE);
        GameRegistry.registerBlock(chromiteOre, Names.Materials.CHROMITE + Names.Forms.ORE);
        GameRegistry.registerBlock(cinnabarOre, Names.Materials.CINNABAR + Names.Forms.ORE);
        GameRegistry.registerBlock(cobaltiteOre, Names.Materials.COBALTITE + Names.Forms.ORE);
        GameRegistry.registerBlock(cryoliteOre, Names.Materials.CRYOLITE + Names.Forms.ORE);
        GameRegistry.registerBlock(corundumOre, Names.Materials.CORUNDUM + Names.Forms.ORE);
        GameRegistry.registerBlock(dolomiteOre, Names.Materials.DOLOMITE + Names.Forms.ORE);
        GameRegistry.registerBlock(fluoriteOre, Names.Materials.FLUORITE + Names.Forms.ORE);
        GameRegistry.registerBlock(galenaOre, Names.Materials.GALENA + Names.Forms.ORE);
        GameRegistry.registerBlock(graphiteOre, Names.Materials.GRAPHITE + Names.Forms.ORE);
        GameRegistry.registerBlock(hematiteOre, Names.Materials.HEMATITE + Names.Forms.ORE);
        GameRegistry.registerBlock(ilmeniteOre, Names.Materials.ILMENITE + Names.Forms.ORE);
        GameRegistry.registerBlock(jadeiteOre, Names.Materials.JADEITE + Names.Forms.ORE);
        GameRegistry.registerBlock(meteoriteOre, Names.Materials.METEORITE + Names.Forms.ORE);
        GameRegistry.registerBlock(molybdeniteOre, Names.Materials.MOLYBDENITE + Names.Forms.ORE);
        GameRegistry.registerBlock(olivineOre, Names.Materials.OLIVINE + Names.Forms.ORE);
        GameRegistry.registerBlock(opalOre, Names.Materials.OPAL + Names.Forms.ORE);
        GameRegistry.registerBlock(pentlanditeOre, Names.Materials.PENTLANDITE + Names.Forms.ORE);
        GameRegistry.registerBlock(pyrolusiteOre, Names.Materials.PYROLUSITE + Names.Forms.ORE);
        GameRegistry.registerBlock(realgarOre, Names.Materials.REALGAR + Names.Forms.ORE);
        GameRegistry.registerBlock(rutileOre, Names.Materials.RUTILE + Names.Forms.ORE);
        GameRegistry.registerBlock(scheeliteOre, Names.Materials.SCHEELITE + Names.Forms.ORE);
        GameRegistry.registerBlock(sperryliteOre, Names.Materials.SPERRYLITE + Names.Forms.ORE);
        GameRegistry.registerBlock(sphaleriteOre, Names.Materials.SPHALERITE + Names.Forms.ORE);
        GameRegistry.registerBlock(stibniteOre, Names.Materials.STIBNITE + Names.Forms.ORE);
        GameRegistry.registerBlock(sulphurOre, Names.Materials.SULFUR + Names.Forms.ORE);
        GameRegistry.registerBlock(sylviteOre, Names.Materials.SYLVITE + Names.Forms.ORE);
        GameRegistry.registerBlock(tantaliteOre, Names.Materials.TANTALITE + Names.Forms.ORE);
        GameRegistry.registerBlock(topazOre, Names.Materials.TOPAZ + Names.Forms.ORE);
        GameRegistry.registerBlock(turquoiseOre, Names.Materials.TURQUOISE + Names.Forms.ORE);
        GameRegistry.registerBlock(uraniniteOre, Names.Materials.URANINITE + Names.Forms.ORE);

        //Metals
        GameRegistry.registerBlock(aluminumBlock, Names.Materials.ALUMINUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(antimonyBlock, Names.Materials.ANTIMONY + Names.Forms.BLOCK);
        GameRegistry.registerBlock(bariumBlock, Names.Materials.BARIUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(bismuthBlock, Names.Materials.BISMUTH + Names.Forms.BLOCK);
        GameRegistry.registerBlock(brassBlock, Names.Materials.BRASS + Names.Forms.BLOCK);
        GameRegistry.registerBlock(bronzeBlock, Names.Materials.BRONZE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(chromiumBlock, Names.Materials.CHROMIUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(cobaltBlock, Names.Materials.COBALT + Names.Forms.BLOCK);
        GameRegistry.registerBlock(copperBlock, Names.Materials.COPPER + Names.Forms.BLOCK);
        GameRegistry.registerBlock(leadBlock, Names.Materials.LEAD + Names.Forms.BLOCK);
        GameRegistry.registerBlock(magnesiumBlock, Names.Materials.MAGNESIUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(manganeseBlock, Names.Materials.MANGANESE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(molybdenumBlock, Names.Materials.MOLYBDENUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(nickelBlock, Names.Materials.NICKEL + Names.Forms.BLOCK);
        GameRegistry.registerBlock(platinumBlock, Names.Materials.PLATINUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(silverBlock, Names.Materials.SILVER + Names.Forms.BLOCK);
        GameRegistry.registerBlock(stainlessSteelBlock, Names.Materials.STAINLESS_STEEL + Names.Forms.BLOCK);
        GameRegistry.registerBlock(steelBlock, Names.Materials.STEEL + Names.Forms.BLOCK);
        GameRegistry.registerBlock(tantalumBlock, Names.Materials.TANTALUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(tinBlock, Names.Materials.TIN + Names.Forms.BLOCK);
        GameRegistry.registerBlock(titaniumBlock, Names.Materials.TITANIUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(tungstenBlock, Names.Materials.TUNGSTEN + Names.Forms.BLOCK);
        GameRegistry.registerBlock(vanadiumBlock, Names.Materials.VANADIUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(zincBlock, Names.Materials.ZINC + Names.Forms.BLOCK);

        //Gems/Crystals
        GameRegistry.registerBlock(amethystBlock, Names.Materials.AMETHYST + Names.Forms.BLOCK);
        GameRegistry.registerBlock(apatiteBlock, Names.Materials.APATITE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(aquamarineBlock, Names.Materials.AQUAMARINE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(fluoriteBlock, Names.Materials.FLUORITE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(jadeBlock, Names.Materials.JADE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(onyxBlock, Names.Materials.ONYX + Names.Forms.BLOCK);
        GameRegistry.registerBlock(opalBlock, Names.Materials.OPAL + Names.Forms.BLOCK);
        GameRegistry.registerBlock(peridotBlock, Names.Materials.PERIDOT + Names.Forms.BLOCK);
        GameRegistry.registerBlock(rubyBlock, Names.Materials.RUBY + Names.Forms.BLOCK);
        GameRegistry.registerBlock(sapphireBlock, Names.Materials.SAPPHIRE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(scarletEmeraldBlock, Names.Materials.SCARLET_EMERALD + Names.Forms.BLOCK);
        GameRegistry.registerBlock(topazBlock, Names.Materials.TOPAZ + Names.Forms.BLOCK);
        GameRegistry.registerBlock(turquoiseBlock, Names.Materials.TURQUOISE + Names.Forms.BLOCK);

        //Mineral Blocks
        GameRegistry.registerBlock(basaltBlock, Names.Materials.BASALT + Names.Forms.BLOCK);
        GameRegistry.registerBlock(basaltCobble, Names.Materials.BASALT + Names.Forms.COBBLE);
        GameRegistry.registerBlock(boraxBlock, Names.Materials.BORAX + Names.Forms.BLOCK);
        GameRegistry.registerBlock(chalkBlock, Names.Materials.CHALK + Names.Forms.BLOCK);
        GameRegistry.registerBlock(limestoneBlock, Names.Materials.LIMESTONE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(marbleBlock, ItemMarbleBlock.class, Names.Materials.MARBLE);
        GameRegistry.registerBlock(siltstoneBlock, Names.Materials.SILTSTONE + Names.Forms.BLOCK);
        GameRegistry.registerBlock(graniteBlock, ItemGraniteBlock.class, Names.Materials.GRANITE);
        GameRegistry.registerBlock(gypsumBlock, Names.Materials.GYPSUM + Names.Forms.BLOCK);
        GameRegistry.registerBlock(haliteBlock, Names.Materials.HALITE + Names.Forms.BLOCK);

        //Deco
        GameRegistry.registerBlock(brickBlock, ItemBrickBlock.class, Names.Materials.BRICK);
        GameRegistry.registerBlock(sidingBlock, ItemSidingBlock.class, Names.Materials.SIDING);
        GameRegistry.registerBlock(stuccoBlock, Names.Materials.STUCCO + Names.Forms.BLOCK);
        GameRegistry.registerBlock(graphiteBricks, Names.Materials.GRAPHITE + Names.Forms.BRICKS);

        //Deco - Lamps
        GameRegistry.registerBlock(amethystLampOn, Names.Materials.AMETHYST + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(amethystLampOff, Names.Materials.AMETHYST + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(apatiteLampOn, Names.Materials.APATITE + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(apatiteLampOff, Names.Materials.APATITE + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(aquamarineLampOn, Names.Materials.AQUAMARINE + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(aquamarineLampOff, Names.Materials.AQUAMARINE + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(diamondLampOn, Names.Materials.DIAMOND + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(diamondLampOff, Names.Materials.DIAMOND + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(emeraldLampOn, Names.Materials.EMERALD + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(emeraldLampOff, Names.Materials.EMERALD + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(fluoriteLampOn, Names.Materials.FLUORITE + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(fluoriteLampOff, Names.Materials.FLUORITE + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(jadeLampOn, Names.Materials.JADE + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(jadeLampOff, Names.Materials.JADE + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(onyxLampOn, Names.Materials.ONYX + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(onyxLampOff, Names.Materials.ONYX + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(opalLampOn, Names.Materials.OPAL + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(opalLampOff, Names.Materials.OPAL + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(peridotLampOn, Names.Materials.PERIDOT + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(peridotLampOff, Names.Materials.PERIDOT + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(rubyLampOn, Names.Materials.RUBY + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(rubyLampOff, Names.Materials.RUBY + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(sapphireLampOn, Names.Materials.SAPPHIRE + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(sapphireLampOff, Names.Materials.SAPPHIRE + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(scarletEmeraldLampOn, Names.Materials.SCARLET_EMERALD + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(scarletEmeraldLampOff, Names.Materials.SCARLET_EMERALD + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(topazLampOn, Names.Materials.TOPAZ + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(topazLampOff, Names.Materials.TOPAZ + Names.Forms.LAMP + Names.States.OFF);
        GameRegistry.registerBlock(turquoiseLampOn, Names.Materials.TURQUOISE + Names.Forms.LAMP + Names.States.ON);
        GameRegistry.registerBlock(turquoiseLampOff, Names.Materials.TURQUOISE + Names.Forms.LAMP + Names.States.OFF);

        //Deco - Stones (Infused)
        GameRegistry.registerBlock(amethystStone, Names.Materials.AMETHYST + Names.Forms.STONE);
        GameRegistry.registerBlock(apatiteStone, Names.Materials.APATITE + Names.Forms.STONE);
        GameRegistry.registerBlock(aquamarineStone, Names.Materials.AQUAMARINE + Names.Forms.STONE);
        GameRegistry.registerBlock(diamondStone, Names.Materials.DIAMOND + Names.Forms.STONE);
        GameRegistry.registerBlock(emeraldStone, Names.Materials.EMERALD + Names.Forms.STONE);
        GameRegistry.registerBlock(fluoriteStone, Names.Materials.FLUORITE + Names.Forms.STONE);
        GameRegistry.registerBlock(jadeStone, Names.Materials.JADE + Names.Forms.STONE);
        GameRegistry.registerBlock(onyxStone, Names.Materials.ONYX + Names.Forms.STONE);
        GameRegistry.registerBlock(opalStone, Names.Materials.OPAL + Names.Forms.STONE);
        GameRegistry.registerBlock(peridotStone, Names.Materials.PERIDOT + Names.Forms.STONE);
        GameRegistry.registerBlock(rubyStone, Names.Materials.RUBY + Names.Forms.STONE);
        GameRegistry.registerBlock(sapphireStone, Names.Materials.SAPPHIRE + Names.Forms.STONE);
        GameRegistry.registerBlock(scarletEmeraldStone, Names.Materials.SCARLET_EMERALD + Names.Forms.STONE);
        GameRegistry.registerBlock(topazStone, Names.Materials.TOPAZ + Names.Forms.STONE);
        GameRegistry.registerBlock(turquoiseStone, Names.Materials.TURQUOISE + Names.Forms.STONE);

        //Deco - Plates
        GameRegistry.registerBlock(aluminumPlate, Names.Materials.ALUMINUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(antimonyPlate, Names.Materials.ANTIMONY + Names.Forms.PLATE);
        GameRegistry.registerBlock(bariumPlate, Names.Materials.BARIUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(bismuthPlate, Names.Materials.BISMUTH + Names.Forms.PLATE);
        GameRegistry.registerBlock(brassPlate, Names.Materials.BRASS + Names.Forms.PLATE);
        GameRegistry.registerBlock(bronzePlate, Names.Materials.BRONZE + Names.Forms.PLATE);
        GameRegistry.registerBlock(chromiumPlate, Names.Materials.CHROMIUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(cobaltPlate, Names.Materials.COBALT + Names.Forms.PLATE);
        GameRegistry.registerBlock(copperPlate, Names.Materials.COPPER + Names.Forms.PLATE);
        GameRegistry.registerBlock(goldPlate, Names.Materials.GOLD + Names.Forms.PLATE);
        GameRegistry.registerBlock(ironPlate, Names.Materials.IRON + Names.Forms.PLATE);
        GameRegistry.registerBlock(magnesiumPlate, Names.Materials.MAGNESIUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(manganesePlate, Names.Materials.MANGANESE + Names.Forms.PLATE);
        GameRegistry.registerBlock(molybdenumPlate, Names.Materials.MOLYBDENUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(nickelPlate, Names.Materials.NICKEL + Names.Forms.PLATE);
        GameRegistry.registerBlock(pewterPlate, Names.Materials.PEWTER + Names.Forms.PLATE);
        GameRegistry.registerBlock(platinumPlate, Names.Materials.PLATINUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(silverPlate, Names.Materials.SILVER + Names.Forms.PLATE);
        GameRegistry.registerBlock(stainlessSteelPlate, Names.Materials.STAINLESS_STEEL + Names.Forms.PLATE);
        GameRegistry.registerBlock(steelPlate, Names.Materials.STEEL + Names.Forms.PLATE);
        GameRegistry.registerBlock(tantalumPlate, Names.Materials.TANTALUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(tinPlate, Names.Materials.TIN + Names.Forms.PLATE);
        GameRegistry.registerBlock(titaniumPlate, Names.Materials.TITANIUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(tungstenPlate, Names.Materials.TUNGSTEN + Names.Forms.PLATE);
        GameRegistry.registerBlock(vanadiumPlate, Names.Materials.VANADIUM + Names.Forms.PLATE);
        GameRegistry.registerBlock(zincPlate, Names.Materials.ZINC + Names.Forms.PLATE);

        //Deco - Tiles
        GameRegistry.registerBlock(amethystTile, Names.Materials.AMETHYST + Names.Forms.TILE);
        GameRegistry.registerBlock(apatiteTile, Names.Materials.APATITE + Names.Forms.TILE);
        GameRegistry.registerBlock(aquamarineTile, Names.Materials.AQUAMARINE + Names.Forms.TILE);
        GameRegistry.registerBlock(fluoriteTile, Names.Materials.FLUORITE + Names.Forms.TILE);
        GameRegistry.registerBlock(jadeTile, Names.Materials.JADE + Names.Forms.TILE);
        GameRegistry.registerBlock(onyxTile, Names.Materials.ONYX + Names.Forms.TILE);
        GameRegistry.registerBlock(opalTile, Names.Materials.OPAL + Names.Forms.TILE);
        GameRegistry.registerBlock(peridotTile, Names.Materials.PERIDOT + Names.Forms.TILE);
        GameRegistry.registerBlock(rubyTile, Names.Materials.RUBY + Names.Forms.TILE);
        GameRegistry.registerBlock(sapphireTile, Names.Materials.SAPPHIRE + Names.Forms.TILE);
        GameRegistry.registerBlock(scarletEmeraldTile, Names.Materials.SCARLET_EMERALD + Names.Forms.TILE);
        GameRegistry.registerBlock(topazTile, Names.Materials.TOPAZ + Names.Forms.TILE);
        GameRegistry.registerBlock(turquoiseTile, Names.Materials.TURQUOISE + Names.Forms.TILE);

        GameRegistry.registerBlock(marbleTile, ItemMarbleBlock.class, Names.Materials.MARBLE + Names.Forms.TILE);
        GameRegistry.registerBlock(graniteTile, ItemGraniteBlock.class, Names.Materials.GRANITE + Names.Forms.TILE);

    //Machines
        GameRegistry.registerBlock(anbiru, Names.Forms.ANBIRU);
        GameRegistry.registerBlock(fanesuOn, Names.Forms.FANESU + Names.States.ON);
        GameRegistry.registerBlock(fanesuOff, Names.Forms.FANESU + Names.States.OFF);

    }
}
