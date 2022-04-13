package com.ibm.academy.patterns.comportacionales.memento;

public class RunMemento {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Article article = new Article("Cantinflas", "Ahí está el detalle");
        article.setText(article.getText() + " es una pelicula cómica");
        System.out.println("article = " + article.getText());
        careTaker.addMemento(article.createMemento()); // guardamos el memento

        //Prueba para obtener algo erroneo
        article.setText(article.getText() + " y protogonizada por Mario Moreno Cantinflas ");
        System.out.println("MEDIO BUENO = " + article.getText());
        careTaker.addMemento(article.createMemento()); // guardamos el memento

        article.setText(article.getText() + " y Leonardo Di Caprio");
        System.out.println("MALO = " + article.getText());
        //careTaker.addMemento(article.createMemento()); // guardamos el memento

        //Recumerando los mementos
        ArticleMemento memento1 = careTaker.getMemento(0);
        ArticleMemento memento2 = careTaker.getMemento(1);

        article.restoreMemento(memento1);
        System.out.println("Recuperado: " +article.getText());
        article.restoreMemento(memento2);
        System.out.println("Recuperado: "+article.getText());

        article.setText(article.getText() + " y otros actores");
        System.out.println("BUENO = " + article.getText());

    }
}
