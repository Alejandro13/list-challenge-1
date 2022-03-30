package com.ibm.academy.patterns.creacionales.builder.exercises;

public class Pizza {

    private final String sauce;
    private final String cheese;
    private final String baser;

    //Constructor privado
    private Pizza(PizzaBuilder pizzaBuilder){
        this.sauce = pizzaBuilder.sauce;
        this.cheese = pizzaBuilder.cheese;
        this.baser = pizzaBuilder.baser;
    }


    //Setter
    public String getSauce() {
        return this.sauce;
    }

    public String getCheese() {
        return this.cheese;
    }

    public String getBaser() {
        return this.baser;
    }

    //toString


    @Override
    public String toString() {
        return "Pizza{" +
                "sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", baser='" + baser + '\'' +
                '}';
    }

    public static class PizzaBuilder {
        private String sauce;
        private String cheese;
        private String baser;

        //Los atributos que deben existir forzosamente
        public PizzaBuilder(String sauce, String baser) {
            this.sauce = sauce;
            this.baser = baser;
        }

        //Creamos el builder
        public PizzaBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this; //Para seguir cadenandolo
        }

        //Metedo que regresa el resultado
        public Pizza bake() {
            return new Pizza(this);
        }
    }
}
