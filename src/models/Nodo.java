package models;

import interfaces.*;

public class Nodo implements INodo {

    private int dato;
    private INodo siguiente;
    private INodo anterior;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Getter y Setters

    @Override
    public int getDato() {
        return dato;
    }

    @Override
    public void setDato(int dato) {
        this.dato = dato;
    }

    @Override
    public INodo getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(INodo nodo) {
        this.siguiente = nodo;
    }

    @Override
    public INodo getAnterior() { return anterior; }

    @Override
    public void setAnterior(INodo anterior) { this.anterior = anterior; }
}
