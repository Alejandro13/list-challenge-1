package com.ibm.academy.patterns.estructurales.composite.exercise;

public class RunGrafico {

    public static void main(String[] args) {
        Grafico circulo = new Circulo(600.00f);
        Grafico cuadrado = new Cuadrado(5.0f);
        Grafico triangulo = new Triangulo(2f,5f);

        GrupoDeImagenes imagenes = new GrupoDeImagenes();
        imagenes.addGrafico(circulo);
        imagenes.addGrafico(cuadrado);
        imagenes.addGrafico(triangulo);

        imagenes.pintar();

    }



}
