package interfaces;

public interface ILista {

    public boolean esVacia();
    public  void insertarPrimero(int dato);
    public void insertarUltimo(int dato);
    public void insertarPosicion(int dato, int posicion);
    public void eliminarPrimero();
    public void eliminarUltimo();
    public  void eliminarPosicion(int posicion);
    public int obtenerPrimero();
    public int obtenerUltimo();
    public  int obtenerPosicion(int posicion);
    public int cantidadElementos();
    public  int buscarSecuencial(int dato);
    public  void ordenarLista();
    public void mostrarLista();

}
