
package Servicios;

import Entidades.Dni;
import java.util.Scanner;


public class ServicioDni {
    Scanner leer = new Scanner(System.in);
        public Dni dni(){
            Dni a2 = new Dni();
            
        System.out.println("Ingrese el numero de dni");
        a2.setNumero(leer.nextLong());
        return a2;
        
    }
}
