package com.ibm.academy.patterns.estructurales.decorator.exercise;

public class RunCafe {
    public static void main(String[] args) {
        Cafe normal = new Normal();
        Cafe descafeinado = new Descafeinado();

        Cafe normal2 = new Normal();
        Cafe descafeinado2 = new Descafeinado();

        normal2 = new LecheDecorator(normal2);
        normal2 = new CremaDecorator(normal2);

        descafeinado2 = new LecheDecorator(descafeinado2);
        descafeinado2 = new AzucarDecorator(descafeinado2);

        System.out.println("-------- CAFE NORMAL SIN CONFIGURACIÓN------");
        normal.description();
        normal.precio();
        System.out.println("-------- CAFE DESCAFEINADO SIN CONFIGURACIÓN------");
        descafeinado.description();
        descafeinado.precio();
        System.out.println("-------- CAFE NORMAL CON LECHE Y CREMA------");
        normal2.description();
        System.out.println("-------- CAFE DESCAFEINADO CON LECHE Y AZUCAR------");
        descafeinado2.description();

    }
}
