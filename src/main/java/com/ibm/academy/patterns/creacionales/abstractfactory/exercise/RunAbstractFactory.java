package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

import java.util.Arrays;

public class RunAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory noRelacional = ProviderFactory.getFactory("NOSQL");
        CursosRepository cursoNOSQL = (CursosRepository) noRelacional.createRepositoryCursos();
        AlumnosRepository alumnosNOSQL = (AlumnosRepository) noRelacional.createRepositoryAlumnos();

        System.out.println(String.format("Los alumnos %s toman los siguientes cursos NO RELACIONALES %s ",
               Arrays.toString(alumnosNOSQL.listaAlumnos()), Arrays.toString(cursoNOSQL.listaCursos())));
        //System.out.println( Arrays.toString(cursoNOSQL.listaCursos()));
        //System.out.println( Arrays.toString(alumnosNOSQL.listaAlumnos()));

        AbstractFactory relacional = ProviderFactory.getFactory("SQL");
        CursosRepository cursoSQL = (CursosRepository) relacional.createRepositoryCursos();
        AlumnosRepository alumnosSQL = (AlumnosRepository) relacional.createRepositoryAlumnos();
        System.out.println(String.format("Los alumnos %s toman los siguientes cursos RELACIONALES %s ",
                Arrays.toString(alumnosSQL.listaAlumnos()), Arrays.toString(cursoSQL.listaCursos())));

    }

}
