package com.ibm.academy.patterns.estructurales.adapter.exercise;

import java.util.Date;

public class StandarReservaAdapter implements StandarReservaACME{

    public ReservaCV miSistema;

    //Constructor
    public StandarReservaAdapter(ReservaCV miSistema){
        this.miSistema = miSistema;

    }

    @Override
    public String getInfo(String idHotel) {
        miSistema.hotelInfo(idHotel);
        return idHotel;
    }

    @Override
    public String creaReserva(Date fecha, int dias, String idHotel, String cliente) {
        miSistema.creaReserva(idHotel,cliente,fecha,dias);

        String reserva ="";
        reserva = reserva+ " "+ fecha + " " +dias+ " " + idHotel+ " " +cliente;
        //System.out.println(reserva);
        return reserva;
    }

    @Override
    public String datoReserva(String codigo) {
        miSistema.datoReserva(Long.parseLong(codigo));
        return codigo;
    }



}
