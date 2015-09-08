package com.iteso.utpractice.engines.impl;
import com.iteso.utpractice.engines.gastanks.iGasTank;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;


import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/**
 * Created by rvillalobos on 9/15/14.
 */
public class TFSI4Test{
    TFSI4 myEngine;
    iGasTank myTank;
    int started;
    @Before
    public void setUp(){


        myTank = mock(iGasTank.class);
        myEngine = new TFSI4();
        myEngine.setGasTank(myTank);
        started = 0;
    }

    @Test
    public void testEngineStartTrue(){

        when(myTank.getGasLevel()).thenReturn((float)10);
        myEngine.setGas(6); // ponemos gasolina para que tenga valor
        started = myEngine.start(); // igualamos para que started tenga true
        assertEquals(1, started);

    }

    @Test
    public void testEngineStartFalse(){

        when(myTank.getGasLevel()).thenReturn((float)0);
        myEngine.setGas(0);
        started = myEngine.start();
        assertEquals(0, started);

    }

    @Test
    public void testEngineStartInvalid(){

        when(myTank.getGasLevel()).thenReturn((float)-1);
        myEngine.setGas(-10);
        started = myEngine.start();
        assertEquals(-10, started);

    }

}
