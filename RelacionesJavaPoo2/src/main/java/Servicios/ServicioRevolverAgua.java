
package Servicios;

import Entidades.RevolverAgua;
import java.util.Arrays;



public class ServicioRevolverAgua {
    
    public RevolverAgua siguienteChorro(){
    RevolverAgua a1 = new RevolverAgua();
    int num1 = (int) (Math.random() * 10);
    a1.setPosicionActual((num1));
    int num2 = (int) (Math.random() * 10);
    a1.setPosicionAgua(num2);
    return a1;
    }
    
    public boolean mojar(RevolverAgua a1){
        RevolverAgua a2 = new RevolverAgua();
        boolean mojado = false;

        if (a2.getPosicionActual() == a1.getPosicionAgua()) {
            //System.out.println("te mojaste");
            mojado = true;
        }
        System.out.println("las posiciones para mojarse son :" + a2.getPosicionActual() + "   " + a1.getPosicionAgua());
        return mojado;
       
    }
    


   
}