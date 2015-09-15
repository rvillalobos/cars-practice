package com.iteso.utpractice.Bluetooth.impl;

import com.iteso.utpractice.Bluetooth.iBluetooth;
import com.iteso.utpractice.Car;

/**
 * Created by Paloma on 15/09/2015.
 */
public class IPhone implements iBluetooth {


    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public String Connect(Car car) {
        return null;
    }

    @Override
    public String Disconnect(Car car) {
        return null;
    }
}
