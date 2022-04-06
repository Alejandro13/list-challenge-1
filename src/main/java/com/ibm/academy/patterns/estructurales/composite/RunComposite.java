package com.ibm.academy.patterns.estructurales.composite;

public class RunComposite {
    public static void main(String[] args) {
        AccountComponent currentAccount = new CurrentAccount(1000.00, "Alejandro");
        AccountComponent savingAccount = new SavingAccount(200.00, "Alejandro");

        //Creamos los hijos
        AccountComposite accountComposite = new AccountComposite();
        accountComposite.addAccount(currentAccount);
        accountComposite.addAccount(savingAccount);

        accountComposite.showAccountName();
        accountComposite.getAmount();

    }
}
