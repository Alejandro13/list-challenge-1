package com.ibm.academy.patterns.comportacionales.iterator.exercise;



public class CadenaLista implements Lista{

    private Cadena[] cadena;

    public CadenaLista(Cadena[] cadena) {
        this.cadena = cadena;
    }

    @Override
    public Iterator iterator() {
        return new CadenaIterator(cadena);
    }
}
