package com.ibm.academy.patterns.comportacionales.state;

public class RunState {
    public static void main(String[] args) {
        //Creamos nuestro contexto
        MobileAlertStateContext contexto = new MobileAlertStateContext();
        contexto.alert();
        contexto.alert();
        contexto.setCurrentState(new Vibration());
        contexto.alert();
        contexto.alert();
        contexto.setCurrentState(new Silent());
        contexto.alert();
        contexto.alert();
    }
}
