package com.ibm.academy.patterns.creacionales.abstractfactory;

public class RunAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactoryCard = ProviderFactory.getFactory("Card");
        Card tarjetaVIsa = (Card) abstractFactoryCard.create("VISA");

        AbstractFactory abstractFactoryPay = ProviderFactory.getFactory("PaymentMethod");
        PaymentMethod paymentDebit = (PaymentMethod) abstractFactoryPay.create("DEBIT");

        System.out.println(String.format("Una tarjeta de tipo %s con el método de pago %s ",
                tarjetaVIsa.getCardType(), paymentDebit.doPayment()));
    }
}
