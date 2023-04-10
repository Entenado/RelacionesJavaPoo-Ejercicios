/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javareej02.Entidades;

import java.util.ArrayList;

/**
 *
 * @author nahuel
 */
public class Juego {
    
    
    private ArrayList<Jugador> Jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> Jugadores, Revolver revolver) {
        this.Jugadores = Jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }
    
    public void setJugadores(Jugador Jugador) {
        this.Jugadores.add(Jugador);
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "Jugadores=" + Jugadores + ", revolver=" + revolver + '}';
    }
    

    
}
