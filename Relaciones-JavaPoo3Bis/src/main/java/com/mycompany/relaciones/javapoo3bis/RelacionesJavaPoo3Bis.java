/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relaciones.javapoo3bis;

import Entidades.cartas;
import Servicios.ServiciosCarta;

/**
 *
 * @author Abel
 */
public class RelacionesJavaPoo3Bis {

    public static void main(String[] args) {
        
        
        cartas A = new cartas ();
        ServiciosCarta a1 = new ServiciosCarta();
        
        a1.crearMazo();
        a1.barajar(A);
    }
    
    
}
