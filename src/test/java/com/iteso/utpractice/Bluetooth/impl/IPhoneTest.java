package com.iteso.utpractice.Bluetooth.impl;
import com.iteso.utpractice.Car;
import com.iteso.utpractice.cars.AudiA4;
import com.iteso.utpractice.engines.impl.TFSI4;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 15/09/2015. interfaces _X, iX, implentacion Xfsdgs
 */

public class IPhoneTest {
    private TFSI4 tfsi4 = new TFSI4();
    private Car Gol = new AudiA4(tfsi4);
    private IPhone iPhone_Ana = new IPhone();
    private IPhone iPhone_Juan = new IPhone();
    String result;

    @Test
    public void TestConnect_Yes(){
    // Si se puede conectar
        result = iPhone_Juan.Connect(Gol);
        assertEquals("Connected Successfully", result);
    }

    @Test
    public void TestConnect_DeviceAlreadyConnected(){
        // Ya está ese dispositivo conectado
        result = iPhone_Juan.Connect(Gol);
        result = iPhone_Juan.Connect(Gol);
        assertEquals("Device already connected", result);
    }

    @Test
    public void TestConnect_AnotherDeviceIsAlreadyConnected(){
        // Ya hay dispositivo conectado
        result = iPhone_Juan.Connect(Gol);
        result = iPhone_Ana.Connect(Gol);
        assertEquals("Another device already connected", result);
    }

    @Test
    public void TestDisconnect_Yes(){
        // Sí se pudo desconectar
        result = iPhone_Juan.Connect(Gol);
        result = iPhone_Juan.Disconnect(Gol);
        assertEquals("Disconnected Successfully", result);
    }


    @Test
    public void TestDisconnect_NothingToDisconnect(){
        // No se pudo desconectar porque no hay nada conectado
        result = iPhone_Juan.Disconnect(Gol);
        assertEquals("No device to disconnect", result);
    }


}
