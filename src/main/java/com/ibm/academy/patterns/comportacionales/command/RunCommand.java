package com.ibm.academy.patterns.comportacionales.command;

public class RunCommand {
    public static void main(String[] args) {
        CreditCard creditCardActive = new CreditCard();
        CreditCard creditCardDesactive = new CreditCard();

        System.out.println("------------------------------------------------------------------------");
        //Usamos el invoker
        CreditCardInvoker invoker = new CreditCardInvoker();
        invoker.setCommand(new CreditCardActivateCommand(creditCardActive)); // para activar
        invoker.run();
        System.out.println("------------------------------------------------------------------------");
        invoker.setCommand(new CreditCardDesactivateCommand(creditCardDesactive)); // para desactivar
        invoker.run();
        System.out.println("-------------------------------------------------------------------------");
    }
}
