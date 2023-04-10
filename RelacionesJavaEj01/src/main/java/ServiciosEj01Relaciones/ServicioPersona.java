
package ServiciosEj01Relaciones;

import EntidadesEj01Relaciones.EntidadesPersona;
import java.util.Scanner;

public class ServicioPersona {
    
    public EntidadesPersona crearPersona (){
        Scanner leer = new Scanner(System.in);
        ServicioPerro a2 = new ServicioPerro();
    EntidadesPersona a1 = new EntidadesPersona();
        System.out.println("Ingrese el nombre de la persona");
    a1.setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido de la persona");
    a1.setApellido(leer.nextLine());
        System.out.println("Ingrese la edad de la persona");
        
    a1.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento de la persona");
    a1.setDocumento(leer.nextInt());
    a1.setPerro(a2.crearPerro());
    
        return a1;
    }
}
