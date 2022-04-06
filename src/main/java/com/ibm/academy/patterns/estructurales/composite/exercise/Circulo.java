package com.ibm.academy.patterns.estructurales.composite.exercise;

public class Circulo implements Grafico{

    private float radio;

    public Circulo(float radio){
        this.radio = radio;
    }

    @Override
    public void pintar() {
        System.out.println("Pintando un CIRCULO");
    }
}
