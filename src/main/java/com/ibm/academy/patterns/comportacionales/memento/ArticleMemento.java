package com.ibm.academy.patterns.comportacionales.memento;

public class ArticleMemento {
    private String author;
    private String text;

    public ArticleMemento(String author, String text) {
        this.author = author;
        this.text = text;
    }

    //Solo necesitamos los getters
    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
