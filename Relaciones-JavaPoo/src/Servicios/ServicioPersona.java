
package Servicios;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Scanner;


public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    
    

    
    public Persona crearPersona(){
        ServicioDni SD = new ServicioDni();
        Scanner leer = new Scanner(System.in);
        Persona a1 = new Persona();
        System.out.println("Ingrese el nombre del sujeto");
        a1.setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido del sujeto");
        a1.setApellido(leer.nextLine());
        a1.setDni(SD.dni());
        System.out.println("el nombre de la persona es: " + a1.getNombre() + " el apellido de la persona es: " + a1.getApellido()+ " El dni de la persona es: " + SD.dni().toString());
        return a1;
    }

    
   
}
  