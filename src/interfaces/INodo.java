package interfaces;

import models.Vehiculo;

public interface INodo {

    public Vehiculo getDato();
    public void setDato(Vehiculo vehiculo);
    public INodo getSiguiente();
    public void setSiguiente(INodo nodo);
    public INodo getAnterior();
    public void setAnterior(INodo nodo);

}
