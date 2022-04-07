package com.ibm.academy.patterns.estructurales.proxy;

public class RunProxy {
    public static void main(String[] args) {
        IInternet internet = new ProxyInternet();
        try {
            internet.connectTo("ibm.com");
            internet.connectTo("facebook.com");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
