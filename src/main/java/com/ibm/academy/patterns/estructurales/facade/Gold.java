package com.ibm.academy.patterns.estructurales.facade;

public class Gold implements ICredit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta tiene un credito de 50 mill pesos");
    }
}
