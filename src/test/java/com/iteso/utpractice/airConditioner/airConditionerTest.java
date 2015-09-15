package com.iteso.utpractice.airConditioner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sacrp on 9/15/15.
 */
public class airConditionerTest
{
    //TEMPERATURE SHOULD ALWAYS BE BETWEEN 18 AND 22 DEGREES

    airConditioner myConditioner;


    double insideTemperature; //current temperature inside car
    double currentConditionerTemperature;
    double idealTemperature;
    double currentAirTemperature;

    @Before
    public void setUp()
    {
        myConditioner = new airConditioner();
        currentConditionerTemperature = 0;
        idealTemperature = 21.5;
        setIdealTemperature(idealTemperature);
    }

    // TEST WHEN TEMPERATURE IS ALREADY ON POINT
    @Test
    public void testOnPoint()
    {
        insideTemperature  = 21.5;

        setInsideTemperature(insideTemperature);
        adjustAirTemperature(getIdealTemperature(), getInsideTemperature(), getCurrentConditionerTemperature());
        currentAirTemperature = getAirTemperature();
        assertEquals(idealTemperature, finalTemperature(), 0.005);
    }


    //TEST WHEN TEMPERATURE IS TOO HOT
    @Test
    public void testTooHot()
    {
        insideTemperature = 30;

        setInsideTemperature(insideTemperature);
        adjustAirTemperature(getIdealTemperature(), getInsideTemperature(), getCurrentConditionerTemperature());
        currentAirTemperature = getAirTemperature();
        assertEquals(idealTemperature, finalTemperature(), 0.005);
    }

    //TEST WHEN TEMPERATURE IS TOO COLD

    @Test
    public void testTooCold()
    {
        insideTemperature = 15;
        
        setInsideTemperature(insideTemperature);
        adjustAirTemperature(getIdealTemperature(), getInsideTemperature(), getCurrentConditionerTemperature());
        currentAirTemperature = getAirTemperature();
        assertEquals(idealTemperature, finalTemperature(), 0.005);
    }
}
