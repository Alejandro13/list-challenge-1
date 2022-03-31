package com.ibm.academy.patterns.creacionales.abstractfactory;

public class Debit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Pago con Débito";
    }
}
