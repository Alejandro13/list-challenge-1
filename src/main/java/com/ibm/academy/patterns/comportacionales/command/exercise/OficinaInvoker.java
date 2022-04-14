package com.ibm.academy.patterns.comportacionales.command.exercise;

public class OficinaInvoker {
    private TratamientoPedido command;



    public void setCommand(TratamientoPedido command) {
        this.command = command;
    }

    //Método para ejecutar el comando
    public void run(){
        command.tratar();
    }
}
