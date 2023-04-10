
package Servicios;

import Entidades.Carta;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class ServicioBaraja {
    ArrayList<Carta> barajas = new ArrayList<Carta>();

    public Carta barajar(){
        Carta a1 = new Carta();
    String Palo[] = {"Oros","Bastos","Espadas","Copas"}; //Array con el valor de los palos de la baraja
    Scanner leer = new Scanner(System.in);
    System.out.println("Diga el número de cartas que desea:");
    a1.setCantidad(leer.nextInt());
    
    while (a1.getCantidad() > 0) {
      a1.setNumero( ((int) Math.round(Math.random() * 11)) + 1); // produce números entre 1 y 12 aleatoriamente
      a1.setP ((int) Math.round(Math.random() * 3)); // produce números entre 0 y 3 aleatoriamente
      boolean existe = false;
      Carta baraja = new Carta(a1.getNumero(), Palo[a1.getP()]); // Creamos la baraja
      for(int i = 0; i < barajas.size(); i++) {
        if(a1.getNumero() == barajas.get(i).getNumero() && (Palo[a1.getP()] == null ? barajas.get(i).getPalo() == null : Palo[a1.getP()].equals(barajas.get(i).getPalo()))) { // comparamos la baraja con las ya almacenadas
          existe = true;
          break; // Si la baraja ya fue seleccionada no se sigue verificando
        }
      }
      if(!existe) {
        barajas.add(baraja); // solo añadimos la baraja si es diferente a todas las ya escogidas
        
        a1.setCantidad(a1.getCantidad()- 1);
      }
    }
  barajas.forEach(baraja -> System.out.println("Baraja: " + baraja.getNumero() + " de " + baraja.getPalo()));
        return a1;
        
        
        
        
    }
    
    public void siguienteCarta (Carta a1){
        
        Carta a2= new Carta();
        
        Scanner leer = new Scanner(System.in);
       String n = "si";
       int cart = 40;
       
     for(int i = 0; i < barajas.size(); i++) {
        while(!"no".equals(n)){
            i = i+1;
            System.out.println("Desea otra carta del maso?");
            n = leer.next();
        barajas.get(i).getNumero();
        barajas.get(i).getPalo();
        
         System.out.println("la siguiente carta es: " + barajas.get(i).getNumero()+ "de" + barajas.get(i).getPalo());
         a2.setCarta(cart-1);
            System.out.println("quedan en el mazo : " + a2.getCarta() + "cartas");
        }
    }
     
    }
    public void cartasDisponibles(Carta a2){
    
        
    }
}
