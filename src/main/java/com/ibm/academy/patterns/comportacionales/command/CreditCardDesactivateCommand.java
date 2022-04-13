package com.ibm.academy.patterns.comportacionales.command;

public class CreditCardDesactivateCommand implements Command{

    private CreditCard creditCard;

    //Para inicializar la variable
    public CreditCardDesactivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        this.creditCard.desactivate();
        this.creditCard.sendSMSToCustomerDesactivate();
    }
}
