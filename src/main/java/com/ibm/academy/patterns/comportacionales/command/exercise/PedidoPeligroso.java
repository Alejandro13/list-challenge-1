package com.ibm.academy.patterns.comportacionales.command.exercise;

public class PedidoPeligroso {

    private int peso;

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String instrucciones(){
        return "Es un pedido peligroso";
    }

}
