package com.ibm.academy.patterns.comportacionales.memento.exercise;

public class CareTaker {

    public Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
