package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class AlumnosRelacionalRepository implements AlumnosRepository{
    @Override
    public String[] listaAlumnos() {
        String[] alumnos = { "Alex", "Carlos", "Pablo"};
        return  alumnos;
    }
}
