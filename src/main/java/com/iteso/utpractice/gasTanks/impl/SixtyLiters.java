package com.iteso.utpractice.gasTanks.impl;

import com.iteso.utpractice.gasTanks.iGasTank;

/**
 * Created by GeovaniSerrano on 9/8/15.
 */
public class SixtyLiters implements iGasTank {
    private float gasLevel;
    private final int MAX_GAS_LEVEL = 60;

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
        if (getGasLevel() < getTankCapacity()) {
            total = getGasLevel() + liters;
            if (total > getTankCapacity()) {
                setGasLevel(getTankCapacity());
            } else {
                if(liters >= 0) {
                    setGasLevel(getGasLevel() + liters);
                } else {
                    setGasLevel(getGasLevel());
                }
            }
        }
    }

    public void setGasLevel(float gasLevel) {
        this.gasLevel = gasLevel;
    }
}
