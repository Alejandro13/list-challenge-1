package com.ibm.academy.patterns.comportacionales.state;

public class MobileAlertStateContext {
    private MobileAlertState currentState;

    public MobileAlertStateContext() {
        this.currentState = new Sound();
    }

    //Solo el método set
    public void setCurrentState(MobileAlertState currentState) {
        this.currentState = currentState;
    }

    //Método de alert
    public void alert(){
        //indicamos que solo sera el alert de esta clase
        currentState.alert(this);
    }
}
