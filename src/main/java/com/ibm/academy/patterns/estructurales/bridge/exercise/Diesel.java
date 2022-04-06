package com.ibm.academy.patterns.estructurales.bridge.exercise;

public class Diesel implements IMotor{
    @Override
    public void inyectarCombustible(double diesel) {
        System.out.println("Se ha cargado " + diesel + " de DIESEL");

    }

    @Override
    public void cosumirGasolina() {
        System.out.println("CONSUMIENDO DIESEL");
    }
}
