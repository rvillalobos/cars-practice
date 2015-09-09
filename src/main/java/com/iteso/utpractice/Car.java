package com.iteso.utpractice;

import com.iteso.utpractice.engines.iEngine;
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
    private iEngine engine;

    public Car(iEngine engine) {
        this.engine = engine;
    }

    public abstract boolean startEngine();

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public boolean isCarKeys() {
        return carKeys;
    }

    public void setCarKeys(boolean carKeys) {
        this.carKeys = carKeys;
    }

    public iEngine getEngine() {
        return engine;
    }

    public void setEngine(iEngine engine) {
        this.engine = engine;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }
}
