package com.ibm.academy.patterns.estructurales.decorator.exercise;

public class CremaDecorator extends AdicionalesDecorator{
    public CremaDecorator(Cafe decoratedAdicional) {
        super(decoratedAdicional);
    }

    @Override
    public void description() {
        decoratedAdicional.description();
        configCrema();
    }

    @Override
    public void precio() {
        //super.precio();
        System.out.println("El precio del cafe con CREMA es de: $65" );
    }

    private void configCrema(){
        System.out.println("El cafe SI tiene CREMA");
    }
}
