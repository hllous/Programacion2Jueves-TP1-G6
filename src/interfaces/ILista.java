package interfaces;

import models.Vehiculo;

public interface ILista {

    public boolean esVacia();
    public void insertarPrimero(Vehiculo vehiculo);
    public void insertarUltimo(Vehiculo vehiculo);
    public void insertarPosicion(Vehiculo vehiculo, int posicion);
    public void eliminarPrimero();
    public void eliminarUltimo();
    public void eliminarPosicion(int posicion);
    public Vehiculo obtenerPrimero();
    public Vehiculo obtenerUltimo();
    public Vehiculo obtenerPosicion(int posicion);
    public int cantidadElementos();
    public int buscarSecuencial(Vehiculo dato);
    public void mostrarLista();

}
