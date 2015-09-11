package com.iteso.utpractice.cars;

import com.iteso.utpractice.Car;
import com.iteso.utpractice.engines.iEngine;
/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/3/13
 * Time: 1:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class AudiA4 extends Car {

    public AudiA4(iEngine engine) {
        super(engine);
    }

    @Override
    public boolean startEngine() {
        if (isCarKeys()) {

                if (getEngine().start() == 1) {
                    setEngineStarted(true);
                    return true;
                } else {
                    setEngineStarted(false);
                    return false;
                }

        }
        return false;
    }
}

