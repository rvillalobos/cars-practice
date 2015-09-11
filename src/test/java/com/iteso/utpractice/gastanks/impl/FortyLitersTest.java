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
    FortyLiters FLT = new FortyLiters();

    @Before
    public void setUp(){
        started=0;
    }

    @Test
    public void testTankOverCapacity(){

        FLT.setGasLevel(0);
        FLT.addGas(50);
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
