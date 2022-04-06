package com.ibm.academy.patterns.estructurales.composite.exercise;

import com.ibm.academy.patterns.estructurales.composite.AccountComponent;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeImagenes implements Grafico{

    private List<Grafico> childImagenes;

    public GrupoDeImagenes(){
        this.childImagenes = new ArrayList<>();
    }

    @Override
    public void pintar() {
        for(Grafico imagen: this.childImagenes){
            imagen.pintar();
        }

    }

    //Nuevamente recibimos un valor de tipo interfaz
    public void addGrafico(Grafico imagen){
        this.childImagenes.add(imagen);
    }

    public void removeGrafico(Grafico imagen){
        this.childImagenes.remove(imagen);
    }
}
