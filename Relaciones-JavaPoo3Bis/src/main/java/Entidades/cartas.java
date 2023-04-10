/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enumeraciones.Palo;
import java.util.Arrays;

/**
 *
 * @author Abel
 */
public class cartas {
    
    int numero ;
    Palo palo;

    public cartas(Palo palo) {
        this.palo = palo;
    }
    
    public cartas() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

 

    @Override
    public String toString() {
        return "cartas{" + "numero=" + numero + ", palo=" + palo + '}';
    }

    
   
    
}
