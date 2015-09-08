package com.iteso.utpractice.gasTanks;

/**
 * Created by GeovaniSerrano on 9/3/15.
 */
public interface iGasTank {
    public float getGasLevel();

    public int getTankCapacity();

    public void addGas(float liters);
}
