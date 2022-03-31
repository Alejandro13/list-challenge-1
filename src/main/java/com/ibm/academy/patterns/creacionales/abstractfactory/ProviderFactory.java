package com.ibm.academy.patterns.creacionales.abstractfactory;

public class ProviderFactory {
    //Le decimos que tipo de fabrica estamos seleccionando (chooseFactory)
    public static AbstractFactory getFactory(String chooseFactory){
        if("Card".equals(chooseFactory)){
            //Regresamos la fabrica de tarjeta
            return new CardFactory();
        }else if("PaymentMethod".equals(chooseFactory)){
            //Regresamos la fabrica de pago
            return new PaymentMethodFactory();
        }
        return null;
    }
}
