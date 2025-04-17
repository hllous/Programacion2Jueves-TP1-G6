package models;

import interfaces.*;

public class Lista implements ILista {

    private INodo primero;
    private INodo ultimo;

    public Lista() {
        this.primero = null;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public void insertarPrimero(Vehiculo vehiculo) {
        INodo nuevo = new Nodo(vehiculo);
        nuevo.setSiguiente(primero);
        primero = nuevo;
    }

    @Override
    public void insertarUltimo(Vehiculo vehiculo) {
        INodo nuevo = new Nodo(vehiculo);
        if (esVacia()) {
            primero = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
        }
    }

    @Override
    public void insertarPosicion(Vehiculo vehiculo, int posicion) {
        if (posicion == 0) {
            insertarPrimero(vehiculo);
            return;
        }

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

    @Override
    public void eliminarPrimero() {
        if (!esVacia()) {
            primero = primero.getSiguiente();
        }
    }

    @Override
    public void eliminarUltimo() {
        if (esVacia()) return;

        if (primero.getSiguiente() == null) {
            primero = null;
            return;
        }

        INodo actual = primero;
        while (actual.getSiguiente().getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(null);
    }

    @Override
    public void eliminarPosicion(int posicion) {
        if (esVacia()) return;

        if (posicion == 0) {
            eliminarPrimero();
            return;
        }

        INodo actual = primero;
        int contador = 0;

        while (actual.getSiguiente() != null && contador < posicion - 1) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual.getSiguiente() == null) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }

        actual.setSiguiente(actual.getSiguiente().getSiguiente());
    }

    // Obtener

    @Override
    public Vehiculo obtenerPrimero() {
        if (esVacia()) throw new IllegalStateException("Lista vacía");
        return primero.getDato();
    }

    @Override
    public Vehiculo obtenerUltimo() {
        if (esVacia()) throw new IllegalStateException("Lista vacía");

        INodo actual = primero;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    @Override
    public Vehiculo obtenerPosicion(int posicion) {
        INodo actual = primero;
        int contador = 0;

        while (actual != null && contador < posicion) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual == null) throw new IndexOutOfBoundsException("Posición fuera de rango");

        return actual.getDato();
    }

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

        return -1; // no encontrado
    }

    @Override
    public void mostrarLista() {
        INodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }
}
