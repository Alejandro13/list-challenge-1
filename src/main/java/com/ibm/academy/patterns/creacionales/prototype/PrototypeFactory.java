package com.ibm.academy.patterns.creacionales.prototype;

import java.util.HashMap;
import java.util.Map;

//Clase para obtener los prototipos
public class PrototypeFactory {

    public static  class CardType{
        public static final String VISA = "VISA";
        public static final String AMEX = "American Express";
    }

    //Mapa donde se guardan nuestros prototipos
    private static Map<String, PrototypeCard> prototipos = new HashMap<>();

    //Método principal que regresa un prototipo de tarjeta
    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException{
        //Accedemos al mapa para obtener el prototipo de tarjeta a clonar
        return prototipos.get(type).clone();
    }

    //Método para cargar todas las tarjetas en nuestros prototipos ya definidos
    public static void loadCards(){
        System.out.println("Dentro del método loadCards");
        Visa visa = new Visa();
        visa.setName("Esta es una tarjeta VISA con número 123");
        //Guardamos la tarjeta en el mapa para reutilizarlos si queremos
        prototipos.put(CardType.VISA,visa);

        Amex amex = new Amex();
        amex.setName("Esta es una tarjeta American Express con número 777");
        //Guardamos la tarjeta en el mapa para reutilizarlos si queremos
        prototipos.put(CardType.AMEX,amex);
    }
}
