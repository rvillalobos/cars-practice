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
    SixtyLiters FLT = new SixtyLiters();

    @Before
    public void setUp(){

        started=0;
    }

    @Test
    public void testTankOverCapacity(){ //

        FLT.setGasLevel(0);
        FLT.addGas(60);
        started = FLT.getGasLevel();
            if(started <= FLT.getGasCapacity())
                    assertTrue(true);
        else
                assertFalse(true);

    }

    @Test
    public void testTankInvalidad(){

        FLT.setGasLevel(10);
        FLT.addGas(-10);
        started = FLT.getGasLevel();
        if(started == 0)
            assertTrue(true);
       
    }


}
