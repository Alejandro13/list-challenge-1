package com.ibm.academy.patterns.estructurales.facade;

import com.ibm.academy.patterns.estructurales.decorator.Credit;

public class RunFachada {
    public static void main(String[] args) {
        CreditMaker creditMaker = new CreditMaker();
        creditMaker.showCreditGold();
        creditMaker.showCreditBlack();
        creditMaker.showCreditSilver();
    }
}
