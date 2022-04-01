package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

/**
 * Implemento AlumnosRepository para poder utilizar en RelacionalFactory
 * pueda devolver una instancia de CursoRelacionalRepository();
 */

public class CursoRelacionalRepository implements  CursosRepository, AlumnosRepository{
    @Override
    public String[] listaCursos() {
        String[] cursos = {"SQL", "MYSQL", "DB2"};
        return  cursos;
    }

    //No es necesario cambiar la implementación del método
    @Override
    public String[] listaAlumnos() {
        return new String[0];
    }
}
