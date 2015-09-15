package com.iteso.utpractice.airConditioner;
//import com.iteso.utpractice.airConditioner.airConditioner;
//import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sacrp on 9/15/15.
 */
public class airConditionerTest
{
    //TEMPERATURE SHOULD ALWAYS BE BETWEEN 18 AND 22 DEGREES

    airConditioner myConditioner;
    double idealTemperature;  //Asume ideal Temperatura can only have one decimal e.g {20.0 ... 20.9}

    @Before
    public void setUp()
    {
        myConditioner = new airConditioner();

        idealTemperature = 21.5;

        myConditioner.setCurrentConditionerTemperature(0);
        myConditioner.setIdealTemperature(idealTemperature);
    }


    // TEST WHEN TEMPERATURE IS ALREADY ON POINT
    @Test
    public void testOnPoint()
    {
        myConditioner.setInsideTemperature(21.5);
    }

    //TEST WHEN TEMPERATURE IS TOO HOT
    @Test
    public void testTooHot()
    {
        myConditioner.setInsideTemperature(30);
    }

    //TEST WHEN TEMPERATURE IS TOO COLD
    @Test
    public void testTooCold()
    {
        myConditioner.setInsideTemperature(15);
    }


    @After
    public void testResults()
    {
        myConditioner.adjustAirTemperature(myConditioner.getIdealTemperature(), myConditioner.getInsideTemperature(), myConditioner.getCurrentConditionerTemperature());
        assertEquals(idealTemperature, myConditioner.finalTemperature(), 0.005);
    }

}
