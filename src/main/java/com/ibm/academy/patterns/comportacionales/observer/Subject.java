package com.ibm.academy.patterns.comportacionales.observer;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();
}
