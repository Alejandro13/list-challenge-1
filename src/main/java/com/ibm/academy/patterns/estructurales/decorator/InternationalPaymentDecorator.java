package com.ibm.academy.patterns.estructurales.decorator;

public class InternationalPaymentDecorator extends CreditDecorator{
    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
       decoratedCredit.showCredit();
       configSecure();
    }

    private void configSecure(){
        System.out.println("La tarjeta ha sido configurada para PAGOS INTERNACIONALES");
    }
}
