/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareej01;

import Servicios.ServiciosPerro;
import Servicios.ServiciosPersona;
import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class JavaReEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        ArrayList<Persona> persona2 = new ArrayList();
        ArrayList<Perro> perro2 = new ArrayList();
        ServiciosPerro a1 = new ServiciosPerro();
        perro2 = a1.crearPerros();
        ServiciosPersona SP = new ServiciosPersona();
        persona2 = SP.crearPersonas();
    
        for (Persona persona : persona2) {
            System.out.println(perro2);
            System.out.println("Elija el perro a adpotar : ");
            int opc = leer.nextInt();
            if (!perro2.get(opc).isAdpot()) {
                persona.adoptar(perro2.get(opc));
                //perro2.remove(perro2.get(opc));
            }else{System.out.println("El perro ya está adoptado");}
        }
        System.out.println(persona2);
    }
    
    

//    Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.
}
