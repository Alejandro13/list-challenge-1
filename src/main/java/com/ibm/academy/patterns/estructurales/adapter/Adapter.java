package com.ibm.academy.patterns.estructurales.adapter;

public class Adapter implements Payment{
    //Tiene un atributo de seguridad
    Secure secureCreditCard;

    public Adapter(String type){
        //Que tipo de tarjeta se esta usando para crear el objeto
        if("black".equals(type)){
            secureCreditCard = new BlackCreditCard();
        }else if("gold".equals(type)){
            secureCreditCard = new GoldenCreditCard();
        }
    }

    //Creando la conexión con ambas clases, payment
    @Override
    public void pay(String type) {
        //Implementando el tipo de pago
        if("black".equals(type)){
            secureCreditCard.payWithSecureLevelA();
        }else if("gold".equals(type)){
            secureCreditCard.payWithSecureLevelZ();
        }

    }
}
