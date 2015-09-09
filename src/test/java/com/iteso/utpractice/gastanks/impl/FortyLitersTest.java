package com.iteso.utpractice.gastanks.impl;
import com.iteso.utpractice.gastanks.iGasTank;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;


/**
 * Created by Carlos on 08/09/2015.
 */
public class FortyLitersTest{
    FortyLiters myTank;
    double myGas;

    @Before
    public void setUp(){
        myTank = new FortyLiters();
        myTank.setGasLevel(30);
    }

    @Test
    public void testAddSomeGas(){
        myTank.addGass(5);
        myGas = myTank.getGasLevel();
        assertEquals((double)35, myGas, 0);
    }

    @Test
    public void testAddToFullTank(){
        myTank.addGass(10);
        myGas = myTank.getGasLevel();
        assertEquals((double)40, myGas, 0);
    }

    @Test
    public void testAddALotOfGas(){
        myTank.addGass(20);
        myGas = myTank.getGasLevel();
        assertEquals((double)40, myGas, 0);
    }

    @Test
    public void testAddNegativeGas(){
        myTank.addGass(-5);
        myGas = myTank.getGasLevel();
        assertEquals((double)30, myGas, 0);
    }

}
