package com.ibm.academy.palindrome;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

public class Palindrome {

    public static boolean isPalindrome(String word){

        MyQueue<String> queue = new MyQueue<>();
        ArrayDeque<String> deque = new ArrayDeque<>();

        for(String str : word.split("")){ //split("") para separar por caracteres
            queue.add(str);
            deque.add(str);
        }

        while (!queue.isEmpty()){
            String pq = queue.poll();
            String pdq = deque.pollLast();

            if(!pq.equals(pdq)){
                return false;
            }
        }
        return true;
    }

    //Se "customiza" la cola
    static class MyQueue<T> extends AbstractQueue<T> {

        LinkedList<T> elements = new LinkedList<>();

        @Override
        public Iterator iterator() {
            //return null;
            return elements.iterator();
        }

        @Override
        public int size() {
            //return 0;
            return elements.size();
        }

        @Override
        public boolean offer(Object o) {
            //return false;
            if(o == null) return false;
            return elements.add((T) o);
        }

        @Override
        public T poll() {
            //return null;
            T next = (T) iterator().next();
            if(next == null) return null;
            return (T)elements.remove();
        }

        @Override
        public T peek() {
            //return null;
            return (T)elements.getFirst();
        }
    }
}
