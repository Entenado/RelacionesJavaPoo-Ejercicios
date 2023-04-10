/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enumeraciones.Enumeraciones.Palo;

/**
 *
 * @author Abel
 */
public class Cartas {
    
     int numero ;
     Palo palo;
     int cartasNegativasNum ;
     Palo cartasNegativasPalo;

    public Cartas(int numero, Palo palo, int cartasNegativasNum, Palo cartasNegativasPalo) {
        this.numero = numero;
        this.palo = palo;
        this.cartasNegativasNum = cartasNegativasNum;
        this.cartasNegativasPalo = cartasNegativasPalo;
    }

    
     
    public Cartas(Palo palo) {
        this.cartasNegativasNum = 40;
        this.palo = palo;
    }
    
    public Cartas() {
        this.cartasNegativasNum = 40;
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

    public int getCartasNegativasNum() {
        return cartasNegativasNum;
    }

    public void setCartasNegativasNum(int cartasNegativasNum) {
        this.cartasNegativasNum = cartasNegativasNum;
    }

    public Palo getCartasNegativasPalo() {
        return cartasNegativasPalo;
    }

    public void setCartasNegativasPalo(Palo cartasNegativasPalo) {
        this.cartasNegativasPalo = cartasNegativasPalo;
    }

    @Override
    public String toString() {
        return "Cartas{" + "numero=" + numero + ", palo=" + palo + ", cartasNegativasNum=" + cartasNegativasNum + ", cartasNegativasPalo=" + cartasNegativasPalo + '}';
    }

 



}
