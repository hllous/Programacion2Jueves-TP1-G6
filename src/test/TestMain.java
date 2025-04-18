package test;

import models.Lista;
import models.Persona;
import models.Vehiculo;

public class TestMain {
    public static void main(String[] args) {
        Persona p = new Persona("Nicolas",22);
        Vehiculo v1 = new Vehiculo("JRT 179","VolksWagen","Automatico","Diesel",47.6,"Beige","Tiguan");
        Vehiculo v2 = new Vehiculo("AC 147 ZS","Toyota","Automatico","Gasolero",55,"Azul","Rav-4");
        Vehiculo v3 = new Vehiculo("AA 028 RR","Audi","Automatico","Gasolero",48,"Gris","Q5");
        Vehiculo v4 = new Vehiculo("AB 342 AR","Lexus","3 Pedales","Naftero",50,"Azul Marino","NX 350 F Sport");
        Vehiculo v5 = new Vehiculo("LKV 108","Fennec","A pedal","Boost",100,"Blanco Titanio","Fennec UltraBoost");
        Lista l = new Lista();
        p.setVehiculos(l);

        System.out.println(p.toString());
        System.out.println("----------------------------------------");
        System.out.println("Set de Pruebas de lista N°1\n");
        System.out.println("1) Pruebas Obtener e Imprimir");
        System.out.println("a) Ingreso el vehiculo N°1 como primero, imprimo el primero y el ultimo:\n");

        p.getVehiculos().insertarPrimero(v1);
        System.out.println(p.getVehiculos().obtenerPrimero());
        System.out.println(p.getVehiculos().obtenerUltimo());
        System.out.println();

        System.out.println("b) Ingreso el vehiculo N°2 como ultimo, imprimo el primero y el ultimo:\n");

        p.getVehiculos().insertarUltimo(v2);
        System.out.println(p.getVehiculos().obtenerPrimero());
        System.out.println(p.getVehiculos().obtenerUltimo());
        System.out.println();

        System.out.println("c) Ingreso el vehiculo N°3 en la posicion 1, imprimo el primero, el del medio y el ultimo:\n");

        l.insertarPosicion(v3,1);
        System.out.println(p.getVehiculos().obtenerPrimero());
        System.out.println(p.getVehiculos().obtenerPosicion(1));
        System.out.println(p.getVehiculos().obtenerUltimo());
        System.out.println();

        System.out.println("d) Agrego los vehiculos N°4 y N°5 e imprimo:\n");

        p.getVehiculos().insertarPrimero(v4);
        p.getVehiculos().insertarUltimo(v5);
        p.getVehiculos().mostrarListaPrincipioFinal();
        System.out.println();

        System.out.println("2) Pruebas Eliminar e Imprimir\n");
        System.out.println("a) Elimino el primero e imprimo");
        p.getVehiculos().eliminarPrimero();
        p.getVehiculos().mostrarListaPrincipioFinal();
        System.out.println();

        System.out.println("b) Elimino el 2do e imprimo solo y en conjunto");
        p.getVehiculos().eliminarPosicion(1);
        p.getVehiculos().mostrarListaPrincipioFinal();
        System.out.println();
        p.getVehiculos().mostrarListaFinalPrincipio();
        System.out.println();

        System.out.println("c) Elimino todos e imprimo");
        p.getVehiculos().eliminarPrimero();
        p.getVehiculos().eliminarUltimo();
        p.getVehiculos().eliminarPosicion(0);
        p.getVehiculos().mostrarListaPrincipioFinal();



    }
}