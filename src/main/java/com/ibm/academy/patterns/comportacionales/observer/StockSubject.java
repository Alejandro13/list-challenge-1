package com.ibm.academy.patterns.comportacionales.observer;

import java.util.ArrayList;
import java.util.List;

public class StockSubject implements Subject{
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        observers.stream().forEach(o -> o.update(ibmPrice, applPrice, googPrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;

        notifyObserver();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;

        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;

        notifyObserver();
    }
}
