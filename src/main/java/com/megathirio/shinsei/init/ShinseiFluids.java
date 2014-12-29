package com.megathirio.shinsei.init;

import com.megathirio.shinsei.fluid.*;
import com.megathirio.shinsei.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class ShinseiFluids {

    public static FluidShinsei slakedLimeFluid;
    public static BlockFluidShinsei slakedLimeBlock;
    public static BucketShinsei slakedLimeBucket = new BucketSlakedLime();
    public static FluidShinsei mercuryFluid;
    public static BlockFluidShinsei mercuryBlock;
    public static BucketShinsei mercuryBucket = new BucketMercury();
    public static void init(){
    //Fluid Registration
        slakedLimeFluid = new FluidSlakedLime();
        mercuryFluid = new FluidMercury();

        //Fluid Bucket Registration
        GameRegistry.registerItem(slakedLimeBucket, Names.Fluids.SLAKED_LIME + Names.Forms.BUCKET);
        GameRegistry.registerItem(mercuryBucket, Names.Fluids.MERCURY + Names.Forms.BUCKET);

        //Fluid Block Registration
        slakedLimeBlock = new BlockSlakedLime(ShinseiFluids.slakedLimeFluid, Material.water);
        GameRegistry.registerBlock(slakedLimeBlock, Names.Fluids.SLAKED_LIME + Names.Forms.BLOCK);
        mercuryBlock = new BlockMercury(ShinseiFluids.mercuryFluid, Material.water);
        GameRegistry.registerBlock(mercuryBlock, Names.Fluids.MERCURY + Names.Forms.BLOCK);

    }

}
