package com.iteso.utpractice.gastanks;

/**
 * Created by GeraCruz on 03/09/15.
 */
public interface iGasTank {
    public float getGasLevel();
    public int getTankCapacity();
    public void addGas(float liters);
}