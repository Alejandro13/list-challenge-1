package com.ibm.academy.patterns.comportacionales.memento;

public class Article {
    private String author;
    private String text;

    public Article(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public ArticleMemento createMemento(){
        ArticleMemento memento = new ArticleMemento(author,text);
        return memento; //return el memento que se acaba de crear
    }

    public void restoreMemento(ArticleMemento memento){
        //Obtenemos los valores que teniamos previamente
        this.author = memento.getAuthor();
        this.text = memento.getText();
    }


    //Aquí si van los getters y setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
