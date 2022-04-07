package com.ibm.academy.patterns.estructurales.flyweight.exercise;

public class Koopa implements IEnemy{

    private String level;
    private final String LIFE;

    //Inicializamos la variable final en el constructor
    public Koopa() {
        this.LIFE = "3000";
    }

    @Override
    public void setLevel(String level) {
        this.level = level;
        System.out.println("Este es un Koopa: " + this.level);
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida de un Koopa es: " + this.LIFE);
    }
}
