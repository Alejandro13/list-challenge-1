package com.ibm.academy.patterns.estructurales.facade.exercise;

public class WebFacade {

    private ISystem billingSystem;
    private ISystem crmSystem;
    private ISystem emailSystem;

    //Inicializamos las fachadas
    public WebFacade(){
        this.billingSystem = new BillingSystem();
        this.crmSystem = new CRMSystem();
        this.emailSystem = new EmailSystem();
    }

    public void doSomethingEmailSystem(){
        this.emailSystem.doSomething();
    }

    public void doSomethingCRMSystem(){
        this.crmSystem.doSomething();
    }
    public void doSomethingBillingSystem(){
        this.billingSystem.doSomething();
    }
}
