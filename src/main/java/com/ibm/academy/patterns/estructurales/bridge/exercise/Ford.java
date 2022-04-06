package com.ibm.academy.patterns.estructurales.bridge.exercise;

public class Ford extends Vehiculo{

    //Inicializamos nuestra interfaz
    public Ford(IMotor motor){
        super(motor);
    }

    @Override
    public void mostrarCaracteristicas() {
        //Caracteristicas de un motor a Diesel o Gasolina
        motor.inyectarCombustible(65.22);
        motor.cosumirGasolina();
    }
}
