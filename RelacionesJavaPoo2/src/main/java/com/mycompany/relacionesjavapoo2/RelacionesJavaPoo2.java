

package com.mycompany.relacionesjavapoo2;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import Servicios.ServicioJugador;
import Servicios.ServicioRevolverAgua;
import java.util.Scanner;


public class RelacionesJavaPoo2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //ServicioRevolverAgua a1 = new ServicioRevolverAgua();
        //RevolverAgua A = new RevolverAgua ();
        
//        do {
//            
//        a1.siguienteChorro();
//        a1.mojar(A);
//        } while (a1.mojar(A)== false);
          ServicioJugador a1 = new ServicioJugador();
          Jugador A = new Jugador();
          String n = "si";
          do {
              a1.crearJugador();
              System.out.println("Desea agregar otro jugador? si/no");
              n = leer.next();
              
        } while (!"no".equals(n));

          
          do {
            a1.disparo(A);
        } while (a1.disparo(A) != true);
    }
}
