package com.ibm.academy.patterns.estructurales.facade;

public class CreditMaker {
    //Se crea la tarjeta tipo Gold
    private ICredit gold;
    //Se crea la tarjeta tipo silver
    private ICredit silver;
    //Se crea la tarjeta tipo black
    private ICredit black;

    //Constructor
    public CreditMaker() {
        this.gold = new Gold();
        this.silver = new Silver();
        this.black = new Black();
    }

    //Métodos para mostrar el credito de cada tarjeta
    public void showCreditGold(){
        this.gold.showCredit();
    }

    public void showCreditSilver(){
        this.silver.showCredit();
    }

    public void showCreditBlack(){
        this.black.showCredit();
    }
}
