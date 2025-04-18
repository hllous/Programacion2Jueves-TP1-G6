package models;

import interfaces.*;

public class Lista implements ILista {

    private INodo primero;
    private INodo ultimo;

    // Constructor

    public Lista() {
        this.primero=null;
        this.ultimo=null;
    }

    // Instertar y Eliminar

    @Override
    public void insertarPrimero(Vehiculo vehiculo) {
        INodo nuevo = new Nodo(vehiculo);
        if(esVacia()){
            primero=nuevo;
            ultimo=nuevo;
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
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo=nuevo;
        }
    }

    @Override
    public void eliminarPrimero() {
        if (!esVacia()) {
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else {
                primero = primero.getSiguiente();
                primero.setAnterior(null);
            }
        }
    }


    @Override
    public void eliminarUltimo() {
        if (!esVacia()) {
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else {
                ultimo = ultimo.getAnterior();
                ultimo.setSiguiente(null);
            }
        }
    }

    @Override
    public void insertarPosicion(Vehiculo vehiculo, int posicion) {

        // Caso primera posicion
        if (posicion == 0) {
            insertarPrimero(vehiculo);
        } else {
            INodo actual = primero;
            int contador = 0;

            while (actual != null && contador < posicion) {
                actual = actual.getSiguiente();
                contador++;
            }

            if(actual==primero){    // Caso si es primero
                insertarPrimero(vehiculo);
            } else if (actual == ultimo ) {     // Caso si es ultimo

                if(cantidadElementos()>2){
                    insertarUltimo(vehiculo);
                } else {
                    INodo nuevo = new Nodo(vehiculo);
                    nuevo.setSiguiente(ultimo);
                    nuevo.setAnterior(primero);
                    primero.setSiguiente(nuevo);
                    ultimo.setAnterior(nuevo);
                }


            } else {
                INodo nuevo = new Nodo(vehiculo);
                nuevo.setSiguiente(actual.getSiguiente());
                nuevo.setAnterior(actual);
                actual.getSiguiente().setAnterior(nuevo);
                actual.setSiguiente(nuevo);
            }
        }
    }

    @Override
    public void eliminarPosicion(int posicion) {

        // Caso que esta vacia

        if (esVacia()) {
            System.out.println("No se pudo eliminar la posicion" + posicion + "ya que la lista esta vacia");
        } else {
            INodo actual = primero;
            int aux = 0;

            // Limite: (Llego al final de la lista) && (Llego a la posicion deseada)
            while (actual != null && aux < posicion) {
                actual = actual.getSiguiente();
                aux++;
            }

            if (actual == null) {
                System.out.println("El dato en esa posicion no existe");
            } else if (actual == primero) {
                eliminarPrimero();
            } else if(actual==ultimo) {
                eliminarUltimo();
            }else {
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
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
            actual = actual.getSiguiente();
            contador++;
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
    public void mostrarListaPrincipioFinal() {
        INodo actual = primero;
        System.out.print("InicioLista \n-> ");
        while (actual != null) {
            System.out.print(actual.getDato() + " -> \n");
            actual = actual.getSiguiente();
        }
        System.out.println("FinLista");
    }

    @Override
    public void mostrarListaFinalPrincipio() {
        INodo actual = ultimo;
        System.out.print("InicioLista \n-> ");
        while (actual != null) {
            System.out.print(actual.getDato() + " -> \n");
            actual = actual.getAnterior();
        }
        System.out.println("FinLista");
    }


    @Override
    public boolean esVacia() {
        return primero == null;
    }
}
