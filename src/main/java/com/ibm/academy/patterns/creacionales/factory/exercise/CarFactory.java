package com.ibm.academy.patterns.creacionales.factory.exercise;

public class CarFactory {
    //Con este método construimos los carros
    public static PaymentCar buildCar(CarType carType){
        switch (carType){
            case SMALL:
                return new SmallCar();
            case LUXURY:
                return new LuxuryCar();
            case SEDAN:
                return new SedanCar();
            default:
                return new SmallCar();
        }
    }
}
