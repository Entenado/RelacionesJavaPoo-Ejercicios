
package Servicios;

import Entidades.EntidadEquipo;
import Entidades.EntidadesJugador;
import java.util.ArrayList;
import java.util.Scanner;


public class Jugador {
    ArrayList<EntidadesJugador>juga = new ArrayList();
    public EntidadesJugador crearJ(){
        Scanner leer = new Scanner(System.in);
    EntidadesJugador a1 = new EntidadesJugador();
        System.out.println("Igrese el nombre del jugador");
        a1.setNombre(leer.nextLine());
        System.out.println("Ingrese apellido del juigador");
        a1.setApellido(leer.nextLine());
        System.out.println("Ingrese la posicion del jugador");
        a1.setPosicion(leer.nextLine());
        System.out.println("Ingrese el numero del jugador");
        a1.setNumero(leer.nextInt());
        System.out.println(a1);
        juga.add(a1);
        return a1;
         
    }
    
    
}
