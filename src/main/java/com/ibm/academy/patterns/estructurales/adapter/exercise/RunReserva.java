package com.ibm.academy.patterns.estructurales.adapter.exercise;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class RunReserva {
    public static void main(String[] args) {
        Date fecha = new Date();
        //SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        //String stringDate = DateFor.format(fecha);


        ReservaCV rc = new ReservaCV() {
            @Override
            public String hotelInfo(String idHotel) {
                return idHotel;
            }

            @Override
            public Long creaReserva(String idHotel, String cliente, Date fecha, int dias) {
                //Solo puedo concatenar idHotel y dias
                String aux ="";
                aux = aux+  idHotel   +  dias ;
                Long reserva = Long.parseLong( aux);
                return reserva;
            }

            @Override
            public String datoReserva(long codigo) {
                return String.valueOf(codigo);
            }
        };

        StandarReservaAdapter adapterACME = new StandarReservaAdapter(rc);
        StandarReservaAdapter adapterCV = new StandarReservaAdapter(rc);


        System.out.println("CREA RESERVA ACME: " + adapterACME.creaReserva(fecha,20,"3","Alejandro"));
        System.out.println("DATO RESERVA ACME: "+adapterACME.datoReserva("13"));
        System.out.println("GET INFO ACME: " + adapterACME.getInfo("3"));

        System.out.println();

        System.out.println("CREA RESERVA CV: " + adapterCV.miSistema.creaReserva("123", "Carmen", fecha, 15));
        System.out.println("DATO RESERVA CV: " + adapterCV.miSistema.datoReserva(777));
        System.out.println("GET INFO CV: " + adapterCV.miSistema.hotelInfo("123"));
    }
}
