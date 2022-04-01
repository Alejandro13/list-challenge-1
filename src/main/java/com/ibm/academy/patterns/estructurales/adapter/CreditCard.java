package com.ibm.academy.patterns.estructurales.adapter;

public class CreditCard implements Payment{

    Adapter adapter; // lo usamos para saber el tipo de seguridad y usarlo en la interface de payment

    @Override
    public void pay(String type) {
        //Preguntamos que tipo de tarjeta usamos
        if("classic".equals(type)){
            System.out.println("Tarjeta Classic: pagando sin ningun tipo de seguridad");
        }
        else if("gold".equals(type)){
            adapter = new Adapter(type);
            adapter.pay(type); //pasamos el método de pago

        }else if("black".equals(type)){
            adapter = new Adapter(type);
            adapter.pay(type); //pasamos el método de pago

        }else{
            System.out.println("No se puede hacer el pago, no se reconoce la tarjeta");
        }
    }
}
