package com.ibm.academy.patterns.estructurales.composite.exercise;

public class Triangulo implements Grafico{
    private float base;
    private float altura;

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando un TRIANGULO");
    }
}
