package com.ibm.academy.patterns.creacionales.factory;

public class GooglePayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google payment");
    }
}
