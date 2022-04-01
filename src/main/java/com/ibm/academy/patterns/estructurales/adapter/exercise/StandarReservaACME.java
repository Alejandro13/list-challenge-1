package com.ibm.academy.patterns.estructurales.adapter.exercise;

import java.util.Date;

public interface StandarReservaACME {
    public String getInfo(String idHotel);
    public String creaReserva(Date fecha, int dias, String idHotel, String cliente);
    public String datoReserva(String codigo);
}
