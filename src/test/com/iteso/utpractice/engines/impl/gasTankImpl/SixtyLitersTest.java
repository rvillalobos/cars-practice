package com.iteso.utpractice.engines.impl.gasTankImpl;

import com.iteso.utpractice.engines.gastanks.impl.FortyLiters;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoseFranco on 08/09/2015.
 */
public class SixtyLitersTest {
    FortyLiters mySixtyLiters;


    @Before
    public void setUp(){

        mySixtyLiters = new FortyLiters();
        mySixtyLiters.setGasLevel(0);
    }

    @Test
    public void testTankWhenAddMoreThanCapacity(){

        mySixtyLiters.addGas(mySixtyLiters.getTankCapacity() + 6);
        assertEquals(mySixtyLiters.getTankCapacity(), (int) mySixtyLiters.getGasLevel());

    }
    @Test
    public void testTankWhenAddGasEqualsToCapacity(){
        mySixtyLiters.setGasLevel(mySixtyLiters.getTankCapacity()); // First put the full tank
        mySixtyLiters.addGas(6);// Add gas to the full tank (I supposed that I cant do it because)
        assertEquals(mySixtyLiters.getTankCapacity(), (int) mySixtyLiters.getGasLevel());

    }
    @Test
    public void testTankWhenAddGasLessThanCapacity(){
        mySixtyLiters.setGasLevel(10);
        mySixtyLiters.addGas(22);
        assertEquals(32, (int) mySixtyLiters.getGasLevel());
    }
    @Test
    public void testWhenAddGasNegative() {
        mySixtyLiters.addGas(-10);
        assertEquals(0, (int) mySixtyLiters.getGasLevel());
    }
}
