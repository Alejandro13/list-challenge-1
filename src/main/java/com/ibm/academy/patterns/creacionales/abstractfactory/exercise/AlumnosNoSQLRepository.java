package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

/**
 * Implemento CursosRepository para poder utilizar en NoSQLFactory
 * pueda devolver una instancia de AlumnosNoSQLRepository();
 */
public class AlumnosNoSQLRepository implements AlumnosRepository, CursosRepository {
    @Override
    public String[] listaAlumnos() {
        String[] alumnos = { "Ana", "Karla", "Maria"};
        return  alumnos;
    }

    //No es necesario cambiar la implementación del método
    @Override
    public String[] listaCursos() {
        return new String[0];
    }
}
