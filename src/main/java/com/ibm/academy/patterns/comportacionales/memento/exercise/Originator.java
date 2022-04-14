package com.ibm.academy.patterns.comportacionales.memento.exercise;

public class Originator {
    private String nombre;
    private String apellido;

    public Originator(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Memento createMemento(){
        Memento memento = new Memento(nombre,apellido);
        return memento;
    }

    public void restoreMemento(Memento memento){
        //Obtenemos los valores que teniamos previamente
        this.nombre = memento.getNombre();
        this.apellido = memento.getApellido();
    }

    //GET & SET

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
