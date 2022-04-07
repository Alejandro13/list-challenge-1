package com.ibm.academy.patterns.estructurales.flyweight;

import java.util.HashMap;

public class EnemyFactory {
    //<String, Interface>
    private static HashMap<String, IEnemy> enemies = new HashMap<>();

    public static IEnemy getEnemy(String type){
        IEnemy enemy = null;
        //Para no crear objetos de más
        if(enemies.containsKey(type)){
            enemy = enemies.get(type);
        }else{
            switch (type){
                case "Soldier":
                    System.out.println("El soldado ha sido creado");
                    enemy = new Soldier();
                    break;
                case "Lider":
                    System.out.println("El lider ha sido creado");
                    enemy = new Leader();
                    break;
                default:
                    System.out.println("No se creó ningún enemigo");

            }
            enemies.put(type, enemy);
        }
        return enemy; //se regresa un objeto de tipo interface
    }
}
