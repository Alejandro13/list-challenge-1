package com.ibm.academy.patterns.creacionales.factory;

public class PaymentFactory {
    //Método que nos ayuda a crear objetos con los que vamos a pagar
    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case CARD:
                return new CardPayment();
            case GOOGLEPAY:
                return new GooglePayment();
            default:
                return new CardPayment();
        }

    }
}
