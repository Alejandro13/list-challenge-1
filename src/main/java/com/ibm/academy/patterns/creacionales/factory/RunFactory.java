package com.ibm.academy.patterns.creacionales.factory;

public class RunFactory {
    public static void main(String[] args) {
        //usamos la interfaz
        Payment paymentCard = PaymentFactory.buildPayment(TypePayment.CARD);
        paymentCard.doPayment();

        Payment paymentGoogle = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
        paymentGoogle.doPayment();
    }
}
