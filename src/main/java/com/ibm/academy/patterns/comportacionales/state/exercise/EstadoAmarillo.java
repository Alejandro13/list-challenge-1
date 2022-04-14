package com.ibm.academy.patterns.comportacionales.state.exercise;

public class EstadoAmarillo implements EstadoSemaforo{
    @Override
    public void mostrar() {
        System.out.println("El semaforo está en color AMARILLO");
    }
}
