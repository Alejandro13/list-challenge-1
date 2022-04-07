package com.ibm.academy.patterns.estructurales.facade.exercise;

public class RunSystem {
    public static void main(String[] args) {
        WebFacade sistema = new WebFacade();
        sistema.doSomethingBillingSystem();
        sistema.doSomethingCRMSystem();
        sistema.doSomethingEmailSystem();
    }
}
