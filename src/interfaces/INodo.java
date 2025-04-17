package interfaces;

import models.Vehiculo;

public interface INodo {

    // Getter y Setters

    public Vehiculo getDato();
    public void setDato(Vehiculo vehiculo);
    public INodo getSiguiente();
    public void setSiguiente(INodo nodo);
    public INodo getAnterior();
    public void setAnterior(INodo nodo);

}
