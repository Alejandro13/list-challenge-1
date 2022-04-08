package com.ibm.academy.patterns.chain;

public class Numbers {
    private int number1;
    private int number2;
    private String operation;

    public Numbers(int number1, int number2, String operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public int getNumber1() {
        return this.number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return this.number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
