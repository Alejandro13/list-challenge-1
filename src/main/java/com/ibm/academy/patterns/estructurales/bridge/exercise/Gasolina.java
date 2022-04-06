package com.ibm.academy.patterns.estructurales.bridge.exercise;

public class Gasolina implements IMotor{
    @Override
    public void inyectarCombustible(double gasolina) {
        System.out.println("Se ha cargado " + gasolina + " de GASOLINA");
    }

    @Override
    public void cosumirGasolina() {
        System.out.println("CONSUMIENDO GASOLINA");
    }
}
