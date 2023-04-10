

package com.mycompany.relaciones.javapoo1;

import Entidades.EntidadEquipo;
import Entidades.EntidadesJugador;
import Servicios.Equipo;
import Servicios.Jugador;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class RelacionesJavaPoo1 {

    public static void main(String[] args) {
        ArrayList<EntidadesJugador>juga = new ArrayList();
        Scanner leer = new Scanner(System.in);
        Jugador a2 = new Jugador ();
        Equipo a1 = new Equipo();

        
         String n = "si";
        while("si".equals(n)){
            System.out.println("desea agregar otro jugador a la lista?");
            n = leer.nextLine();
           a2.crearJ();
            System.out.println("los jugadores son : " + (a2).toString());
    }

    
    }
}
