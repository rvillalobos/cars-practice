package com.iteso.utpractice.wheels.impl;

import com.iteso.utpractice.wheels.iWheels;

/**
 * Created by Carlos on 15/09/2015.
 */
public class BridgestoneWheels implements iWheels {
    private float pressure;
    private final int MAX_PRESSURE = 35;
    private final int MIN_PRESSURE = 22;

    public void setPressure(float pressure){
        this.pressure = pressure;
    }

    @Override
    public float getPressure(){
        return this.pressure;
    }

    @Override
    public String sendMessage(){
        String message = "The pressure is: ";
        message = message + this.pressure + ". ";
        if(getPressure() < 0)
            message = "ERROR: Impossible to get the pressure.";
        else if(getPressure() < 22)
            message = message + "You should add some air.";
        else if(getPressure() <= 35)
            message = message + "Your pressure is OK.";
        else
            message = message + "You should deflate your wheel.";
        return message;
    }
}
