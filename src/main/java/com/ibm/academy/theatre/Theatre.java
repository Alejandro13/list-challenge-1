package com.ibm.academy.theatre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.regex.Pattern;

/***
 * https://www.baeldung.com/junit-5-test-order
 * Create a com.ibm.academy.theatre.Theatre class with a name, list of seats, number of rows and number of seats.
 * Add methods to reserve, cancel reservation and print seating chart
 * The reserve method must prevent dups
 */
@Getter
@Setter
@AllArgsConstructor
public class Theatre {
    private String name;
    private List<Seat> seats;
    private int rows;
    private int numberSeats;

    //Para reservar
    public static int reserve(List<List<String>> cinema, List<String> asientosReservados,
                                  Map<Character,Integer> filaLetra, int reservados){

        for(int i = 0; i< asientosReservados.size(); i++){
            //validar asientos
            if(Pattern.matches("^[A-H]{1}[1-9]{1}$", asientosReservados.get(i).toUpperCase())   ){
                String asiento = asientosReservados.get(i); //Obtenemos el asiento de la lista
                //Obtenemos fila y columna
                String fila = asiento.substring(0,1).toUpperCase();
                String columna = asiento.substring(1);
                //Sacamos el #fila del hastMap
                int fila2 = filaLetra.get(fila.charAt(0));
                int columna2 = Integer.parseInt(columna);

                //REVISAMOS SINO ESTA OCUPADO EL ASIENTO
                if( cinema.get(fila2).get(columna2) != ".") {
                    System.out.println("EL ASIENTO "+ fila+columna + " ESTA OCUPADO");
                    //return false;
                }else {
                    //Reservamos el asiento para la persona, restamos -1 a la columna para comenzar desde la posion 0
                    cinema.get(fila2).set(columna2-1, fila + columna);
                    reservados += 1;
                }
            }else{ //SI EL ASIENTO NO ES VALIDO
                System.out.println("EL ASIENTO " + asientosReservados.get(i).toUpperCase() + " NO ES VALIDO");
            }
        }
        return reservados;
    }

    public static int cancelReservation(List<List<String>> cinema, List<String> asientosCancelados,
                                         Map<Character, Integer> filaLetra, int cancelados){
        for(int i = 0; i< asientosCancelados.size(); i++){
            //validar asientos
            if(Pattern.matches("^[A-H]{1}[1-9]{1}$", asientosCancelados.get(i).toUpperCase())   ){
                String asiento = asientosCancelados.get(i); //Obtenemos el asiento de la lista
                //Obtenemos fila y columna
                String fila = asiento.substring(0,1).toUpperCase();
                String columna = asiento.substring(1);
                //Sacamos el #fila del hastMap
                int fila2 = filaLetra.get(fila.charAt(0));
                int columna2 = Integer.parseInt(columna);

                //REVISAMOS SINO ESTA OCUPADO EL ASIENTO
                if( cinema.get(fila2).get(columna2-1) == ".") {
                    System.out.println("EL ASIENTO "+ fila+columna + " NO ESTA OCUPADO, NO SE PUEDE CANCELAR");
                    //return false;
                }else {
                    //Cancelamos el asiento para la persona
                    cinema.get(fila2).set(columna2-1, ".");
                    cancelados += 1;
                    System.out.println("EL ASIENTO "+ fila+columna + " SE DESOCUPO");
                }
            }else{ //SI EL ASIENTO NO ES VALIDO
                System.out.println("EL ASIENTO " + asientosCancelados.get(i).toUpperCase() + " NO ES VALIDO");
            }
        }
        return cancelados;
    }

    public static void printChart(List<List<String>> cinema, int reservados, int totalAsientos){
        int price = 50;
        // print method will show free, reserved and total amount of sold seats, free and reserved.
        for(List<String> fila : cinema){
            //Con el if evitamos imprimir la fila 0 que esta vacia
            if(!fila.isEmpty()){
                System.out.println(fila);
            }
        }
        int available =totalAsientos - reservados;
        System.out.println("Total Available: " + available);
        System.out.println("Total Sold: " +  reservados);
        System.out.println("Total Income: " + reservados*price);
    }

}
