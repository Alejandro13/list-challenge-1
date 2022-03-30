package com.ibm.academy.patterns.creacionales.builder;

public class Card {
    //Lo hacemos final para utilizarlos con el builder
    private final String cardType;
    private final String name;
    private final String number;
    private final int expire;
    private final boolean isCredit;

    //Constructor
    private Card(CardBuilder cardBuilder){
        this.isCredit = cardBuilder.isCredit;
        this.number = cardBuilder.number;
        this.expire = cardBuilder.expire;
        this.name = cardBuilder.name;
        this.cardType = cardBuilder.cardType;
    }

    //Importante generar los getters
    public String getCardType() {
        return cardType;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getExpire() {
        return expire;
    }

    public boolean isCredit() {
        return isCredit;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Card{" +
                "cardType='" + cardType + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", expire=" + expire +
                ", isCredit=" + isCredit +
                '}';
    }

    //Una clase interna

    public static class CardBuilder{
        private String cardType;
        private String name;
        private String number;
        private int expire;
        private boolean isCredit;

        public CardBuilder(String cardType, String number){
            this.cardType = cardType;
            this.number = number;
        }

        //aqui se forma el builder
        public CardBuilder name(String name){
            this.name = name;
            return this; //Para seguir cadenandolo
        }

        public CardBuilder expire(int expire){
            this.expire = expire;
            return this; //Para seguir cadenandolo
        }

        public CardBuilder isCredit(boolean isCredit){
            this.isCredit = isCredit;
            return this; //Para seguir cadenandolo
        }

        //Metedo que regresa el resultado
        public Card build(){
            return new Card(this);
        }
    }
}
