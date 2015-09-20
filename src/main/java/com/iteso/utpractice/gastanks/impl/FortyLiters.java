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
    public void addGas(float Liters) {

        float total;

            if(Liters > 0)
            {
                if(getGasLevel() < getGasCapacity()){ // Se compara que el nivel del Gas actual no sea mayor a la capacidad
                    total = getGasLevel() + Liters;

                    if(total > getGasCapacity()) { // Si lo que se quiere agregar es mayor a la capacidad, se guarda el nivel
                                                    // hasta la capacidad Maxima
                        setGasLevel(MAX_GAS_LEVEL);
                    }
                    else //Si paso todas las validaciones, se agregan los litros al tanque de forma normal
                        setGasLevel(getGasLevel()+ Liters);

                }
            }

        else // si es mayor, se pone la capacidad maxima al tanque
                setGasLevel(MAX_GAS_LEVEL);


    }

    public void setGasLevel(float gasLevel){ // Aqui tambien hice modificaciones para que no aceptara numeros negativos
                                                //En caso de que fuera un numero menor, el nivel del gas se pone como 0
        if(gasLevel > 0)
        this.gasLevel = gasLevel;

        else
            this.gasLevel=0;
    }
}
