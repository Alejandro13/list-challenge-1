package com.ibm.academy.patterns.comportacionales.state;

public class Silent implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext contexto) {
        System.out.println("NO SUENA PORQUE ESTA EN SILENCIO");
    }
}
