package com.ibm.academy.patterns.creacionales.factory.exercise;

public class LuxuryCar implements PaymentCar{
    @Override
    public void contruct() {
        System.out.println("Construyendo un LuxuryCar");
    }
}
