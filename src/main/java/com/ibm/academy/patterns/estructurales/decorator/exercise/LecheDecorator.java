package com.ibm.academy.patterns.estructurales.decorator.exercise;

public class LecheDecorator extends AdicionalesDecorator{
    public LecheDecorator(Cafe decoratedAdicional) {
        super(decoratedAdicional);
    }

    @Override
    public void description() {
        decoratedAdicional.description();
        configLeche();
    }

    @Override
    public void precio() {
        super.precio();
    }

    private void configLeche(){
        System.out.println("El cafe SI tiene LECHE");
    }
}
