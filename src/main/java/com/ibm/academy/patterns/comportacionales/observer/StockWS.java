package com.ibm.academy.patterns.comportacionales.observer;

public class StockWS {
    public static void main(String[] args) {
        StockSubject stockSubject = new StockSubject();

        StockObserver observer1 = new StockObserver(stockSubject);
        StockObserver observer2 = new StockObserver(stockSubject);
        StockObserver observer3 = new StockObserver(stockSubject);
        stockSubject.setApplPrice(127);
        stockSubject.setGoogPrice(230);
        stockSubject.setIbmPrice(305);
    }
}
