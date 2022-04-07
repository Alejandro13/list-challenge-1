package com.ibm.academy.patterns.estructurales.flyweight.exercise;

import java.util.*;

public class EnemyFactory {
    private static HashMap<String, IEnemy> enemies = new HashMap<>();

    public static IEnemy getEnemy(String type){
        //Valor a regresar
        IEnemy enemy = null;
        if(enemies.containsKey(type)){
            enemy = enemies.get(type);
        }else{
            switch (type) {
                case "Koopa":
                    System.out.println("Se ha creado un Koopa");
                    enemy = new Koopa();
                    break;
                case "Goomba":
                    System.out.println("Se ha creado un Goomba");
                    enemy = new Goomba();
                    break;
                default:
                    System.out.println("No se ha creado nada");
            }
        }
        return enemy;
    }


}
