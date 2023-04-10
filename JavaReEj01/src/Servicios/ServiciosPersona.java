/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class ServiciosPersona {

    public Persona CrearPersona() {
        //ServiciosPerro SP = new ServiciosPerro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona P = new Persona();
        System.out.println("ingrese el nombre de la persona");
        P.setNombre(leer.next());
        System.out.println("ingrese la Apellido de la persona");
        P.setApellido(leer.next());
        System.out.println("ingrese la edad de la persona");
        P.setEdad(leer.nextInt());
        System.out.println("ingrese el documento de la persona");
        P.setDocumento(leer.nextInt());
        //System.out.println("ingrese los datos del perro");
        //P.setPerro(SP.CrearPerro());
        return P;
    }
    
    public ArrayList<Persona> crearPersonas(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList(); 
        System.out.println("Cuantas personas estan en la lista de espera? ");
        int aux = leer.nextInt();
        for (int i = 0; i < aux; i++) {
            
            personas.add(CrearPersona());
        }
        System.out.println(personas);
        return personas;
    }
    
    public void MostrarPersona(Persona P){
        System.out.println(P.toString());
        
    }
    


}
