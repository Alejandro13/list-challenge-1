package com.ibm.academy.patterns.estructurales.decorator.exercise;

public class Descafeinado implements Cafe{
    @Override
    public void description() {
        System.out.println("Este es un cafe DESCAFEINADO");
    }

    @Override
    public void precio() {
        System.out.println("El precio del cafe DESCAFEINADO ES DE $60");
    }
}
