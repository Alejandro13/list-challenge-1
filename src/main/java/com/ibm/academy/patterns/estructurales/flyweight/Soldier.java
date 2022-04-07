package com.ibm.academy.patterns.estructurales.flyweight;

public class Soldier implements IEnemy{

    //Creamos dos atributos
    private String weapon;
    private final String lifePoints;

    public Soldier() {
        this.lifePoints = "200";
    }


    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("El arma de un soldado es: " + this.weapon);
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida de un soldado es: " + this.lifePoints);
    }
}
