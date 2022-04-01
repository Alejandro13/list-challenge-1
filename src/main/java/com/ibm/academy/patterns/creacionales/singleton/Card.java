package com.ibm.academy.patterns.creacionales.singleton;

import java.io.Serializable;

//Una sola clase y es global
//Ejemplo de uso, conexiones de base de datos
public class Card implements Serializable { //

    private static Card INSTANCE;//atributo del mismo tipo de la clase
    private String carNumber;

    //constructor privado para que nadie pueda instanciar la clase
    private Card(){}

    /**
     * Para preguntar si el objeto existe, asegurando así tener solo una instancia
     * usamos synchronized cuando dos personas al mismo tiempo intentan ingresar a la instancia del objeto
     */
    public synchronized static Card getINSTANCE(){
        if(INSTANCE == null){
            //Creamos la nueva instancia de la clase
            INSTANCE = new Card();
        }
        return INSTANCE;
    }

    /**
     * Este método devuelve un objeto de la instancia, así, al momento de deserealizar el objeto no creara un objeto
     */
    private Object readResolve(){
        return INSTANCE;
    }

    //get y set

    public String getCarNumber() {
        return this.carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
