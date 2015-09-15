package com.iteso.utpractice.wheels.impl;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos on 15/09/2015.
 */
public class BridgestoneWheelsTest {
    double pressure;
    BridgestoneWheels myWheels;

    @Before
    public void setUp(){
        pressure = 0;
        myWheels = new BridgestoneWheels();
    }

    @Test
    public void testHighPressure(){
        myWheels.setPressure((float)35.1);
        String result = myWheels.sendMessage();
        assertEquals("The pressure is: 35.1. You should deflate your wheel.", result);
    }
    @Test
    public void testLowPressure(){
        myWheels.setPressure((float) 21.9);
        String result = myWheels.sendMessage();
        assertEquals("The pressure is: 21.9. You should add some air.", result);
    }

    @Test
    public void testGoodPression(){
        myWheels.setPressure((float) 30);
        String result = myWheels.sendMessage();
        assertEquals("The pressure is: 30.0. Your pressure is OK.", result);
    }

    @Test
    public void testErrorGettingPressure(){
        myWheels.setPressure((float) -1);
        String result = myWheels.sendMessage();
        assertEquals("ERROR: Impossible to get the pressure.", result);
    }

}
