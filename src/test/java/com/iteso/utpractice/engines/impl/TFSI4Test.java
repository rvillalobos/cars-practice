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
    com.iteso.utpractice.engines.iEngine myEngine;

    @Before
    public void setUp(){

        myEngine = new TFSI4();
    }

    @Test
    public void testEngineStartTrue(){

        assertTrue(false);

    }

    @Test
    public void testEngineStartFalse(){

        assertFalse(true);

    }

    @Test
    public void testEngineStartInvalid(){
        assertFalse(true);

    }

}
