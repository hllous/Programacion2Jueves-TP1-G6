package interfaces;

import models.Vehiculo;

public interface ILista {



    // Instertar y Eliminar

    public void insertarPrimero(Vehiculo vehiculo);
    public void insertarUltimo(Vehiculo vehiculo);
    public void eliminarPrimero();
    public void eliminarUltimo();
    public void insertarPosicion(Vehiculo vehiculo, int posicion);
    public void eliminarPosicion(int posicion);

    // Obtener

    public Vehiculo obtenerPrimero();
    public Vehiculo obtenerUltimo();
    public Vehiculo obtenerPosicion(int posicion);

    // Metodos Auxiliares

    public int cantidadElementos();
    public int buscarSecuencial(Vehiculo dato);
    public void mostrarLista();
    public boolean esVacia();

}
