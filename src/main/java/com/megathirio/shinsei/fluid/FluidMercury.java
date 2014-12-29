package com.megathirio.shinsei.fluid;

import com.megathirio.shinsei.reference.Names;

public class FluidMercury extends FluidShinsei {

    public FluidMercury() {
        super(Names.Fluids.MERCURY);

        setDensity(20);
        setViscosity(2000);
        this.setUnlocalizedName(Names.Fluids.MERCURY);
    }
}
