package com.ibm.academy.patterns.comportacionales.observer;

public class StockObserver implements Observer{
    private static int observerIdGenerator=0;
    private int observerID;

    public StockObserver(Subject stockSubject) {
        stockSubject.register(this);
        observerID=++observerIdGenerator;
    }

    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        System.out.println("Observer id:" + observerID + "\n" +
                "IBM:" + ibmPrice+"\n" +
                "Appl:" + applPrice+"\n"+
                "Goog:"+googPrice+"\n");
    }
}
