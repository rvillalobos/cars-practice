package com.iteso.utpractice.engines.impl;

import com.iteso.utpractice.engines.iGasTank;

/**
 * Created by GeovaniSerrano on 9/3/15.
 */
public class fourtyLiters implements iGasTank {
    private int gas = 40;
    @Override
    public int getGasLeve() {
        return gas;
    }

    @Override
    public int getCapacity() {
        return 40;
    }

    @Override
    public void setGas(int gas) {
        this.gas = gas;
    }
}

