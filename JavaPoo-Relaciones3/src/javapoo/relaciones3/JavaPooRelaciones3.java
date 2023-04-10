/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapoo.relaciones3;

import Entidades.Cartas;
import Entidades.Mazo;
import Servicios.ServiciosCarta;
import java.util.ArrayList;

/**
 *
 * @author Abel
 */
public class JavaPooRelaciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cartas A = new Cartas ();
         //Mazo m = new Mazo();
         ArrayList<Cartas>cart = new ArrayList();
        ServiciosCarta a1 = new ServiciosCarta();
        
        Mazo m = a1.crearMazo();
        a1.barajar(m);
        a1.siguienteCarta(m);
        a1.cartasDisponibles(m);
        a1.darCartas(m);
        
        
    }
    }
    

