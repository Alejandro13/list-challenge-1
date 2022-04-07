package com.ibm.academy.patterns.estructurales.flyweight;

public class Leader implements IEnemy{
    //Creamos dos atributos
    private String weapon;
    private final String lifePoints;

    public Leader() {
        this.lifePoints = "200";
    }


    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("El arma del lider es: " + this.weapon);
    }

    @Override
    public void lifePoints() {
        System.out.println("La vida de un lider es: " + this.lifePoints);
    }
}
