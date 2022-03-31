package com.ibm.academy.patterns.creacionales.factory.exercise;

public class SedanCar implements PaymentCar{
    @Override
    public void contruct() {
        System.out.println("Construyendo un SedanCar");
    }
}
