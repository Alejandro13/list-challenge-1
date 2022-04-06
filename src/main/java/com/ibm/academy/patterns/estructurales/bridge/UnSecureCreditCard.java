package com.ibm.academy.patterns.estructurales.bridge;

public class UnSecureCreditCard implements ICreditCard{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado sin seguridad");
    }
}
