package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class RelacionalFactory implements AbstractFactory<AlumnosRepository>{

    @Override
    public AlumnosRepository createRepositoryAlumnos() {
        return new AlumnosRelacionalRepository();
    }

    /**
     *  CursoRelacionalRepository tiene que implementar AlumnosRepository para poder devolver una instancia de real,
     *  ya que si realizamos un cast con AlumnosRepository, nos mandará un error de conversión
     */
    @Override
    public AlumnosRepository createRepositoryCursos() {
        //return (AlumnosRepository) new CursoRelacionalRepository(); -> marca error en tiempo de ejecución
        return new CursoRelacionalRepository();
    }
}
