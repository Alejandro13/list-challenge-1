package com.ibm.academy.patterns.creacionales.prototype;

public class Amex implements PrototypeCard{

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Tarjeta de American Express clonada");
        //Un cast para regresar el prototipo de tarjeta de tipo American Express
        return (Amex) super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("Esta es una tarjeta de American Express");
    }
}
