
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioJugador {
    ArrayList<Jugador>jugador = new ArrayList();
    public Jugador crearJugador(){
        Jugador a2 = new Jugador();
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el nombre del jugiador");
        a2.setNombre(leer.nextLine());
        System.out.println("Ingrese el id del jugador");
        a2.setId(leer.nextInt());
        jugador.add(a2);
        System.out.println(jugador);
        return a2;
    }
    public boolean disparo(Jugador a2){
        RevolverAgua a1 = new RevolverAgua();
        ServicioRevolverAgua SR = new ServicioRevolverAgua();
        boolean mojado= false;
//        int alu= 0;
            
        for (int i = 0; i < jugador.size(); i++) {
            //int alu =jugador.get(i).getId();
            SR.siguienteChorro();
            SR.mojar (a1);
            if (SR.mojar(a1)== true) {
                System.out.println("MOJADO");
                String alu = jugador.get(i).getNombre();
                System.out.println("el alumno mojado es: " + alu);
                a2.setMojado(true);
                jugador.add(a2);
                mojado= true;
            }
        }
       // System.out.println("El alumno mojado es el del ID: " + alu);
    return mojado;
    }
    
    
}
