package com.iteso.utpractice.gastanks.impl;

import com.iteso.utpractice.gastanks.iGastTank;

/**
 * Created by ShaSkills on 08/09/2015.
 */
public class FortyLiters implements iGastTank {

    private float gasLevel;
    private final int MAX_GAS_LEVEL=40;

    @Override
    public float getGasLevel() {
        return gasLevel;
    }

    @Override
    public int getGasCapacity() {
        return MAX_GAS_LEVEL;
    }

    @Override
    public void addGas(float Liters) { // 1 -- que el gas se mayor o igual que el getTank capacity

        float total;

            if(Liters > 0)
            {
                if(getGasLevel() < getGasCapacity()){ // cuando sea mayor que la capacidad, cuando sea menor
                    total = getGasLevel() + Liters;

                    if(total > getGasCapacity()) { // para cuando sea mayor que la capacidad y menor
                        setGasLevel(getGasCapacity());
                    }
                    else // para este
                        setGasLevel(getGasLevel()+ Liters);

                }
            }

        else
                setGasLevel(getGasLevel());


    }

    public void setGasLevel(float gasLevel){ // Aqui tambien hice modificaciones para que no aceptara numeros menores que 0
        if(gasLevel > 0)
        this.gasLevel = gasLevel;

        else
            this.gasLevel=0;
    }
}
