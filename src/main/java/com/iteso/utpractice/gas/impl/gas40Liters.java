package com.iteso.utpractice.gas.impl;

import com.iteso.utpractice.gas.iGasTank;

/**
 * Created by GGGK4 on 03/09/2015.
 */
public class gas40Liters implements iGasTank {

    private int MAX_GAS_LEVEL = 40;
    private float gasLevel;

    @Override
    public float getGasLevel() {
        return gasLevel;
    }

    @Override
    public int getTankCapacity() {
        return MAX_GAS_LEVEL;
    }

    @Override
    public void addGas(float liters) {
        float total;

        if (getGasLevel() < getTankCapacity()){
            total = getGasLevel() + liters;
            if (total > getTankCapacity())
                gasLevel = getTankCapacity() - getGasLevel();
            else
                gasLevel += liters;
        }

    }

    public void setGasLevel(float gasLevel){
        this.gasLevel = gasLevel;
    }
}
