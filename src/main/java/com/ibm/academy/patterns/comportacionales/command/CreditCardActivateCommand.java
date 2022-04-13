package com.ibm.academy.patterns.comportacionales.command;

public class CreditCardActivateCommand implements Command{

    private CreditCard creditCard;

    //Para inicializar la variable
    public CreditCardActivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        this.creditCard.sendPinNumberToCustomer();
        this.creditCard.activate();
        this.creditCard.sendSMSToCustomerActivate();
    }
}
