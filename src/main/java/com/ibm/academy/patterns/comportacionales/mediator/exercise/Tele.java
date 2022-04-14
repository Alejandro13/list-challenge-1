package com.ibm.academy.patterns.comportacionales.mediator.exercise;

public class Tele extends Aparato {

    public Tele(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void encender() {
        mediator.encender();
        System.out.println("Encendiendo Televisión");
    }

    @Override
    public void apagar() {
        mediator.apagar();
        System.out.println("Apagando Televisón");
    }
}
