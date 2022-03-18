package com.ibm.academy.arrays;

import java.util.Arrays;

public class ChallengeMatrix1 {

    public static void main(String[] args) {

        int filas = 8, columnas = 8;

        if(!(filas == columnas)){
            System.out.println("No se puede hacer la operación, NO ES UNA MATRIZ CUADRADA");
        }

        int[][] numeros = new int[filas][columnas];
        numeros = matrix(numeros);
        System.out.println("MATRIZ DE 1 EN DIAGONALES Y EN LA PRIMERA Y ULTIMA FILA");
        imprimirMatriz(numeros);

        //Matriz  de Caracol
        int[][] numeros2 = new int[filas][columnas];
        numeros2 = matrixCaracol(numeros2);
        System.out.println("MATRIZ DE CARACOL");
        imprimirMatriz(numeros2);

    }

    public static int[][] matrix(int[][] numeros){

        int ultimaFila = numeros[0].length-1;
        for(int i= 0; i< numeros.length; i++){
            numeros[i][i] = 1; //diagonal principal
            numeros[i][(numeros.length -1) -i] = 1;//diagonal secundaria

            //Para colocar ceros en el limite superior e inferior de la matriz
            if(i+1<numeros.length){
                //Fila superior
                numeros[0][i+1] = 1;
                //Fila Inferior
                numeros[ultimaFila][i+1] = 1;
            }
        }
        return numeros;
    }

    public static int[][] matrixCaracol(int[][] numeros){
        int fila = numeros.length, columna = numeros[0].length, tamanioMatriz = fila* columna;
        int inicio = 0, limite = numeros.length -1, numero=1;

        do{
            //Para la fila de izquierda a derecha
            for(int i= inicio; i<= limite; i++){
                numeros[inicio][i] = numero++;
            }

            //Para la columna de arriba a abajo
            for(int j = inicio+1; j <=limite; j++){
                numeros[j][limite] = numero++;
            }
            //Para la fila de derecha a izquierda
            for(int k = limite-1; k>=inicio; k--){
                numeros[limite][k] = numero++;
            }

            //Para la columna de abaja a arriba
            for(int m = limite-1; m>=inicio+1; m--){
                numeros[m][inicio] = numero++;
            }
            inicio++;
            limite--;

        }while(numero<=tamanioMatriz);
        return numeros;
    }

    public static void imprimirMatriz(int[][] matriz){
        for(int j = 0; j < matriz.length; j++){
            System.out.println(Arrays.toString(matriz[j]));
        }
        System.out.println();
    }
}
