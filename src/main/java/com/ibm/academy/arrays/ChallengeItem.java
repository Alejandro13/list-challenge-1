package com.ibm.academy.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ChallengeItem {

    public static void main(String[] args) {

        Item[] items = new Item[]{
                new Item(9, "Dell", 547),
                new Item(5, "Apple", 800),
                new Item(12, "Lenovo", 450)
        };

        CompararPrecio check = new CompararPrecio();
        Arrays.sort(items, check);
        System.out.println("Arreglo ordenado con Compare: "+Arrays.toString(items));

    }


}
 class CompararPrecio implements Comparator<Item>{
     @Override
     public int compare(Item o1, Item o2) {

         if(o1.getPrice() < o2.getPrice()){
             return -1;
         }else if(o1.getPrice() > o2.getPrice()) {
             return 1;
         }else{
             return 0;
         }
     }
 }