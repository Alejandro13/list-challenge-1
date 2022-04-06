package com.ibm.academy.patterns.estructurales.bridge.exercise;

public abstract class Vehiculo {

    protected IMotor motor;

    public Vehiculo(IMotor motor){
        this.motor = motor;
    }
    //Se agrega un método abstracto para relacionarlos con la interfaz y sus clases
    public abstract void mostrarCaracteristicas();
}
