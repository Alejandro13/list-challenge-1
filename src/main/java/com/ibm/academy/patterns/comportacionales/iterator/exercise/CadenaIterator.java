package com.ibm.academy.patterns.comportacionales.iterator.exercise;



public class CadenaIterator implements Iterator{

    private Cadena[] cadena;
    private int position;

    public CadenaIterator(Cadena[] cadena) {
        this.cadena = cadena;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(this.position >= cadena.length){
            return false;
        }
        return true; //puedes seguir recorriendo la lista
    }

    @Override
    public Object next() {
        return cadena[this.position++]; //El siguiente elemento
    }
}
