package com.ibm.academy.patterns.creacionales.builder.exercises;

public class RunPizzaBuilder {
    public static void main(String[] args) {
        Pizza normal = new Pizza.PizzaBuilder("tomate", "masa normal")
                .cheese("Extra queso")
                .bake();

        System.out.println("Pizza normal = " + normal);
        
        Pizza especial = new Pizza.PizzaBuilder("doble salsa de tomate", "masa especial")
                .cheese("queso cheddar y extra queso normal")
                .bake();
        System.out.println("Pizza especial = " + especial);

    }
}
