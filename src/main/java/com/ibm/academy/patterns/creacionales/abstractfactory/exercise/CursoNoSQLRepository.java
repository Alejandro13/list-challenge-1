package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class CursoNoSQLRepository implements CursosRepository{
    @Override
    public String[] listaCursos() {
        String[] cursos = { "FIREBASE", "MONGODB"};
        return  cursos;
    }
}
