package com.ibm.academy.patterns.estructurales.bridge.exercise;

public class RunVehiculo {
    public static void main(String[] args) {
        Vehiculo gasolina = new Ford(new Gasolina());
        gasolina.mostrarCaracteristicas();

        Vehiculo diesel = new Ford(new Diesel());
        diesel.mostrarCaracteristicas();
    }
}
