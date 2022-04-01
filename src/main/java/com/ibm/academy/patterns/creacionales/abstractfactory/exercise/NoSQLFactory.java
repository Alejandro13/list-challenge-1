package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class NoSQLFactory implements AbstractFactory<CursosRepository>{

    /**
     *  AlumnosNoSQLRepository tiene que implementar CursosRepository para poder devolver una instancia real,
     *  ya que si realizamos un cast con CursosRepository, nos mandará un error de conversión
     */
    @Override
    public CursosRepository createRepositoryAlumnos() {
            //return (CursosRepository)  new AlumnosNoSQLRepository(); -> marca error en tiempo de ejecución
            return  new AlumnosNoSQLRepository(); //Regresamos una instancia de AlumnosNoSQLRepository
    }

    @Override
    public CursosRepository createRepositoryCursos() {
            return new CursoNoSQLRepository(); //Regresamos una instancia de CursoNoSQLRepository
    }
}
