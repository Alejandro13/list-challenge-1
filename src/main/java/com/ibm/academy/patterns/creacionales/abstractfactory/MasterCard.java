package com.ibm.academy.patterns.creacionales.abstractfactory;

public class MasterCard implements Card{
    @Override
    public String getCardNumber() {
        return "111 222 333";
    }

    @Override
    public String getCardType() {
        return "MASTERCARD";
    }
}
