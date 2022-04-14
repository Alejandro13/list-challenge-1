package com.ibm.academy.patterns.comportacionales.memento.exercise;

public class RunMemento {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("Alejandro", "Martínez");
        originator.setApellido( originator.getApellido() + " Bautista");
        System.out.println("Nombre original: " + originator.getNombre() + " " + originator.getApellido());
        careTaker.setMemento(originator.createMemento());

        //Agregamos un nombre que no es el mio
        originator.setNombre(originator.getNombre() + " Antonio ");
        System.out.println("Nombre erroneo: "+originator.getNombre());

        //Recuperando el memento con el nombre original para quitar el nombre errone
        Memento memento = careTaker.getMemento();
        originator.restoreMemento(memento);
        System.out.println("Nombre original recuperado: " + originator.getNombre());

        /** SALIDA ESPERADA EN CONSOLA
         *
         * Nombre original: Alejandro Martínez Bautista
         * Nombre erroneo: Alejandro Antonio
         * Nombre original recuperado: Alejandro
         */


    }

}
