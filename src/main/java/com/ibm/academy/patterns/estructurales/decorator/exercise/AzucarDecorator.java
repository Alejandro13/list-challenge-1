package com.ibm.academy.patterns.estructurales.decorator.exercise;

public class AzucarDecorator extends AdicionalesDecorator{
    public AzucarDecorator(Cafe decoratedAdicional) {
        super(decoratedAdicional);
    }

    @Override
    public void description() {
        decoratedAdicional.description();
        configAzucar();
    }

    @Override
    public void precio() {
        super.precio();
    }

    private void configAzucar(){
        System.out.println("El cafe SI tiene AZUCAR");
    }
}
