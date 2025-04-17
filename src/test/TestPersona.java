package test;

import models.*;
import interfaces.*;

public class TestPersona {
    public static void main(String[] args) {

        Persona p1 = new Persona("Nicolas",21);

        System.out.println(p1.toString());

        p1.setEdad(22);
        p1.setNombre("Guido");

        System.out.println(p1.toString());




    }
}
