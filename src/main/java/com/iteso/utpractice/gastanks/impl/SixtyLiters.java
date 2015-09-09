package com.iteso.utpractice.gastanks.impl;
import com.iteso.utpractice.gastanks.iGasTank;

/**
 * Created by Carlos on 08/09/2015.
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
    public void addGass(float liters) {
        float total;
        if(getGasLevel() < getTankCapacity() && liters >=0){
            total = getGasLevel() + liters;
            if(total > getTankCapacity()){
                setGasLevel(getTankCapacity());
            }
            else
                setGasLevel(getGasLevel() + liters);
        }
    }

    public void setGasLevel(float gasLevel) {
        this.gasLevel = gasLevel;
    }
}
