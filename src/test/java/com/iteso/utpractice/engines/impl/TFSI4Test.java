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

    private com.iteso.utpractice.engines.iEngine myEngine;

    @Before
    public void setUp(){
        private int gas;
        myEngine = new TFSI4();
    }

    @Test
    public void testEngineStartTrue(){

        gas = 10;
        myEngine.setGas(gas);
        boolean started = myEngine.start();
        assertTrue(started);

    }

    @Test
    public void testEngineStartFalse(){

        gas = 0;
        myEngine.setGas(gas);
        boolean started = myEngine.start();
        assertFalse(started);

    }

    @Test
    public void testEngineStartInvalid(){

        gas = -10;
        myEngine.setGas(gas);
        boolean started = myEngine.start();
        assertFalse(started);

    }

}
