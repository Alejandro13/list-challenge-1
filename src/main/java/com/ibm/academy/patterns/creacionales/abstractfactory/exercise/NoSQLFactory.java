package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class NoSQLFactory implements AbstractFactory<CursosRepository>{
    @Override
    public CursosRepository createRepositoryAlumnos(String alumno) {
        if("NOSQL".equals(alumno)){
            return (CursosRepository) new AlumnosNoSQLRepository(); //Regresamos una instancia de Visa
        }else if("SQL".equals(alumno)){ //Preguntamos si es de tipo MASTERCARD
            return (CursosRepository) new AlumnosRelacionalRepository(); //Regresamos una instancia de MasterCard
        }
        return null;
    }

    @Override
    public CursosRepository createRepositoryCursos(String curso) {
        if("NOSQL".equals(curso)){
            return new CursoNoSQLRepository(); //Regresamos una instancia de Visa
        }else if("SQL".equals(curso)){ //Preguntamos si es de tipo MASTERCARD
            return new CursoRelacionalRepository(); //Regresamos una instancia de MasterCard
        }
        return null;
    }
}
