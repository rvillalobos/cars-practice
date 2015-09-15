package com.iteso.utpractice.Bluetooth;

import com.iteso.utpractice.Car;

/**
 * Created by Paloma on 15/09/2015.
 */
public interface iBluetooth {

    public boolean isConnected();
    public String Connect(Car car);
    public String Disconnect(Car car);
}
