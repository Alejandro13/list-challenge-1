package com.ibm.academy.patterns.comportacionales.command;

public class CreditCardInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //Método para ejecutar el comando
    public void run(){
        command.execute();
    }
}
