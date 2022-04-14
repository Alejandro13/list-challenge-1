package com.ibm.academy.patterns.comportacionales.state.exercise;

public class RunSemaforo {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.mostrar(); //Inicialmente el semaforo está en rojo
        semaforo.setActualEstado(new EstadoAmarillo());
        semaforo.mostrar();
        semaforo.setActualEstado(new EstadoVerde());
        semaforo.mostrar();

        /** RESULTADO ESPERADO EN CONSOLA
         *
         * El semaforo está en color ROJO
         * El semaforo está en color AMARILLO
         * El semaforo está en color VERDE
         */
    }
}
