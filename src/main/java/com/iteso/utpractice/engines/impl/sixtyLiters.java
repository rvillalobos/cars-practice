package com.iteso.utpractice.engines.impl;

import com.iteso.utpractice.engines.iGasTank;

/**
 * Created by GeovaniSerrano on 9/3/15.
 */
public class sixtyLiters implements iGasTank {
    private int gas = 60;

    @Override
    public int getGasLeve() {
        return gas;
    }

    @Override
    public int getCapacity() {
        return 60;
    }

    @Override
    public void setGas(int gas) {
        this.gas = gas;
    }
}
