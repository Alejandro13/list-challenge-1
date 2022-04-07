package com.ibm.academy.patterns.estructurales.flyweight;

import java.util.Random;

public class runFly {
    public static String[] weapon = {"Fusil", "Revolver", "Resortera", "Lanza Cohetes","Metralleta", "Machete"};
    public static String[] enemyType = {"Soldier", "Lider"};

    public static void main(String[] args) {
        for(int i=0; i<15; i++){
            //Usamos la fabrica para crear los objetos
            IEnemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());//seteamos el arma
            enemy.lifePoints();
        }
    }

    //Metodo para elegir al azar un arma y un enemigo
    public static String getRandomEnemyType(){
        //Para los enemigos
        Random enemyRandom = new Random();
        int random = enemyRandom.nextInt(enemyType.length);
        return enemyType[random];
    }

    public static String getRandomWeapon(){
        //Para las armas
        Random weaponRandom = new Random();
        int random = weaponRandom.nextInt(weapon.length);
        return weapon[random];
    }
}
