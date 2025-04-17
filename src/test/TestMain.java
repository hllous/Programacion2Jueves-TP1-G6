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

        System.out.println("----------------------------------------");
        System.out.println("Set de Pruebas de lista N°1\n");
        System.out.println("1) Pruebas Obtener e Imprimir");
        System.out.println("Ingreso el vehiculo N°1 como primero, imprimo el primero y el ultimo:\n");

        l.insertarPrimero(v1);
        System.out.println(l.obtenerPrimero());
        System.out.println(l.obtenerUltimo());
        System.out.println();

        System.out.println("Ingreso el vehiculo N°2 como ultimo, imprimo el primero y el ultimo:\n");

        l.insertarUltimo(v2);
        System.out.println(l.obtenerPrimero());
        System.out.println(l.obtenerUltimo());
        System.out.println();

        System.out.println("Ingreso el vehiculo N°3 en la posicion 1, imprimo el primero, el del medio y el ultimo:\n");

        l.insertarPosicion(v3,1);
        System.out.println(l.obtenerPrimero());
        System.out.println(l.obtenerPosicion(1));
        System.out.println(l.obtenerUltimo());
        System.out.println();

        System.out.println("Agrego los vehiculos N°4 y N°5 e imprimo:\n");

        l.insertarPrimero(v4);
        l.insertarUltimo(v5);
        l.mostrarListaPrincipioFinal();
        System.out.println();

        System.out.println("2) Pruebas Eliminar e Imprimir\n");
        System.out.println("Elimino el primero e imprimo");
        l.eliminarPrimero();
        l.mostrarListaPrincipioFinal();
        System.out.println();

        System.out.println("Elimino el 2do e imprimo solo y en conjunto");
        l.eliminarPosicion(1);
        l.mostrarListaPrincipioFinal();
        l.mostrarListaFinalPrincipio();
        System.out.println();

        System.out.println("Elimino todos e imprimo");
        l.eliminarPrimero();
        l.eliminarUltimo();
        l.eliminarPosicion(0);
        l.mostrarListaPrincipioFinal();



    }
}