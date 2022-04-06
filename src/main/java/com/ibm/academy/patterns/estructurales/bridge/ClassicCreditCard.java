package com.ibm.academy.patterns.estructurales.bridge;

public class ClassicCreditCard extends  CreditCard{

    //Inicializamos nuestra interfaz
    public ClassicCreditCard(ICreditCard card){
        super(card);
    }

    @Override
    public void realizarPago() {
        //Puede llamar los pagos con o sin seguridad
        card.realizarPago();
    }
}
