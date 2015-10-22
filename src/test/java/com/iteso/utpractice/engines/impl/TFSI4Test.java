package com.iteso.utpractice.engines.impl;
import com.iteso.utpractice.gasTanks.iGasTank;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;



/**
 * Created by rvillalobos on 9/15/14.
 */
public class TFSI4Test {
    //int started;

    TFSI4 myEngine;
    iGasTank myTank;


    @Before
    public void setUp(){

        myEngine = new TFSI4();
        //started=0;
        myTank = mock(iGasTank.class);
        myEngine.setGasTank(myTank);


    }

    @Test
    public void testEngineStartTrue(){
        /*
        myEngine.setGas(6);
        //started = myEngine.start();
        //usamos esto en lugar de la llamada en los asserts por limpieza
        */


        when(myTank.gestGasLevel()).thenReturn((float) 10);
        assertEquals(1, myEngine.start());
        //lo esperado y lo recibido, espero un 1 y recibi un started en el caso de
        //haber usado el metodo comentsdo



    }

    @Test
    public void testEngineStartFalse(){
        /*
        myEngine.setGas(0); */
        when(myTank.gestGasLevel()).thenReturn((float) 0);


        assertEquals(0, myEngine.start());
    }

    @Test
    public void testEngineStartInvalid(){

        /*
        myEngine.setGas(-1);

        */
        when(myTank.gestGasLevel()).thenReturn((float) 10);

        assertEquals(-1, myEngine.start());
    }

}
