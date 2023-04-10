
package Entidades;

import Servicios.Jugador;
import java.util.ArrayList;
import java.util.Arrays;


public class EntidadEquipo {
    ArrayList<Jugador> juga = new ArrayList();

    public EntidadEquipo() {
    }

    public ArrayList<Jugador> getJuga() {
        return juga;
    }

    public void setJuga(ArrayList<Jugador> juga) {
        this.juga = juga;
    }

    @Override
    public String toString() {
        return "EntidadEquipo{" + "juga=" + juga + '}';
    }

   

   
    
}
