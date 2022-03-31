package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class CursoRelacionalRepository implements  CursosRepository{
    @Override
    public String[] listaCursos() {
        String[] cursos = {"SQL", "MYSQL", "DB2"};
        return  cursos;
    }
}
