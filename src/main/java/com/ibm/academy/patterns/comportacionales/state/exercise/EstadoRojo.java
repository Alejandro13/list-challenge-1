package com.ibm.academy.patterns.comportacionales.state.exercise;

public class EstadoRojo implements EstadoSemaforo{
    @Override
    public void mostrar() {
        System.out.println("El semaforo está en color ROJO");
    }
}
