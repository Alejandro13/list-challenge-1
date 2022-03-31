package com.ibm.academy.patterns.creacionales.abstractfactory;

public class Visa implements Card{
    @Override
    public String getCardNumber() {
        return "777 888 999";
    }

    @Override
    public String getCardType() {
        return "VISA";
    }
}
