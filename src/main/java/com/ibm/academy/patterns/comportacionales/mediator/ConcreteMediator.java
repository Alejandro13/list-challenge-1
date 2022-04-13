package com.ibm.academy.patterns.comportacionales.mediator;

public class ConcreteMediator implements Mediator{

    private ConcreteColleage user1;
    private ConcreteColleage2 user2;

    //Solo necesitamos los set
    public void setUser1(ConcreteColleage user1) {
        this.user1 = user1;
    }

    public void setUser2(ConcreteColleage2 user2) {
        this.user2 = user2;
    }

    @Override
    public void send(String message, Colleage colleage) {
        //Aqui nos comunicamos entre los componentes
        if(colleage == user1){
            user2.messageReceived(message);
        }else if(colleage == user2){
            user1.messageReceived(message);
        }
    }
}
