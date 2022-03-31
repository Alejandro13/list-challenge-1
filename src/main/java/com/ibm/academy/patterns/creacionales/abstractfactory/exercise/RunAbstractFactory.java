package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class RunAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactoryNoSQLFactory = ProviderFactory.getFactory("NOSQL");
        CursosRepository cursoNOSQL = (CursosRepository) abstractFactoryNoSQLFactory.createRepositoryCursos("NOSQL");
        AlumnosRepository alumnoNOSQL = (AlumnosRepository) abstractFactoryNoSQLFactory.createRepositoryAlumnos("NOSQL");

        System.out.println(String.format("Los alumnos %s toman los siguientes cursos:  %s ",
                alumnoNOSQL.listaAlumnos(),cursoNOSQL.listaCursos()));
    }

}
