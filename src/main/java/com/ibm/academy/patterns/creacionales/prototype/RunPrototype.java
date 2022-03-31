package com.ibm.academy.patterns.creacionales.prototype;

public class RunPrototype {

    public static void main(String[] args) {

        //Cargamos todos nuestros prototipos
        PrototypeFactory.loadCards();
        try{
            //Clonamos las tarjetas/objetos almacenados
            PrototypeCard visa = PrototypeFactory.getInstance(PrototypeFactory.CardType.VISA);
            visa.getCard();
            PrototypeCard amex = PrototypeFactory.getInstance(PrototypeFactory.CardType.AMEX);
            amex.getCard();

        }catch (CloneNotSupportedException cne){
            cne.printStackTrace();
        }
    }

}
