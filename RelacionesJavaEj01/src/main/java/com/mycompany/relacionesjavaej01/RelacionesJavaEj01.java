

package com.mycompany.relacionesjavaej01;


import ServiciosEj01Relaciones.ServicioPerro;
import ServiciosEj01Relaciones.ServicioPersona;


public class RelacionesJavaEj01 {

    public static void main(String[] args) {

        ServicioPerro a1 = new ServicioPerro();
        ServicioPersona P1 = new ServicioPersona();
        System.out.println("la primer persona con su perro será: " + P1.crearPersona());
        ServicioPersona P2 = new ServicioPersona();
        ServicioPerro a2 = new ServicioPerro();
        System.out.println("la segunda persona con su perro será: " + P2.crearPersona());
    }
}
