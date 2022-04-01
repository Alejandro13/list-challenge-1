package com.ibm.academy.patterns.estructurales.adapter;

public class GoldenCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        //no implementamos
    }

    @Override
    public void payWithSecureLevelZ() {
        //Se implementa seguridad baja
        System.out.println("Tarjeta Gold: pagando con seguridad BAJA");
    }
}
