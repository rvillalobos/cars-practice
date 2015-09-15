package com.iteso.utpractice.Gas;

import com.iteso.utpractice.gastanks.impl.FortyLiters;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jose luis on 14/09/2015.
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
    public void testAddGas(){
        myTank.addGas(10);
        myGas = myTank.getGasLevel();
        assertEquals((double)38, myGas, 0);
    }




    @Test
    public void testFullTank(){
        myTank.addGas(10);
        myGas = myTank.getGasLevel();
        assertEquals((double)40, myGas, 0);
    }


    @Test
    public void testLotOfGas(){
        myTank.addGas(35);
        myGas = myTank.getGasLevel();
        assertEquals((double)40, myGas, 0);
    }


    @Test
    public void testNegativeGas(){
        myTank.addGas(-1);
        myGas = myTank.getGasLevel();
        assertEquals((double) 35, myGas, 0);
    }


}