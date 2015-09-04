package com.iteso.utpractice.engines.impl;
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
    com.iteso.utpractice.engines.iEngine myEngine;
    com.iteso.utpractice.engines.iGasTank gasTank;

    @Before
    public void setUp(){
        gasTank = mock(com.iteso.utpractice.engines.iGasTank.class);
        myEngine = new TFSI4();
    }

    @Test
    public void testEngineStartTrue(){
        when(myEngine.start()).thenReturn(1);

        int started = myEngine.start();

        if(started == 1)
            assertTrue(true);

    }

    @Test
    public void testEngineStartFalse(){
        when(myEngine.start()).thenReturn(0);

        int started = myEngine.start();

        if(started == 0)
            assertTrue(false);

    }

    @Test
    public void testEngineStartInvalid(){
        when(myEngine.start()).thenReturn(-1);

        int started = myEngine.start();

        if(started == -1)
        assertFalse(false);

    }

}
