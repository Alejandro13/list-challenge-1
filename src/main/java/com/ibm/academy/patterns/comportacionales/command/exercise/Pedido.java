package com.ibm.academy.patterns.comportacionales.command.exercise;

public class Pedido {
    private int peso;
    private boolean urgente;

    public Pedido(int peso) {
        this.peso = peso;
        //this.urgente = urgente;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isUrgent( ){
        // (MAX - MIN + 1)) + MIN;
        int numero = (int) (Math.random() *(1-0+1) +0 );

        if(numero == 0){
            //No es urgente
            return false;
        }else{
            //Es urgente
            return true;
        }
        //return true;
    }
}
