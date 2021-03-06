package com.ibm.academy.patterns.creacionales.abstractfactory.exercise;



public class ProviderFactory {
    //Le decimos que tipo de fabrica estamos seleccionando (chooseFactory)
    public static AbstractFactory getFactory(String chooseFactory){
        if("NOSQL".equals(chooseFactory)){
            //Regresamos la fabrica NOSQL
            return new NoSQLFactory();
        }else if("SQL".equals(chooseFactory)){
            //Regresamos la fabrica SQL
            return new RelacionalFactory();
        }
        return null;
    }
}
