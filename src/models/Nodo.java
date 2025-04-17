package models;

import interfaces.*;

public class Nodo implements INodo {

    private Vehiculo vehiculo;
    private INodo siguiente;
    private INodo anterior;

    public Nodo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.siguiente = null;
    }

    // Getter y Setters

    @Override
    public Vehiculo getDato() {
        return vehiculo;
    }

    @Override
    public void setDato(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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
