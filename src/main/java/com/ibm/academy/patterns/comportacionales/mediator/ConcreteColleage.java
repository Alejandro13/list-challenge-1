package com.ibm.academy.patterns.comportacionales.mediator;

public class ConcreteColleage extends Colleage{

    //Constructor para que no marque error
    public ConcreteColleage(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("Colega 1 ha recibido el siguiente mensaje: " + message);
    }
}
