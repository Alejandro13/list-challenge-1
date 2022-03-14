import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.regex.Pattern;

@Getter
@Setter
@ToString
@EqualsAndHashCode
//@AllArgsConstructor
public class TheatreV2 {

    private String name;
    private List<Seat> seats;
    private int rows;
    private int numberSeats;

    public TheatreV2(String name, List<Seat> seats, int rows, int numberSeats){

        this.name = name;
        this.seats = seats;
        this.rows = rows;
        this.numberSeats = numberSeats;

    }


    public static List<String> reserve(String[] asientos, TheatreV2 theatreV2, List<String> asientosReservados) {

        for(String asiento : asientos){

            if(Pattern.matches("^[A-H]{1}[1-9]{1}$", asiento.toUpperCase())){
                char[] asientoChar = asiento.toCharArray();
                asiento = asiento.toUpperCase();
                //Obtenemos fila y columna
                String fila = asiento.substring(0,1).toUpperCase();
                String columna = asiento.substring(1);
                //Sacamos el #fila del hastMap
                int fila2 = asientoChar[0];//filaLetra.get(fila.charAt(0));
                int columna2 = Integer.parseInt(columna);



                //REVISAMOS SINO ESTA OCUPADO EL ASIENTO
                for(int i = 0 ; i< theatreV2.getNumberSeats(); i++){
                    if(asientosReservados.contains(asiento)){
                        //Si encontramos el asiento ocupado rompemos el ciclo y continuamos con el siguiente asiento
                        break;
                    } else if(theatreV2.seats.get(i).getRow() == fila.charAt(0) && theatreV2.seats.get(i).getCol() == columna2){
                        //Eliminamos el asiento del cine
                        theatreV2.seats.remove(i);
                        //Agregamos el asiento reservado
                        asientosReservados.add(asiento);
                        break;
                    }
                }

            }else{ //SI EL ASIENTO NO ES VALIDO
                System.out.println("EL ASIENTO " + asiento.toUpperCase() + " NO ES VALIDO");
            }
        }
        return asientosReservados;
    }

    public static List<String> cancelReservation(String[] asientos,TheatreV2 theatreV2, List<String> asientosReservados) {

        for(String asiento : asientos){
            boolean encontrado = false;

            if(Pattern.matches("^[A-H]{1}[1-9]{1}$", asiento.toUpperCase())){
                char[] asientoChar = asiento.toCharArray();
                asiento = asiento.toUpperCase();
                //Obtenemos fila y columna
                String fila = asiento.substring(0,1).toUpperCase();
                String columna = asiento.substring(1);
                //Sacamos el #fila del hastMap
                int fila2 = asientoChar[0];//filaLetra.get(fila.charAt(0));
                int columna2 = Integer.parseInt(String.valueOf(asientoChar[1]));//Integer.parseInt(columna);

                //REVISAMOS SINO ESTA OCUPADO EL ASIENTO
                if(asientosReservados.contains(asiento)){
                    //Sino encontramos el asiento en el cine, lo agregamos
                    Seat seat = new Seat((char) fila2, columna2, 50);
                    theatreV2.seats.add(seat);
                    //Despues lo borramos de los asientos reservados
                    asientosReservados.remove(asiento);
                }

            }else{ //SI EL ASIENTO NO ES VALIDO
                System.out.println("EL ASIENTO " + asiento.toUpperCase() + " NO ES VALIDO");
            }
        }
        return asientosReservados;
    }


    public void printChart(TheatreV2 auxCine, List<String> asientosReservados) {
        int num = 0;

        for(int i = 0; i < auxCine.getNumberSeats() ; i++){

                char fila = auxCine.seats.get(i).getRow();
                int columna = auxCine.seats.get(i).getCol();
                String asiento = String.valueOf(fila) + columna;
                //Si el asiento consultado se encuentra reservado, imprimimos el asiento
                if(asientosReservados.contains(asiento)){
                    System.out.print(asiento);
                    num++;
                }
                //Sino, imprimos el punto
                else{
                    System.out.print(". ");
                    num++;
                }
                //Solo 8 columnas
                if(num==auxCine.getRows()){
                    num = 0;
                    System.out.println();
                }


        }

    }
}
