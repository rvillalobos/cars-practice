package com.iteso.utpractice.engines.impl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/**
 * Created by rvillalobos on 9/15/14.
 */
public class TFSI4Test {

    TSFI4 myEngine;
    int starterd;

    @Before
    public void setUp(){
        myEngine = new TFSI4();
        started = 0;
    }

    @Test
    public void testEngineStartTrue(){

        myEngine.setGas(10);
        started = myEngine.start();
        assertEquals(1,started);
    }

    @Test
    public void testEngineStartFalse(){

        myEngine.setGas(0);
        started = myEngine.start();
        assertEquals(0,started);
    }

    @Test
    public void testEngineStartInvalid(){

        myEngine.setGas(-10);
        started = myEngine.start();
        assertEquals(-1,started);
    }

}
