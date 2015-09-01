package com.iteso.utpractice.engines.impl;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/3/13
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class TFSI4 implements com.iteso.utpractice.engines.iEngine {
    private int gas;

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    @Override
    public int start(){
        int currentGas = getGas();
        if (currentGas > 0)
         return 1;
        else if (currentGas == 0)
         return 0;
        else {
            System.out.println("Impossible to get gas lecture");
            return -1;
        }
    }
}
