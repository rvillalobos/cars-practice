package com.iteso.utpractice.gas.impl;

import com.iteso.utpractice.gas.iGasTank;

/**
 * Created by GGGK4 on 03/09/2015.
 */
public class gas60Liters implements iGasTank {

    private int MAX_GAS_LEVEL = 60;
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
    public void addGas(float liters){
        float total;

        if(getGasLevel() < getTankCapacity()){
            total = getGasLevel() + liters;
            if (total > getTankCapacity())
                setGasLevel(getTankCapacity());
            else
                setGasLevel(getGasLevel() + liters);
        }

    }

    public void setGasLevel(float gasLevel){
        this.gasLevel = gasLevel;
    }

}
