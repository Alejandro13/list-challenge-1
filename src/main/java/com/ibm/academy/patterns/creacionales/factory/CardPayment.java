package com.ibm.academy.patterns.creacionales.factory;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con tarjeta de débito");
    }
}
