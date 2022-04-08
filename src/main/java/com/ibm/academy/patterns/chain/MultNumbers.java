package com.ibm.academy.patterns.chain;

public class MultNumbers implements Chain{

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;

    }

    @Override
    public int calculate(Numbers request) {
        if("mult".equals(request.getOperation())){
            return request.getNumber1() * request.getNumber2();
        }
        return this.nextChain.calculate(request);
    }
}
