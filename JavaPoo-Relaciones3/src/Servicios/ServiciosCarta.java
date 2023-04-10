/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cartas;
import Entidades.Mazo;
import Enumeraciones.Enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class ServiciosCarta {
    
    //ArrayList<cartas> naipe = new ArrayList();
    
    public Mazo crearMazo(){
        Mazo mazo = new Mazo();
        ArrayList<Cartas> cart = new ArrayList();
                

        for (Palo aux : Palo.values()) {
            for (int i = 0; i < 12; i++) {

                if (i < 7 || i > 8) {
                    
                    Cartas a1 = new Cartas();
                    a1.setPalo(aux);
                    a1.setNumero(i + 1);                    
                    cart.add(a1);
     System.out.println("la carta es: " + " " + a1.getNumero() + " de " + " " + a1.getPalo());
                }
              
               
                
            }

        }
        mazo.setMazo(cart);
     return mazo;
    }
    public Mazo barajar(Mazo m ){
        ArrayList<Cartas>cart = m.getMazo();
        Collections.shuffle(cart);
        m.setMazo(cart);
        System.out.println("----------------------------------");
        System.out.println(m.getMazo().toString());
        return m;
    }
    public Mazo siguienteCarta(Mazo m){
       
    Scanner leer = new Scanner(System.in);
        Cartas a1 = new Cartas();
        String n = "si";
        for (int i = 0; i < 12; i--) {
              
                while (!"no".equals(n)){
                    System.out.println("desea una carta? si / no");
                    n = leer.next();
                   
                m.getMazo().remove(i);
                a1.setCartasNegativasNum(m.getMazo().get(i).getNumero());
                a1.setCartasNegativasPalo(m.getMazo().get(i).getPalo());
                    System.out.println("tome!, su carta es el : " + m.getMazo().get(i).getNumero() + "de" + m.getMazo().get(i).getPalo());
                    m.getMazo().add(a1);
                }
        }
        
        return m;
    }
    
    public void cartasDisponibles(Mazo m){   
        int contador2 = 0;
        for (int i = 0; i < m.getMazo().size(); i++) {
            if (m.getMazo().get(i).getNumero() != 0) {
                
            contador2 = contador2 +1;
            System.out.println("el numero disponibles de cartas es  : " + contador2);

       }
        }
        
    }
    public void darCartas(Mazo m){
        Scanner leer = new Scanner(System.in);
        int cantidadCartas;
        System.out.println("Ingrese el numero de cartas que desea");
        cantidadCartas = leer.nextInt();
        
        //for (int i = 0; i < m.getMazo().size(); i++) {
            if (cantidadCartas <= m.getMazo().size()) {
                System.out.println("la cantidad de cartas que usted pidio son : " + cantidadCartas);
                
            }else{
            
                System.out.println("lo sentimos, no posee la cantidad de cartas que pide");
            }
        //}
        
    }
    public void cartasMonton(Mazo m, ArrayList<Cartas>cart){
    
        
            for (int i = 0; i < cart.size(); i++) {
                 if(cart != m.getMazo())
                System.out.println("las cartas son el : " + (cart).toString());
            }
           
    }

}
