package com.ibm.academy.patterns.estructurales.facade.exercise;

public class EmailSystem implements ISystem{
    @Override
    public void doSomething() {
        System.out.println("Enviar un Email");
    }
}
