package com.ibm.academy.patterns.estructurales.decorator;

public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("El crédito es de 5 millones de pesos");
    }
}
