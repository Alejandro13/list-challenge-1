package com.ibm.academy.patterns.estructurales.decorator;

//Base del decorator
public class CreditDecorator implements Credit{

    protected Credit decoratedCredit;


    public CreditDecorator(Credit decoratedCredit){
        this.decoratedCredit = decoratedCredit;
    }

    @Override
    public void showCredit() {
        this.decoratedCredit.showCredit();
    }
}
