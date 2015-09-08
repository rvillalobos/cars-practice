package com.iteso.utpractice.engines.impl;
import com.iteso.utpractice.gasTanks.iGasTank;
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
public class TFSI4Test {
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
    public void testEngineStartTrue() {
        when(myTank.getGasLevel()).thenReturn((float) 10);

        started = myEngine.start();

        assertEquals(1, started);
    }

    @Test
    public void testEngineStartFalse(){
        when(myTank.getGasLevel()).thenReturn((float) 0);

        started = myEngine.start();

        assertEquals(0, started);
    }

    @Test
    public void testEngineStartInvalid(){
        when(myTank.getGasLevel()).thenReturn((float) -1);
        started = myEngine.start();

        assertEquals(-1, started);
    }

}
