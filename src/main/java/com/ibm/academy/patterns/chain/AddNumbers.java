package com.ibm.academy.patterns.chain;
//Otro comando
public class AddNumbers implements Chain{

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;

    }

    @Override
    public int calculate(Numbers request) {
        if("add".equals(request.getOperation())){
            return request.getNumber1() + request.getNumber2();
        }
        return this.nextChain.calculate(request);
    }
}
