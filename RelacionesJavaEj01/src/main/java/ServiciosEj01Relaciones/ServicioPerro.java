
package ServiciosEj01Relaciones;

import EntidadesEj01Relaciones.EntidadesPerro;
import java.util.Scanner;


public class ServicioPerro {
    
    public EntidadesPerro crearPerro(){
    Scanner leer = new Scanner(System.in);
    EntidadesPerro a1 = new EntidadesPerro();
        System.out.println("Ingrese el nombre del perro");
    a1.setNombre(leer.nextLine());
        System.out.println("Ingrese la raza del perro");
    a1.setRaza(leer.nextLine());
        System.out.println("Ingrese la edad del perro");
    a1.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro");
    a1.setTamaño(leer.next());
    
    return a1;
    }
}
