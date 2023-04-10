/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javareej02.Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import javareej02.Entidades.Juego;
import javareej02.Entidades.Jugador;

/**
 *
 * @author nahuel
 */
public class ServiciosJuego {
    
    public Juego llenarJuego(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el numero de jugadores");
        ServiciosJugador SJ=new ServiciosJugador();
        int aux=leer.nextInt();
        Juego J=new Juego();
        J.setJugadores(new ArrayList<Jugador>());
        for (int i = 0; i < aux; i++) {
            System.out.println("ingrese los datos del " + (i+1) + "° jugador");
            J.setJugadores(SJ.CrearJugador());
        }
        ServiciosRevolver SR=new ServiciosRevolver();
        J.setRevolver(SR.LenarRevolver());
        return J;
    }
    
    public void Ronda(Juego J){
        boolean aux=false;
        ServiciosJugador SJ=new ServiciosJugador();
        do {
            for (Jugador p : J.getJugadores()) {
                System.out.println("es el turno del jugador " + p.getNombre());
              SJ.disparo(J.getRevolver(), p);
              aux=p.getMojado();
                if (aux) {
                    System.out.println("el jugador " + p.getNombre() + " se mojo");
                    break;
                }else{
                    System.out.println("el jugador " + p.getNombre() + " no se mojo");
                }
            }
        } while (!aux);
    }
}
