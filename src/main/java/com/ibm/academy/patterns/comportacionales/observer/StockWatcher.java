package com.ibm.academy.patterns.comportacionales.observer;

import java.text.DecimalFormat;

public class StockWatcher {
    private Subject subject;
    private String stockName;
    private double price;

    public StockWatcher(Subject subject, String stockName, double price) {
        this.subject = subject;
        this.stockName = stockName;
        this.price = price;

        generateStockPrice();
    }

    private void generateStockPrice() {
        // generate random price
        double rndPrice = (Math.random() * 0.06) - 0.03;
        DecimalFormat df = new DecimalFormat("#.##");
        price = Double.valueOf(df.format(price + rndPrice));
        // update stock price on subject
    }
}
