package com.ibm.academy.patterns.comportacionales.mediator.exercise;

public abstract class Aparato {
    protected Mediator mediator;

    public Aparato(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void encender();
    public abstract void apagar();
}
