package com.ibm.academy.patterns.chain;
//Usado en la vida real en
public interface Chain {
    void setNextChain(Chain nextChain);
    int calculate(Numbers request);
}
