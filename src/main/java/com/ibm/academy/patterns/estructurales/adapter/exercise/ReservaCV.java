package com.ibm.academy.patterns.estructurales.adapter.exercise;

import java.util.Date;

public interface ReservaCV {
    public String hotelInfo(String idHotel);
    public Long creaReserva(String idHotel, String cliente, Date fecha, int dias);
    public String datoReserva(long codigo);
}
