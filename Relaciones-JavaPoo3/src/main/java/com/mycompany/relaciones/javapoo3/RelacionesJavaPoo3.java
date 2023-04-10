/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relaciones.javapoo3;

import Entidades.Carta;
import Servicios.ServicioBaraja;

/**
 *
 * @author Abel
 */
public class RelacionesJavaPoo3 {

    public static void main(String[] args) {
        
       Carta A = new Carta();
       
       ServicioBaraja a1 = new ServicioBaraja();
       a1.barajar();
       a1.siguienteCarta( A);
       
    }
}
