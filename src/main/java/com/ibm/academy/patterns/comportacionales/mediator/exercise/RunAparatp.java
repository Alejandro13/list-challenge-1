package com.ibm.academy.patterns.comportacionales.mediator.exercise;

public class RunAparatp {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        //Creamos los componentes, pasamos el mediator para que se comuniquen entre ellos
        Tele tele = new Tele(concreteMediator);
        Lampara lampara = new Lampara(concreteMediator);

        //setear el usuario
        concreteMediator.setTele(tele);
        concreteMediator.setLampara(lampara);

        tele.encender();
        lampara.encender();
        tele.apagar();
        lampara.apagar();

        /** RESPUESTA ESPERADA EN CONSOLA
         *
         * Encendiendo Televisión
         * Encendiendo Lámpara
         * Apagando Televisón
         * Apagando Lámpara
         */

    }
}
