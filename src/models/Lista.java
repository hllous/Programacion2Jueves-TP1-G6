package models;

import interfaces.*;

public class Lista implements ILista {

    private INodo primero;
    private INodo ultimo;

    // Constructor

    public Lista() {
        this.primero = null;
        this.ultimo=null;
    }

    // Instertar y Eliminar

    @Override
    public void insertarPrimero(Vehiculo vehiculo) {
        INodo nuevo = new Nodo(vehiculo);
        if(esVacia()){
            primero=nuevo;
            ultimo=nuevo;
            primero.setSiguiente(ultimo);
            ultimo.setAnterior(primero);
        } else {
            primero.setAnterior(nuevo);
            nuevo.setSiguiente(primero);
            primero=nuevo;
        }

    }

    @Override
    public void insertarUltimo(Vehiculo vehiculo) {
        INodo nuevo = new Nodo(vehiculo);
        if (esVacia()) {
            primero=nuevo;
            ultimo=nuevo;
            primero.setSiguiente(ultimo);
            ultimo.setAnterior(primero);
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo=nuevo;
        }
    }

    @Override
    public void eliminarPrimero() {
        if (!esVacia()) {
            primero = primero.getSiguiente();
            primero.setAnterior(null);
        }
    }

    @Override
    public void eliminarUltimo() {
        if (!esVacia()){
            ultimo = ultimo.getAnterior();
        }
    }

    @Override
    public void insertarPosicion(Vehiculo vehiculo, int posicion) {
        if (posicion == 0) {
            insertarPrimero(vehiculo);
        } else {

            INodo nuevo = new Nodo(vehiculo);
            INodo actual = primero;
            int contador = 0;

            while (actual != null && contador < posicion - 1) {
                actual = actual.getSiguiente();
                contador++;
            }

            if (actual == null) {
                throw new IndexOutOfBoundsException("Posición fuera de rango");
            }

            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }
    }

    @Override
    public void eliminarPosicion(int posicion) {

        // Caso que esta vacia

        if (esVacia()) {
            System.out.println("No se pudo eliminar la posicion" + posicion + "ya que la lista esta vacia");
        } else {

            // Caso posicion es la primera

            if (posicion == 0) {
                eliminarPrimero();
            } else {
                INodo actual = primero;
                int aux = 0;

                // Limite: (Llego al final de la lista) && (Llego a la posicion deseada)
                while (actual != null && aux < posicion-1) {
                    actual = actual.getSiguiente();
                    aux++;
                }

                actual.setSiguiente(actual.getSiguiente().getSiguiente());


            }
        }
    }

    // Obtener

    @Override
    public Vehiculo obtenerPrimero() {
        if (esVacia()){
            System.out.println("No se pudo obtener el primer dato ya que a lista esta vacia.");
        }
        return primero.getDato();
    }

    @Override
    public Vehiculo obtenerUltimo() {
        if (esVacia()){
            System.out.println("No se pudo obtener el ultimo dato ya que a lista esta vacia.");
        }
        return ultimo.getDato();
    }

    @Override
    public Vehiculo obtenerPosicion(int posicion) {
        INodo actual = primero;
        int contador = 0;

        while (actual != null && contador != posicion) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual == null) throw new IndexOutOfBoundsException("Posición fuera de rango");

        return actual.getDato();
    }

    // Metodos Auxiliares

    @Override
    public int cantidadElementos() {
        int contador = 0;
        INodo actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    @Override
    public int buscarSecuencial(Vehiculo vehiculo) {
        INodo actual = primero;
        int posicion = 0;

        while (actual != null) {
            if (actual.getDato() == vehiculo) {
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }

        return -1;
    }

    @Override
    public void mostrarLista() {
        INodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " -> \n");
            actual = actual.getSiguiente();
        }
        System.out.println("FinLista");
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }
}
