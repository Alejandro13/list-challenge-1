package com.ibm.academy.patterns.estructurales.decorator.exercise;

public class AdicionalesDecorator implements Cafe{

    protected  Cafe decoratedAdicional;

    public AdicionalesDecorator(Cafe decoratedAdicional){
        this.decoratedAdicional = decoratedAdicional;
    }

    @Override
    public void description() {
        decoratedAdicional.description();
    }

    @Override
    public void precio() {
        decoratedAdicional.precio();
    }
}
