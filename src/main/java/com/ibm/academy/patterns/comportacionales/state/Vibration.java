package com.ibm.academy.patterns.comportacionales.state;

public class Vibration implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext contexto) {
        System.out.println("zumbo, zumbo zumbooooo");
    }
}
