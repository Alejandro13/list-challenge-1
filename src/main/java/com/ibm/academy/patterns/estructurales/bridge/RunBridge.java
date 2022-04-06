package com.ibm.academy.patterns.estructurales.bridge;

public class RunBridge {

    public static void main(String[] args) {
        //Mandamos una instancia de clase como argurmento en lugar de una interfaz
        CreditCard clasica = new ClassicCreditCard(new UnSecureCreditCard());
        clasica.realizarPago(); //Pago sin seguridad

        CreditCard black = new ClassicCreditCard(new SecureCreditCard());
        black.realizarPago(); // Pago con seguridad
    }
}
