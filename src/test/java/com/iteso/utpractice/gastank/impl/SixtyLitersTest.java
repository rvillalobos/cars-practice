package com.iteso.utpractice.gastank.impl;

import com.iteso.utpractice.gasTanks.impl.FortyLiters;
import com.iteso.utpractice.gasTanks.impl.SixtyLiters;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GeovaniSerrano on 9/8/15.
 */
public class SixtyLitersTest {
    SixtyLiters myTank;

    @Before
    public void setUp() {
        myTank = new SixtyLiters();
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
