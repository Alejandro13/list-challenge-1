package com.ibm.academy.theatre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Seat {
    //Create a com.ibm.academy.theatre.Seat class with line, row and price properties.
    private char row;
    private int col;
    private double price;
}
