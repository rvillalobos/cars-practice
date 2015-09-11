package com.iteso.utpractice.cars;


import com.iteso.utpractice.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import com.iteso.utpractice.engines.iEngine;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/3/13
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class AudiA4Test {

    private com.iteso.utpractice.engines.iEngine engine;
    private Car audiA4;

    @Before
    public void setUp(){

        engine = mock(iEngine.class); // Es una clase falsa con el mock
        audiA4 = new AudiA4(engine);
        audiA4.setCarKeys(true);
    }

    @Test
    public void testEngineStarted(){

        when(engine.start()).thenReturn(1); // cuando se ejecute el metodo start que siempre retorne 1, funcion de mockkito
        // Este metodo

        boolean started = audiA4.startEngine();

        assertTrue(started);
        assertTrue(audiA4.isEngineStarted());

    }

    @Test
    public void testEngineNotStarted(){
        when(engine.start()).thenReturn(0);

        boolean started = audiA4.startEngine();

        assertFalse(started); //verifica que esa variable sea falta con el assertFalse
        assertFalse(audiA4.isEngineStarted());
        verify(engine).start(); // verify es de mockito, que verifique se haya llamada a la funcion .start() porque en la clase
    //        AUDiA4 hhay 2 opciones que te devuelve falso


    }

    @Test
    public void testEngineNotStartedWhenError(){
        when(engine.start()).thenReturn(-1);

        boolean started = audiA4.startEngine();

        assertFalse(started);
        assertFalse(audiA4.isEngineStarted());
        verify(engine).start();


    }

    @Test
    public void cantStartIfThereAreNoKeys(){
        audiA4.setCarKeys(false);
        boolean started = audiA4.startEngine();

        assertFalse(started);
        verify(engine, never()).start(); // verfica que nunca se haya llamado el metodo .start()
    }

    @After
    public void tearDown(){

    }
}
