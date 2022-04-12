package com.ibm.academy.patterns.comportacionales.iterator;

public class RunIterator {
    public static void main(String[] args) {
        Card[] cards = new Card[5];
        cards[0] = new Card("VISA");
        cards[1] = new Card("AMERICA EXPRESS");
        cards[2] = new Card("MASTER GOLD");
        cards[3] = new Card("GOOGLE CARD");
        cards[4] = new Card("APPLE CARD");

        List lista = new CardList(cards);
        Iterator iterator = lista.iterator();

        while(iterator.hasNext()){
            Card tarjeta = (Card) iterator.next();
            System.out.println(tarjeta.getType());
        }
    }
}
