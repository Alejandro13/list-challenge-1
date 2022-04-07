package com.ibm.academy.patterns.estructurales.proxy;

public class AccessToInternet implements IInternet{
    @Override
    public void connectTo(String url) throws Exception {
        System.out.println("Conectando a " + url);
    }
}
