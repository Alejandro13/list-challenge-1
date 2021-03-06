package com.ibm.academy.lambdas;

import java.lang.invoke.VarHandle;

public class ChallengeLambda {

    //Interfaces con una operación abstracta para el uso de lambdas
    @FunctionalInterface
    interface SumRest {
        int operacionesBasicas(int numero1, int numero2);
    }
    @FunctionalInterface
    interface  VerdaderoFalso{
        boolean flag(int numero);
    }
    @FunctionalInterface
    interface Funcion{
        int factorial(int numero);
    } //FIN INTERFACES

    //Operaciones lambdas que usan las  interfaces funcionales
    static SumRest suma = (a,b) -> a + b;

    static SumRest resta = (a,b) -> a - b;

    static VerdaderoFalso esImparL = (numero) -> numero %2 !=0;

    static VerdaderoFalso esPrimoL= (numero) ->{
        for (int i = 2; i < numero / 2; i++) {
            // Si es divisible por cualquier numero dentro del rango, entonces no es primo
            if (numero % i == 0)
                return false;
        }
        //Es primo
        return true;
    };

    static Funcion numFactorial = (numero) ->{
        int factorial = 1;

        for(int i = 2; i <= numero; i++){
            factorial*=i;
        }
        return factorial;
    };

    //Estos métodos son para probarse en el test de labda
    public static boolean esImpar(int numero) {
        boolean impar = esImparL.flag(numero);
        return impar;
    }

    public static boolean esPrimo(int numero) {
        boolean primo = esPrimoL.flag(numero);
        return primo;
    }

    public static int sumar(int numero, int numero2) {
        int total = suma.operacionesBasicas(numero,numero2);
        return total;
    }

    public static int restar(int numero, int numero2) {
        int resta1 = resta.operacionesBasicas(numero,numero2);
        return resta1;
    }

    public static int factorial(int numero) {
        int factorial = numFactorial.factorial(numero);
        return factorial;
    } //FIN TEST

}
