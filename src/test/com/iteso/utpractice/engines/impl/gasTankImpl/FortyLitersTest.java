package com.iteso.utpractice.engines.impl.gasTankImpl;

import com.iteso.utpractice.engines.gastanks.iGasTank;
import com.iteso.utpractice.engines.gastanks.impl.FortyLiters;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by JoseFranco on 08/09/2015.
 */
public class FortyLitersTest  {
    FortyLiters myFortyLiters;


    @Before
    public void setUp(){

        myFortyLiters = new FortyLiters();
        myFortyLiters.setGasLevel(0);
    }

    @Test
    public void testTankWhenAddMoreThanCapacity(){

        myFortyLiters.addGas(myFortyLiters.getTankCapacity() + 6);
        assertEquals(myFortyLiters.getTankCapacity(), (int) myFortyLiters.getGasLevel());

    }
    @Test
    public void testTankWhenAddGasEqualsToCapacity(){
        myFortyLiters.setGasLevel(myFortyLiters.getTankCapacity()); // First put the full tank
        myFortyLiters.addGas(6);// Add gas to the full tank (I supposed that I cant do it because)
        assertEquals(myFortyLiters.getTankCapacity(), (int) myFortyLiters.getGasLevel());

    }
    @Test
    public void testTankWhenAddGasLessThanCapacity(){
        myFortyLiters.setGasLevel(10);
        myFortyLiters.addGas(22);
        assertEquals(32, (int) myFortyLiters.getGasLevel());
    }
    @Test
    public void testWhenAddGasNegative() {
        myFortyLiters.addGas(-10);
        assertEquals(0,(int) myFortyLiters.getGasLevel());
    }
}
