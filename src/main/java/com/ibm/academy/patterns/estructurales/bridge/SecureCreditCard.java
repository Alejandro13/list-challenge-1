package com.ibm.academy.patterns.estructurales.bridge;

public class SecureCreditCard implements ICreditCard{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con Seguridad");
    }
}
