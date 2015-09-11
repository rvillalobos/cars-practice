package com.iteso.utpractice.engines.impl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import com.iteso.utpractice.engines.impl.TFSI4;
import com.iteso.utpractice.gastanks.iGastTank;
import static org.mockito.Mockito.*;


import static org.junit.Assert.*;


/**
 * Created by rvillalobos on 9/15/14.
 */
public class TFSI4Test {
        TFSI4  myEngine;
        iGastTank myTank;
        int started;


    @Before
    public void setUp(){
        myEngine = new TFSI4();
        myTank= mock(iGastTank.class);
        myEngine.setGasTank(myTank);
        started=0;

    }

    @Test
    public void testEngineStartTrue(){

        when(myTank.getGasLevel()).thenReturn((float)10);

        myEngine.setGas(10);
       started =myEngine.start();
        assertEquals(1, started); // verifica que started sea igual a 1

    }

    @Test
    public void testEngineStartFalse(){
        when(myTank.getGasLevel()).thenReturn((float)0);

        myEngine.setGas(0);
        started =myEngine.start();
        assertEquals(0, started);


    }

    @Test
    public void testEngineStartInvalid(){

        when(myTank.getGasLevel()).thenReturn((float)-1);
        myEngine.setGas(-1);
        started =myEngine.start();
        assertEquals(-1, started);
    }

}
