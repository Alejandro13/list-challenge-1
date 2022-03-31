package com.ibm.academy.patterns.creacionales.abstractfactory;

//Aqui implementamos sobre una familia en especifico(objeto), en este caso un tipo PaymentMethod (interface)
public class PaymentMethodFactory implements AbstractFactory<PaymentMethod>{
    @Override
    public PaymentMethod create(String type) {
        if("CREDIT".equals(type)){
            return new Credit();
        }else if("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
}
