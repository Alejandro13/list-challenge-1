package com.ibm.academy.patterns.estructurales.flyweight.exercise;

import java.util.Random;

public class RunEnemy {


    public static String[] level = {"NORMAL", "CON ALAS", "PODEROSO"};
    public static String[] enemyType = {"Koopa", "Goomba"};

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            //Usamos la fabrica para crear los objetos
            IEnemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setLevel(getRandomLevel());//seteamos el nivel
            enemy.lifePoints();
        }
    }

    public static String getRandomEnemyType(){
        //Para los enemigos
        Random enemyRandom = new Random();
        int random = enemyRandom.nextInt(enemyType.length);
        return enemyType[random];
    }

    public static String getRandomLevel(){
        //Para los niveles
        Random levelRandom = new Random();
        int random = levelRandom.nextInt(level.length);
        return level[random];
    }


}
