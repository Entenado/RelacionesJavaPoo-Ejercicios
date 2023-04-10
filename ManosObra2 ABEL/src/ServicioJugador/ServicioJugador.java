/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioJugador;

import Entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author nickl
 */
public class ServicioJugador {
    
      public Jugador crear(){
        
        Scanner leer = new Scanner(System.in);
        
        Jugador j = new Jugador();
      
        System.out.println("Igrese el nombre del jugador");
        j.setNombre(leer.nextLine());
        System.out.println("Ingrese apellido del juigador");
        j.setApellido(leer.nextLine());
        System.out.println("Ingrese la posicion del jugador");
        j.setPosicion(leer.nextLine());
        System.out.println("Ingrese el numero del jugador");
        j.setNumero(leer.nextInt());
        System.out.println(j);
        
        return j;
   
    }
    
}
