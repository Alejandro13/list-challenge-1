package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class AlumnosNoSQLRepository implements AlumnosRepository{
    @Override
    public String[] listaAlumnos() {
        String[] alumnos = { "Pepe", "Karla", "Maria"};
        return  alumnos;
    }
}
