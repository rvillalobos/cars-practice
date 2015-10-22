package com.iteso.utpractice.engines.impl;
import com.iteso.utpractice.gasTanks.iGasTank;


/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/3/13
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class TFSI4 implements com.iteso.utpractice.engines.iEngine {
    //esta clase es del tipo iengine, osea que implementa todos los metodos
    //de iengine
    //private int gas; //parte 1 d ela practica

    private iGasTank gasTank;

    //cambiamos int por float
    public float  getGas() {

        // return gas; //P1
        float myGasLevel=gasTank.gestGasLevel();
        return myGasLevel;
     }

    public void setGas(float gas) {
      //P1  this.gas = gas;
        getGasTank().addGass(gas);

    }

    @Override
    public int start(){


      float currentGas = getGas();
        if (currentGas > 0)
         return 1;
        else if (currentGas == 0)
         return 0;
        else {
            System.out.println("Impossible to get gas lecture");
            return -1;
        }
    }

    public iGasTank getGasTank(){
        return  gasTank;
    }

    public void setGasTank (iGasTank gasTank){
        this.gasTank = gasTank;
    }
}
