package com.ibm.academy.arrays;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        int[] numeros = new int[]{6,7,2,5,9,4,1};
        int ultimo = numeros.length-1;
        ordernarSimple(numeros);
        ordenarComplex(numeros, 0,ultimo);
        System.out.println( "USANDO QUICKSORT: " +Arrays.toString(numeros));
    }

    public static void ordernarSimple(int[] cad){
        Arrays.sort(cad);
        System.out.println( "USANDO SORT: " + Arrays.toString(cad));
    }

    //Utilizando el método quickSort
    public static void ordenarComplex(int[] numeros, int inicio, int fin) {
        if (inicio < fin) {
            int indice = partition(numeros, inicio, fin);

            //Aquí ordenamos de manera recursiva los elementos de los 2 arreglos que separamos
            ordenarComplex(numeros, inicio, indice-1);
            ordenarComplex(numeros, indice+1, fin);

        }
    }

    public static int partition(int[] numeros, int inicio, int fin) {
        //Nuestro pivote será el número ubicado en al última posición del arreglo recibido
        int pivote = numeros[fin];
        //index del elemento más pequeño e indica la posición correcta del pivote encontrado hasta el momento
        int i = (inicio -1);

        for (int j = inicio; j < fin; j++) {
            //Si el elemento actual es menor o igual a nuestro pivote
            if (numeros[j] <= pivote) {
                //Se incremente el index del elemento pequenio
                i++;
                //Realizamos un intercambio de esos elementos con ayuda de un auxiliar
                int swapTemp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = swapTemp;
            }
        }
        //
        int swapTemp = numeros[i+1];
        numeros[i+1] = numeros[fin];
        numeros[fin] = swapTemp;

        return i+1;
    }
}
