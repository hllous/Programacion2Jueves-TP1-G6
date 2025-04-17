package models;

public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private double capacidadTanque;
    private String tipoCombustible;
    private String tipoCaja;

    public String getPatente() { return patente; }

    public void setPatente(String patente) { this.patente = patente; }

    public String getTipoCaja() { return tipoCaja; }

    public void setTipoCaja(String tipoCaja) { this.tipoCaja = tipoCaja; }

    public String getTipoCombustible() { return tipoCombustible; }

    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getCapacidadTanque() { return capacidadTanque; }

    public void setCapacidadTanque(double capacidadTanque) { this.capacidadTanque = capacidadTanque; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public Vehiculo(String patente, String marca, String tipoCaja, String tipoCombustible, double capacidadTanque, String color, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.tipoCaja = tipoCaja;
        this.tipoCombustible = tipoCombustible;
        this.capacidadTanque = capacidadTanque;
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", capacidadTanque=" + capacidadTanque +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", tipoCaja='" + tipoCaja + '\'' +
                '}';
    }
}
