package com.rojasjuniore.recyclerviewjuntoacardviews;

/**
 * Created by Junior on 01/08/2016.
 */
public class Motivation {

    //Fuentes de Datos

    private int imagen;
    private String nombre;
    private int visita;

    public Motivation(int imagen, String nombre, int visita) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.visita = visita;
    }


    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVisita() {
        return visita;
    }
}
