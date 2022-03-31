package com.ibm.academy.patterns.creacionales.abstractfactory;

//Aqui implementamos sobre una familia en especifico(objeto), en este caso un tipo Card(interface)
public class CardFactory implements AbstractFactory<Card>{
    @Override
    public Card create(String type) {
        //Preguntamos si es de tipo VISA
        if("VISA".equals(type)){
            return new Visa(); //Regresamos una instancia de Visa
        }else if("MASTERCARD".equals(type)){ //Preguntamos si es de tipo MASTERCARD
            return new MasterCard(); //Regresamos una instancia de MasterCard
        }
        /**
         * No lo hacemos así para evitar un null exception si "type" llegará NULL
         * else if(type.equals("MASTERCAR")){ //Preguntamos si es de tipo MASTERCARD
         *             return new MasterCard(); //Regresamos una instancia de MasterCard
         *         }
         */

        return null;
    }
}
