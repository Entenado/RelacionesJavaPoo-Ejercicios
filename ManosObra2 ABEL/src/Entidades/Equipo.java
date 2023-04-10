/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author nickl
 */
public class Equipo {

    private ArrayList<Jugador> jugador;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

}
