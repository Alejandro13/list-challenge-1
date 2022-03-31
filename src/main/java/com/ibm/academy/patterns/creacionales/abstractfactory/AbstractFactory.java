package com.ibm.academy.patterns.creacionales.abstractfactory;

//No sabemos que tipo de objetos vamos a crear, asi que utilizamos un generico <T>
public interface AbstractFactory<T> {
    //Indicamos que tipo de objeto sera
    T create(String type);
}
