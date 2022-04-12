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
        //super.precio();
        System.out.println("El precio del cafe con CREMA es de: $70" );
    }

    private void configLeche(){
        System.out.println("El cafe SI tiene LECHE");
    }
}
