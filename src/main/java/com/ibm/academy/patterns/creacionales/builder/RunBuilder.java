package com.ibm.academy.patterns.creacionales.builder;

public class RunBuilder {
    public static void main(String[] args) {
        Card visa = new Card.CardBuilder("VISA", " 000 111 222 333")
                .name("Alejandro Parker")
                .isCredit(false)
                .build();

        System.out.println("visa = " + visa);
        
        Card amex = new Card.CardBuilder("AMEX", "111 888 777 999")
                .name("Berenice Lopez")
                .build();
        System.out.println("amex = " + amex);
    }
}
