package com.ibm.academy.patterns.comportacionales.mediator.exercise;

public class Lampara extends Aparato{

    public Lampara(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void encender() {
        mediator.encender();
        System.out.println("Encendiendo Lámpara");
    }

    @Override
    public void apagar() {
        mediator.apagar();
        System.out.println("Apagando Lámpara");
    }
}
