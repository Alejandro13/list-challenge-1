package com.ibm.academy.patterns.comportacionales.mediator.exercise;

public class ConcreteMediator implements Mediator{

    private Tele tele;
    private Lampara lampara;

    //Solo necesitamos los set
    public void setTele(Tele tele) {
        this.tele = tele;
    }

    public void setLampara(Lampara lampara) {
        this.lampara = lampara;
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }
}
