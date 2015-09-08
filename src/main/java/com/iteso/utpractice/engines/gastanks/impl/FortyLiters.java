package com.iteso.utpractice.engines.gastanks.impl;

import com.iteso.utpractice.engines.gastanks.iGasTank;

/**
 * Created by JoseFranco on 08/09/2015.
 */

public class FortyLiters implements iGasTank {
    private final int MAX_GAS_LEVEL = 40;
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
    public void addGas(float Liters) {
    float total;
        if(getGasLevel() < getTankCapacity()){
            total= getGasLevel() + Liters;
            if(total > getTankCapacity()){
                setGasLevel(getTankCapacity());
            }
            else
                setGasLevel(getGasLevel() + Liters);

        }
    }

    public void setGasLevel(float gasLevel){
        this.gasLevel = gasLevel;
    }
}
