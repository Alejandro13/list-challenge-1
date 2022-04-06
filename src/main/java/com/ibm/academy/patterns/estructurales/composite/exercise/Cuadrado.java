package com.ibm.academy.patterns.estructurales.composite.exercise;

public class Cuadrado implements Grafico {
    private float lado;

    public Cuadrado(float lado){
        this.lado = lado;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando un CUADRADO");
    }
}
