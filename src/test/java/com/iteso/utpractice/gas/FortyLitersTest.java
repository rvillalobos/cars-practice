package com.iteso.utpractice.gas;

import com.iteso.utpractice.gastanks.impl.FortyLiters;
import com.iteso.utpractice.gastanks.iGasTank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by GeraCruz on 08/09/15.
 */
public class FortyLitersTest {
    FortyLiters myTank;
    iGasTank Tank;
    int tank;


    @Before
    public void setUp(){
        myTank = new FortyLiters();

    }

    @Test
    public void testSetGasLevel(){

    }

    @Test
    public void testAddGas(){
        myTank.addGas(40);
    }
}
