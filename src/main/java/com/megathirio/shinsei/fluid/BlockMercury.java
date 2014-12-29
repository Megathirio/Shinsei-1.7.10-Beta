package com.megathirio.shinsei.fluid;

import com.megathirio.shinsei.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class BlockMercury extends BlockFluidShinsei{

    public BlockMercury(Fluid fluid, Material material) {
        super(fluid, material);
        this.setBlockName(Names.Fluids.MERCURY + Names.Forms.BLOCK);
    }
}
