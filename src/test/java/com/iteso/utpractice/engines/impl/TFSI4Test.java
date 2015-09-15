package com.iteso.utpractice.engines.impl;
import com.iteso.utpractice.gas.iGasTank;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.iteso.utpractice.engines.impl.TFSI4;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;


/**
 * Created by rvillalobos on 9/15/14.
 */
public class TFSI4Test {

    TFSI4 myEngine;
    iGasTank myTank;

    @Before
    public void setUp(){

        myEngine = new TFSI4();
        myTank = mock(iGasTank.class);
        myEngine.setGasTank(myTank);

    }

    @Test
    public void testEngineStartTrue(){

        when(myTank.getGasLevel()).thenReturn((float) 10);
        int started = myEngine.start();
        assertEquals(1,started);

    }

    @Test
    public void testEngineStartFalse(){

        when(myTank.getGasLevel()).thenReturn((float)0);
        int started = myEngine.start();
        assertEquals(0, started);
    }

    @Test
    public void testEngineStartInvalid(){

        when(myTank.getGasLevel()).thenReturn((float)-1);
        int started = myEngine.start();
        assertEquals(-1, started);

    }

}
