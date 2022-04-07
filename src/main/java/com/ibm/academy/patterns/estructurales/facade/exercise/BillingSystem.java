package com.ibm.academy.patterns.estructurales.facade.exercise;

public class BillingSystem implements ISystem{
    @Override
    public void doSomething() {
        System.out.println("Aplicando pago");
    }
}
