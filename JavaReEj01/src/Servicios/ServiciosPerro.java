/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class ServiciosPerro {
    
    public Perro CrearPerro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perro P=new Perro();
        System.out.println("ingrese el nombre del perro");
        P.setNombre(leer.next());
        System.out.println("ingrese la raza del perro");
        P.setRaza(leer.next());
        System.out.println("ingrese la edad del perro");
        P.setEdad(leer.nextInt());
        System.out.println("ingrese el tamaño del perro");
        P.setTamanio(leer.next());
        return P;
    }
    
        public ArrayList<Perro> crearPerros(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Perro> perros = new ArrayList(); 
        System.out.println("Cuantas perros estan en la lista de espera? ");
        int aux = leer.nextInt();
        for (int i = 0; i < aux; i++) {
            
            perros.add(CrearPerro());
        }
        System.out.println(perros);
        return perros;
    }
        
        
        
}
