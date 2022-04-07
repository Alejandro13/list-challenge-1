package com.ibm.academy.patterns.estructurales.flyweight.exercise;

public class Goomba implements IEnemy{

    private String level;
    private final String LIFE;

    //Inicializamos la variable final en el constructor
    public Goomba() {
        this.LIFE = "3010";
    }
    @Override
    public void setLevel(String level) {
        this.level = level;
        System.out.println("Este es un Goomba : " + this.level);
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida de un Goomba es: " + this.LIFE);
    }
}
