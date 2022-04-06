package com.ibm.academy.patterns.estructurales.decorator;

public class RunDecorator {
    public static void main(String[] args) {
        Credit gold = new Gold();

        Credit blackInternational = new Black();
        //agregamos la configuracion del decorator
        blackInternational = new InternationalPaymentDecorator(blackInternational);

        Credit goldWithSecureAndInternationalPayment = new Gold();
        //agregamos la configuracion del decorator
        goldWithSecureAndInternationalPayment = new SecureDecorator(goldWithSecureAndInternationalPayment);
        goldWithSecureAndInternationalPayment = new InternationalPaymentDecorator(goldWithSecureAndInternationalPayment);

        System.out.println("-------- TARJETA GOLD SIN CONFIGURACIÓN------");
        gold.showCredit();
        System.out.println("-------- TARJETA BLACK CON CONFIGURACIÓN------");
        blackInternational.showCredit();
        System.out.println("-------- TARJETA GOLD INTERNATIONAL CON CONFIGURACIÓN------");
        goldWithSecureAndInternationalPayment.showCredit();


    }
}
