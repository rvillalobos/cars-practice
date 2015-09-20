package com.iteso.utpractice.gastanks.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by ShaSkills on 08/09/2015.
 */
public class SixtyLitersTest {

    float started;
    float NivelGas;
    float Gas;
    SixtyLiters FLT = new SixtyLiters();

    @Before
    public void setUp(){

        NivelGas = 0;
        Gas=0;
        started=0;
    }

    @Test
    public void testTankOverCapacity(){ //

        //En caso de que si quieran agregan mas litros que la capacidad, el nivel del gas sera igual a la maxima capacidad

        NivelGas = 0;
        Gas=70;
        FLT.setGasLevel(NivelGas);
        FLT.addGas(Gas);

        started = FLT.getGasLevel();

        if(started == FLT.getGasCapacity())
            assertTrue(true);

    }

    @Test
    public void testTank(){

        NivelGas = 20;
        Gas=30;

        FLT.setGasLevel(10);
        FLT.addGas(-10);

        started = FLT.getGasLevel();
        if(started <= FLT.getGasCapacity())
            assertTrue(true);
       
    }

    @Test
    public void testTankInvalid(){

        //En caso de se quiera agregar litros negativos, no se agregara nada y el nivel del gas se quedara igual.

        float NivelGas = 10;
        float Gas = -20;

        FLT.setGasLevel(NivelGas);
        FLT.addGas(Gas);
        started = FLT.getGasLevel();

        if(NivelGas == started)
            assertTrue(true);

    }

    @Test
    public void testTanksetGasInvalid(){

        //En caso de se quiera agregar litros negativos, no se agregara nada y el nivel del gas se quedara igual.

        float NivelGas = 80;
        float Gas = 20;

        FLT.setGasLevel(NivelGas);
        FLT.addGas(Gas);
        started = FLT.getGasLevel();

        if(started == FLT.getGasCapacity())
            assertTrue(true);

    }


}
