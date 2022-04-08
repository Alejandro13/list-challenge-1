package com.ibm.academy.patterns.chain;

public class DivNumbers implements Chain{

    private Chain setNextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.setNextChain = nextChain;

    }

    @Override
    public int calculate(Numbers request) {
        if("div".equals(request.getOperation())){
            int a =  request.getNumber1();
            int b = request.getNumber2();
            return request.getNumber1() / request.getNumber2();
        }

        //return this.setNextChain.calculate(request);
        return Integer.MAX_VALUE;
    }
}
