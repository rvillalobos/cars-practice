package com.iteso.utpractice.gastanks;
import com.iteso.utpractice.gastanks.impl.FortyLiters;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 08/09/2015.
 */
public class FortyLitersTest
{

    FortyLiters myGasTank;
    double finalGas;

    @Before
    public void setUp()
    {
        myGasTank = new FortyLiters();
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
        myGasTank.setGasLevel(30);
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
        myGasTank.setGasLevel(41);
        myGasTank.addGass(1);
        finalGas = myGasTank.getGasLevel();
        assertEquals(41, finalGas, 0.001);
    }
}
