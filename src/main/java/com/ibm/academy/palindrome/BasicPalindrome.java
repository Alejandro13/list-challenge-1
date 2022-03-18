package com.ibm.academy.palindrome;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicPalindrome {

    public static void main(String[] args) {
        boolean flag = false;
        /*flag = isPalindrome("ANA");
        System.out.println("flag = " + flag);
        flag = isPalindrome("bbaabb");
        System.out.println("flag = " + flag);*/
        flag = isPalindrome("kdsfsdf");
        System.out.println("flag = " + flag);

    }

    public static boolean isPalindrome(String cadena){
        Queue<Character> queue = new LinkedList<>();
        ArrayDeque<Character> deQue = new ArrayDeque<>();

        for(int i = 0; i < cadena.length(); i++){
            queue.add(cadena.charAt(i));
            deQue.add(cadena.charAt(i));
        }

        for(int j = 0; j < cadena.length(); j++){
            Character c1 = queue.poll();
            Character c2 = deQue.removeLast();

            if(c1 != c2){
                return false;
            }
        }
        return true;
    }
}
