package com.ibm.academy.patterns.estructurales.decorator;

public class SecureDecorator extends CreditDecorator{ //heradamos de la base
    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configSecure();
    }

    private void configSecure(){
        System.out.println("La tarjeta ha sido configurada con SEGURIDAD MAXIMA");
    }
}
