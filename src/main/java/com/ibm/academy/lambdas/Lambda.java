package com.ibm.academy.lambdas;

public class Lambda {

    public static void main(String[] args) {
        new Thread(new PrintHello()).start();
    }
}


class PrintHello implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World!!!");
    }
}