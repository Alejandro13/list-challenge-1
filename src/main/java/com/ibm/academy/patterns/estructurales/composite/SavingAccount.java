package com.ibm.academy.patterns.estructurales.composite;

public class SavingAccount implements AccountComponent {

    private Double amount;
    private String name;

    public  SavingAccount(Double amount, String name){
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName() {
        System.out.println("SavingAccount: " + this.name);
    }

    @Override
    public double getAmount() {
        //System.out.println("CurrentAccount amount: " + this.amount);
        return this.amount;
    }
}
