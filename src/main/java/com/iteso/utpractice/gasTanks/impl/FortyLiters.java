package com.iteso.utpractice.gasTanks.impl;

import com.iteso.utpractice.gasTanks.iGasTank;

/**
 * Created by Feelpaa on 08/09/2015.
 */
public class FortyLiters implements iGasTank {
    private float gasLevel;
    private final int MAX_GAS_LEVEL=40;
    //es final para que no la puedan modificar.


    @Override
    public float gestGasLevel() {
        return getGasLevel();
    }

    @Override
    public int getTankCpacity() {
        return MAX_GAS_LEVEL;
    }

    @Override
    public void addGass(float Liters) {
        float total;

        if(gestGasLevel() < getTankCpacity()){
            total = gestGasLevel() + Liters;
            if(total > getTankCpacity()){
                /*addGass(getTankCpacity()-gestGasLevel());
                //capacidad del tanque menos el valor que ya hay en el tanque
                esta mal
                */

                setGasLevel(getTankCpacity());

            }//if total
        }//if getgas
        else
            //addGass(Liters);
        setGasLevel(getGasLevel()+Liters);

    }

    public float getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(float gasLevel) {
        this.gasLevel = gasLevel;
    }
}
