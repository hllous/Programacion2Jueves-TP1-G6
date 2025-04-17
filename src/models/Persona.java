package models;

import java.util.Arrays;

public class Persona {

    private String nombre;
    private int edad;
    private Lista[] vehiculos;

    // Getter y Setters

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public Lista[] getVehiculos() { return vehiculos; }
    public void setVehiculos(Lista[] vehiculos) { this.vehiculos = vehiculos;}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", vehiculos=" + Arrays.toString(vehiculos) +
                '}';
    }
}
