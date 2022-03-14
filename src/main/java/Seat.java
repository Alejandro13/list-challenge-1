import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Seat {
    //Create a Seat class with line, row and price properties.
    private char row;
    private int col;
    private double price;
}
