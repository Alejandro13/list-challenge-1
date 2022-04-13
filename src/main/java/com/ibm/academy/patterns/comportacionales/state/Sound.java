package com.ibm.academy.patterns.comportacionales.state;

public class Sound implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext contexto) {
        System.out.println("RING, RING...... RING");
    }
}
