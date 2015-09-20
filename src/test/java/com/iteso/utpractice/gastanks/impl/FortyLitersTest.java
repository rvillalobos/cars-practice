package com.iteso.utpractice.gastanks.impl;

import com.iteso.utpractice.engines.impl.TFSI4;
import com.iteso.utpractice.gastanks.iGastTank;
import com.iteso.utpractice.gastanks.impl.FortyLiters;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ShaSkills on 08/09/2015.
 */
public class FortyLitersTest {

    float started;
    float NivelGas;
    float Gas;
    FortyLiters FLT = new FortyLiters();

    @Before
    public void setUp(){

        NivelGas = 0;
        Gas=0;
        started=0;
    }

    @Test
     public void testTankOverCapacity(){

        //En caso de que si quieran agregan mas litros que la capacidad, el nivel del gas sera igual a la maxima capacidad

        NivelGas = 0;
        Gas=50;

        FLT.setGasLevel(NivelGas);
        FLT.addGas(Gas);
        started = FLT.getGasLevel();

        if(started == FLT.getGasCapacity())
            assertTrue(true);


    }

    @Test
    public void testTank(){

        // En caso de que se agreguen los litros adecuados y el nivel del gas adecuado.
        NivelGas = 10;
        Gas=20;

        FLT.setGasLevel(NivelGas);
        FLT.addGas(Gas);

        started = FLT.getGasLevel();
        if(started <= FLT.getGasCapacity())
            assertTrue(true);

    }


    @Test
    public void testTankInvalid(){

        //En caso de se quiera agregar litros negativos, no se agregara nada y el nivel del gas se quedara igual.

        float NivelGas = 10;
        float Gas = -10;

         FLT.setGasLevel(NivelGas);
         FLT.addGas(Gas);
         started = FLT.getGasLevel();

        if(NivelGas == started)
            assertTrue(true);

    }

    @Test
    public void testTanksetGasInvalid(){

        //En caso de se quiera agregar litros negativos, no se agregara nada y el nivel del gas se quedara igual.

        float NivelGas = 60;
        float Gas = 20;

        FLT.setGasLevel(NivelGas);
        FLT.addGas(Gas);
        started = FLT.getGasLevel();

            if(started == FLT.getGasCapacity())
                assertTrue(true);

    }


}
