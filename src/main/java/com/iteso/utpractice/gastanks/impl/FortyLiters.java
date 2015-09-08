package com.iteso.utpractice.gastanks.impl;
import com.iteso.utpractice.gastanks.iGasTank;

/**
 * Created by Carlos on 08/09/2015.
 */
public class FortyLiters implements iGasTank {
    private float gasLevel;
    private final int MAX_GAS_LEVEL = 40;


    @Override
    public float getGasLevel() {
        return gasLevel;
    }

    @Override
    public int getTankCapacity() {
        return MAX_GAS_LEVEL;
    }

    @Override
    public void addGass(float liters) {
        float total;
        if(getGasLevel() < getTankCapacity()){
            total = getGasLevel() + liters;
            if(total > getTankCapacity()){
                addGass(getTankCapacity()-getGasLevel());
            }
            else
                addGass(liters);
        }
    }
}
