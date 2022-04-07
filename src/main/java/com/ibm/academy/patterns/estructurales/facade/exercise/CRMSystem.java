package com.ibm.academy.patterns.estructurales.facade.exercise;

public class CRMSystem implements ISystem{
    @Override
    public void doSomething() {
        System.out.println("Cambiando el Status");
    }
}
