package com.ibm.academy.patterns.comportacionales.state.exercise;

public class Semaforo {
    private EstadoSemaforo actualEstado;

    //Constructor
    public Semaforo() {
        this.actualEstado = new EstadoRojo();
    }

    //Solo necesitamos el set
    public void setActualEstado(EstadoSemaforo actualEstado) {
        this.actualEstado = actualEstado;
    }

    public void mostrar(){
        actualEstado.mostrar();
    }


}
