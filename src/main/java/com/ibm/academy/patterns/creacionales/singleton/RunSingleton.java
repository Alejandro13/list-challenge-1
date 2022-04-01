package com.ibm.academy.patterns.creacionales.singleton;

public class RunSingleton {
    public static void main(String[] args) {
        Card.getINSTANCE().setCarNumber("000 777 555");
        System.out.println("Obteniendo el número de tarjeta");
        System.out.println(Card.getINSTANCE().getCarNumber());
    }
}
