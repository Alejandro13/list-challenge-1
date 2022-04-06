package com.ibm.academy.patterns.estructurales.decorator.exercise;

public class Normal implements Cafe{
    @Override
    public void description() {
        System.out.println("Este es un cafe NORMAL");
    }

    @Override
    public void precio() {
        System.out.println("El precio del cafe NORMAL ES DE $45");
    }
}
