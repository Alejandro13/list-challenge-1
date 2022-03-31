package com.ibm.academy.patterns.creacionales.prototype;

public interface PrototypeCard extends Cloneable {

    //Método que regresa prototype, verifica si al momento de clonar existe algun error
    PrototypeCard clone() throws CloneNotSupportedException;

    //Método para saber que tipo de tarjeta estoy clonando
    void getCard();
}
