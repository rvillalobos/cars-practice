package com.iteso.utpractice.gastank.impl;

import com.iteso.utpractice.gasTanks.iGasTank;
import com.iteso.utpractice.gasTanks.impl.FortyLiters;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by GeovaniSerrano on 9/8/15.
 */
public class FortyLitersTest {
    FortyLiters myTank;

    @Before
    public void setUp() {
        myTank = new FortyLiters();
        myTank.setGasLevel(0);
    }

    @Test
    public void addGasMoreThanCapacity() {
        myTank.addGas(myTank.getTankCapacity() + 1);

        assertEquals(myTank.getTankCapacity(), (int) myTank.getGasLevel());
    }

    @Test
    public void GasLevelEqualsCapacity() {
        myTank.setGasLevel(myTank.getTankCapacity());
        myTank.addGas(10);


        assertEquals(myTank.getTankCapacity(), (int) myTank.getGasLevel());
    }

     @Test
    public void addGasLessThanCapacity() {
         myTank.setGasLevel(20);

         myTank.addGas((float) 10);

         assertEquals(30, (int) myTank.getGasLevel());
     }

    @Test
    public void addGasNegative() {
        float gasLevel = myTank.getGasLevel();

        myTank.addGas(-1);

        assertEquals((int) gasLevel, (int) myTank.getGasLevel());
    }
}
