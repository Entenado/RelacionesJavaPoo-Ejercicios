/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Abel
 */
public class Mazo {
    
    
   private ArrayList<Cartas> cart = new ArrayList();

    public Mazo() {
    }

    public ArrayList<Cartas> getMazo() {
        return cart;
    }

    public void setMazo(ArrayList<Cartas> mazo) {
        this.cart = mazo;
    }

    @Override
    public String toString() {
        return "Mazo{" + "mazo=" + cart + '}';
    }
   
}
