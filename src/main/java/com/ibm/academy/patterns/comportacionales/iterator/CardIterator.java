package com.ibm.academy.patterns.comportacionales.iterator;

public class CardIterator implements Iterator{

    private Card[] cards;
    private int position;

    public CardIterator(Card[] cards) {
        this.cards = cards;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(this.position >= cards.length){
            return false;
        }
        return true; //puedes seguir recorriendo la lista
    }

    @Override
    public Object next() {
        return cards[this.position++]; //El siguiente elemento
    }

    @Override
    public Object currentItem() {
        return this.cards[this.position];
    }
}
