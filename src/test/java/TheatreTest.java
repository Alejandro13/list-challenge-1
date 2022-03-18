import com.ibm.academy.theatre.Seat;
import com.ibm.academy.theatre.TheatreV2;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TheatreTest {
    /**
     * Reserve following seats: {"a3","A4","A7","D3","D4","D5","C7","B4","H7"}
     * Validate these not allowed: {"a0","A400","X7","","00","AA","D4"}
     * Cancel: {"A4"}
     * @param word
     */

    static TheatreV2 theatreV2;
    static final int price = 50;
    static List<Seat> seats;
    static List<String> asientosReservados, asientosCancelados, asientosNoValidos;
    static int filas = 8;
    static int columnas = 8;
    static int letra = 65;
    static int numSeats = filas *columnas;


    @BeforeAll
    static void setup(){
        seats = new ArrayList<>();
        asientosReservados = new ArrayList<>(Arrays.asList("A3","A4","A7","D3","D4","D5","C7","B4","H7"));
        asientosNoValidos = new ArrayList<>(Arrays.asList("A3","A4","A7","D3","D4","D5","C7","B4","H7"));
        asientosCancelados = new ArrayList<>(Arrays.asList("A3","A7","D3","D4","D5","C7","B4","H7"));
        //Creando el cine
        for(int i=1; i <=filas; i++){
            for(int j=1; j <=columnas; j++){
                Seat seat = new Seat(  (char) letra, j, 50); //( fila,columna, precio)
                seats.add(seat);
            }
            //Para avanzar en el abecedario
            letra++;
        }
        theatreV2 = new TheatreV2("Alex",seats,filas,numSeats);
    }


    @Order(1)
    @ParameterizedTest
    @MethodSource("StringsProviders#asientosValidos")
    void reserveSeats(String[] asientos){
        assertEquals(asientosReservados, theatreV2.reserve(asientos, theatreV2, asientosReservados));
    }


    @Order(2)
    @ParameterizedTest
    @MethodSource("StringsProviders#asientosNoValidos")
    //@ValueSource(strings = {"a0","A400","X7","","00","AA","D4"})
    void validateAllowSeats(String[] asientos){
        //assertTrue(Palindrome.isPalindrome(word));
        assertEquals(asientosNoValidos, theatreV2.reserve(asientos,theatreV2, asientosReservados));
    }


    @Order(3)
    @ParameterizedTest
    @MethodSource("StringsProviders#asientosCancelados")
    //@ValueSource(strings = {"A4"})
    void cancelSeats(String[] asientos){
        assertEquals(asientosCancelados, theatreV2.cancelReservation(asientos,theatreV2, asientosReservados) );
    }

    @Order(4)
    @ParameterizedTest
    @MethodSource("StringsProviders#asientosCancelados")
    void printChart(String[] asientos){
        theatreV2.printChart(theatreV2, asientosReservados);
    }

}

class StringsProviders{
    private static Stream<Arguments> asientosValidos(){
        return Stream.of(
                Arguments.of((Object) new String[]{"a3","A4","A7","D3","D4","D5","C7","B4","H7"})
        );
    }

    private static Stream<Arguments> asientosNoValidos(){
        return Stream.of(
                Arguments.of((Object) new String[]{"a0","A400","X7","","00","AA","D4"})
        );
    }

    private static Stream<Arguments> asientosCancelados(){
        return Stream.of(
                Arguments.of( (Object) new String[]{"A4"})
        );
    }

}
