package com.ibm.academy.patterns.creacionales.factory.exercise;

public class RunCarFactory {
    public static void main(String[] args) {
        /**
         * //usamos la interfaz
         *         Payment paymentCard = PaymentFactory.buildPayment(TypePayment.CARD);
         *         paymentCard.doPayment();
         */
        PaymentCar contructSmall = CarFactory.buildCar(CarType.SMALL);
        contructSmall.contruct();

        PaymentCar constructSedan = CarFactory.buildCar(CarType.SEDAN);
        constructSedan.contruct();

        PaymentCar constructLuxury = CarFactory.buildCar(CarType.LUXURY);
        constructLuxury.contruct();
    }
}
