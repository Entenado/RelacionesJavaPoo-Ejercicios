/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javareej02.Servicios;

import java.util.Scanner;
import javareej02.Entidades.Jugador;
import javareej02.Entidades.Revolver;

/**
 *
 * @author nahuel
 */
public class ServiciosJugador {
    
    public Jugador CrearJugador() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Jugador J = new Jugador();
        System.out.println("ingrese el Nombre del jugador");
        J.setNombre(leer.next());
        System.out.println("ingrese el numero de id del jugador");
        J.setId(leer.nextLong());
        J.setMojado(false);
        return J;
    }
    
    public void disparo(Revolver R,Jugador J){
        ServiciosRevolver SR=new ServiciosRevolver();
        J.setMojado(SR.Mojar(R));
        SR.SiguienteChorro(R);
    }
    
    
}
