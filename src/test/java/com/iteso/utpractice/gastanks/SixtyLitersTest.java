package com.iteso.utpractice.gastanks;
import com.iteso.utpractice.gastanks.impl.FortyLiters;
import com.iteso.utpractice.gastanks.impl.SixtyLiters;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 08/09/2015.
 */
public class SixtyLitersTest
{

    SixtyLiters myGasTank;
    double finalGas;

    @Before
    public void setUp()
    {
        myGasTank = new SixtyLiters();
        myGasTank.setGasLevel(10);
    }

    @Test
    public void testRegularAddGas()
    {
        myGasTank.addGass(10);
        finalGas = myGasTank.getGasLevel();
        assertEquals(20, finalGas, 0.001);
    }


    @Test
    public void testOverflowGasAdd()
    {
        myGasTank.setGasLevel(50);
        myGasTank.addGass(15);
        finalGas = myGasTank.getGasLevel();
        assertEquals(10, finalGas, 0.001);
    }

    @Test
    public void testZeroLiters()
    {
        myGasTank.addGass(0);
        finalGas = myGasTank.getGasLevel();
        assertEquals(10, finalGas, 0.001);
    }

    @Test
    public void testMinusLiters()
    {
        myGasTank.addGass(-5);
        finalGas = myGasTank.getGasLevel();
        assertEquals(10, finalGas, 0.001);
    }

    @Test
    public void testGasLevelHigherThanGasCapacity()
    {
        myGasTank.setGasLevel(61);
        myGasTank.addGass(1);
        finalGas = myGasTank.getGasLevel();
        assertEquals(61, finalGas, 0.001);
    }
}
