package com.ibm.academy.patterns.comportacionales.mediator;

public class RunMediator {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        //Creamos los componentes, pasamos el mediator para que se comuniquen entre ellos
        ConcreteColleage user1 = new ConcreteColleage(mediator);
        ConcreteColleage2 user2 = new ConcreteColleage2(mediator);

        //setear el usuario
        mediator.setUser1(user1);
        mediator.setUser2(user2);

        //usando la comunicación
        user1.send("Hola, soy el usuario 1, unas chelas! ");
        user2.send("Hola usuario 1, soy el usuario 2 y arre");
    }
}
