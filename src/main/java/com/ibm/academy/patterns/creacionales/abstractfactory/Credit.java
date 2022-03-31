package com.ibm.academy.patterns.creacionales.abstractfactory;

public class Credit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Pago con CREDITO";
    }
}
