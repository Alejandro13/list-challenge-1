package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

public class RelacionalFactory implements AbstractFactory<AlumnosRepository>{

    @Override
    public AlumnosRepository createRepositoryAlumnos(String alumno) {
        if("NOSQL".equals(alumno)){
            return new AlumnosNoSQLRepository();
        }else if("SQL".equals(alumno)){
            return new AlumnosRelacionalRepository();
        }
        return null;
    }

    @Override
    public AlumnosRepository createRepositoryCursos(String curso) {
        if("NOSQL".equals(curso)){
            return (AlumnosRepository) new CursoNoSQLRepository();
        }else if("SQL".equals(curso)){
            return (AlumnosRepository) new CursoRelacionalRepository();
        }
        return null;
    }
}
