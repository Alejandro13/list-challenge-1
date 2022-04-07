package com.ibm.academy.patterns.estructurales.facade;

public class Silver implements ICredit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta tiene un credito de 200 mil pesos");
    }
}
