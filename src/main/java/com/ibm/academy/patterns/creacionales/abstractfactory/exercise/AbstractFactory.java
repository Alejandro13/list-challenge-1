package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;

//No sabemos que tipo de objetos vamos a crear, asi que utilizamos un generico <T>
public interface AbstractFactory<T> {
    public T createRepositoryAlumnos();
    public T createRepositoryCursos();
}
