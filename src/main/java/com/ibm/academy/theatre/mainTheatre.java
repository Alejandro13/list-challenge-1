package com.ibm.academy.theatre;

import com.ibm.academy.theatre.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mainTheatre {

    public static void main(String[] args) {
        int filas = 8, columas = 8, reservados = 0, cancelados = 0 , total = 0;
        Map<Character, Integer> filaLetra = new HashMap<>();
        List<String> asientosReservados = new ArrayList<>();
        List<String> asientosCancelados = new ArrayList<>();
        //int [][] asientosReservados = {{1,2},{2,3},{3,4},{4,5}};
        List<List<String>> cinema = new ArrayList<>();
        cinema.add(new ArrayList<>());
        //Creando la sala
        for(int i=1; i<= filas; i++){
            cinema.add(new ArrayList<>());
            for(int j = 1; j<=columas; j++){
                cinema.get(i).add(".");
                total+=1;
            }
        }

        //Para saber que numero de fila le corresponde a cada letra
        for(int letra = 65, filaNumber =1; letra<91; letra++, filaNumber++){
            filaLetra.put((char) letra,filaNumber);
        }

        String[] noPermitidos = {"a0","A400","X7","","00","AA","D4"};
        String[] cancelados2 = {"A4"};
        String[] asientosPorReservar =  {"a3","A4","A7","D3","D4","D5","C7","B4","H7"};
        for(String asiento : asientosPorReservar){
            asientosReservados.add(asiento);
        }

        reservados = Theatre.reserve(cinema,asientosReservados,filaLetra,reservados);
       /* asientosReservados.removeAll(asientosReservados);
        for(String asiento : noPermitidos){
            asientosReservados.add(asiento);
        }
        reservados = com.ibm.academy.theatre.Theatre.reserve(cinema,asientosReservados,filaLetra,reservados);*/

       /* String[] canceladoss =  {"A4"};
        for(String asiento : canceladoss){
            asientosCancelados.add(asiento);
        }*/


        asientosCancelados.add("A4");
        cancelados = Theatre.cancelReservation(cinema,asientosCancelados,filaLetra, cancelados);
        Theatre.printChart(cinema,reservados,total);

        System.out.println("fin");




    }
}
