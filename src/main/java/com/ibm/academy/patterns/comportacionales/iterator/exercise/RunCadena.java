package com.ibm.academy.patterns.comportacionales.iterator.exercise;

public class RunCadena {
    public static void main(String[] args) {
        Cadena[] cadena = new Cadena[3];
        cadena[0] = new Cadena("[(practica*0.2)+");
        cadena[1] = new Cadena("(conducta * 0.1)] +");
        cadena[2] = new Cadena("(examen * 0.7)");

        Lista lista = new CadenaLista(cadena);
        Iterator it =  lista.iterator();

        while(it.hasNext()){

            Cadena texto = (Cadena) it.next();
            System.out.print(texto.getTexto());
        }


    }
}
