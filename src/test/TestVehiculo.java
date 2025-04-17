package test;

import models.Vehiculo;

public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("JRT 179","VolksWagen","Automatico","Diesel",47.6,"Beige","Tiguan");
        System.out.println(v1.toString());
        v1.setCapacidadTanque(60);
        System.out.println("Color del auto:" + v1.getColor());
        System.out.println(v1.toString());

    }
}
