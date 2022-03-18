package com.ibm.academy.theatre;

import com.ibm.academy.theatre.Seat;
import com.ibm.academy.theatre.TheatreV2;

import java.util.ArrayList;
import java.util.List;

public class mainTheatreV2 {



    public static void main(String[] args) {
        final int price = 50;
        String[] reservaciones = {"a3","A4","A7","D3","D4","D5","C7","B4","H7"};
        String[] noPermitidos = {"a0","A400","X7","","00","AA","D4"};
        String[] cancelados = {"A4"};
        List<Seat> seats = new ArrayList<>();
        List<Seat> auxSeats = new ArrayList<>();
        List<String> asientosReservados = new ArrayList<>();
        int filas = 8 , columnas = 8, letra = 65;
        int numSeats = filas *columnas;

        //Creado el cine
        for(int i=1; i <=filas; i++){
            for(int j=1; j <=columnas; j++){
                Seat seat = new Seat(  (char) letra, j, 50);
                seats.add(seat);
                auxSeats.add(seat);
            }
            //Para avanzar en el abecedario
            letra++;
        }
        TheatreV2 theatreV2 = new TheatreV2("Alex",seats,filas,numSeats);
        TheatreV2 auxCine = new TheatreV2("Alex",auxSeats,filas,numSeats);

        theatreV2.reserve(reservaciones, theatreV2, asientosReservados);
       // theatreV2.reserve(noPermitidos, theatreV2, asientosReservados);
        theatreV2.cancelReservation(cancelados, theatreV2, asientosReservados);
        //System.out.println( theatreV2);
        theatreV2.printChart( auxCine,  asientosReservados);
    }
}
