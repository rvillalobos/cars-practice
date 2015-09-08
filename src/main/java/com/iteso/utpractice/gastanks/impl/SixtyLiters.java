package com.iteso.utpractice.gastanks.impl;

public class FortyLiters implements iGasTank{
    private float gasLevel;
    private final int MAX_GAS_LEVEL = 60;

    @Override
    public float getGasLevel(){
        return gasLevel;
    }

    @Override
    public int getTankCapacity(){
        return MAX_GAS_LEVEL;
    }

    @Override
    public void addGass(float liters){
        float total;

        if(getGasLevel() < getTankCapacity()) {
            total = getGasLevel() + liters;
            if (total > getTankCapacity()) {
                addGass(getTankCapacity() - getGasLevel());
            } else {
                setGasLevel(getGasLevel() + liters);
            }
        }

    }

    public void setGasLevel(float gasLevel){
        this.gasLevel = gasLevel
    }

}