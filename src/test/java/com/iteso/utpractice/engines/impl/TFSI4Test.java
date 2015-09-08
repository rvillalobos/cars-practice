package com.iteso.utpractice.engines.impl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;


/**
 * Created by rvillalobos on 9/15/14.
 */
public class TFSI4Test {

    TFSI4 MyEngine;
    iGasTank myTank;
    int starterd;

    @Before
    public void setUp(){
        myEngine = new TFSI4();
        myTank = mock(iGasTank.class);
        myEngine.setGastTank(myTank);
        started = 0;
    }

    @Test
    public void testEngineStartTrue(){
        when(myTank.getGasLevel()).thenReturn((float) 10);
        started = myEngine.start();
        assertEquals(1,started);
    }

    @Test
    public void testEngineStartFalse(){
        when(myTank.getGasLevel()).thenReturn((float) 0);
        started = myEngine.start();
        assertEquals(0,started);
    }

    @Test
    public void testEngineStartInvalid(){
        when(myTank.getGasLevel()).thenReturn((float) -10);
        started = myEngine.start();
        assertEquals(-1,started);
    }

}
