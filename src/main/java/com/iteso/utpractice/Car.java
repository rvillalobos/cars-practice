package com.iteso.utpractice;

import com.iteso.utpractice.Bluetooth.iBluetooth;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/3/13
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Car {
    private boolean lights = false;
    private boolean carKeys = false;
    private boolean engineStarted = false;

    private com.iteso.utpractice.engines.iEngine engine;

    public Car(com.iteso.utpractice.engines.iEngine engine) {
        this.engine = engine;
    }

    public abstract boolean startEngine();

    public com.iteso.utpractice.engines.iEngine getEngine() {
        return engine;
    }

    public void setEngine(com.iteso.utpractice.engines.iEngine engine) {
        this.engine = engine;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    /////////////////////////////

    public com.iteso.utpractice.Bluetooth.iBluetooth bluetooth;

    public Car (com.iteso.utpractice.Bluetooth.iBluetooth bluetooth) {this.bluetooth = bluetooth;}

    /////////////////////////////

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    /////////////////////////////

    public boolean isCarKeys() {
        return carKeys;
    }

    public void setCarKeys(boolean carKeys) {
        this.carKeys = carKeys;
    }


}
