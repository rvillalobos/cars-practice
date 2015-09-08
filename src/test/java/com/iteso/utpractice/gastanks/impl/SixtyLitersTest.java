package com.iteso.utpractice.gastanks.impl;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos on 08/09/2015.
 */
public class SixtyLitersTest {
    SixtyLiters myTank;
    double myGas;

    @Before
    public void setUp(){
        myTank = new SixtyLiters();
        myTank.setGasLevel(40);
    }

    @Test
    public void testAddSomeGas(){
        myTank.addGass(10);
        myGas = myTank.getGasLevel();
        assertEquals((double)50, myGas, 0);
    }

    @Test
    public void testAddToFullTank(){
        myTank.addGass(20);
        myGas = myTank.getGasLevel();
        assertEquals((double)60, myGas, 0);
    }

    @Test
    public void testAddALotOfGas(){
        myTank.addGass(30);
        myGas = myTank.getGasLevel();
        assertEquals((double)60, myGas, 0);
    }

    @Test
    public void testAddNegativeGas(){
        myTank.addGass(-10);
        myGas = myTank.getGasLevel();
        assertEquals((double)40, myGas, 0);
    }

}
