/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.cartas;
import Enumeraciones.Palo;
import java.util.ArrayList;

/**
 *
 * @author Abel
 */
public class ServiciosCarta {
    //ArrayList<cartas> naipe = new ArrayList();
    
    public void crearMazo(){
    cartas a1 = new cartas();
    int cart = 0;
        for (int i = 0; i < 10; i++) {
            cart = cart+1;
            a1.setNumero(cart);
            
            for(Palo aux: Palo.values()){
                a1.setPalo(aux);
                System.out.println("la carta es: " + " " + a1.getNumero() + " de " + " " + a1.getPalo());
                
                //System.out.println("la carta es: " + naipe.get(i).getNumero()+ " de " + naipe.get(i).getPalo() );
            }
            
        }
      
       //System.out.println(naipe);
    }
    
    public void barajar(cartas a1){
        System.out.println(a1);
        int num = (int) (Math.random() * 10);
        
        
        for (int i = 0; i < 10; i++) {
            if (num<10) {
                
            
            num = num +1;
            a1.setNumero(num);
            //System.out.println("la carta es: " + " " + a1.getNumero() + " de " +  a1.getPalo());
           for(Palo aux: Palo.values()){
                a1.setPalo(aux);
                System.out.println("la carta es: " + " " + a1.getNumero() + " de " + " " + a1.getPalo());
        }
                for (int j = 0; j < 3; j++) {
                    a1.setPalo(Palo.oro);
                    a1.setPalo(Palo.basto);
                }
                
            }
             

        }
    }
}
