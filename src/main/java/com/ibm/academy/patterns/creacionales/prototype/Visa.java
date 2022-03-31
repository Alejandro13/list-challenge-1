package com.ibm.academy.patterns.creacionales.prototype;

public class Visa implements PrototypeCard{

    private String name;
    //Get & set
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Tarjeta VISA clonada");
        return (Visa) super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("Esta es una tarjeta VISA");
    }
}
