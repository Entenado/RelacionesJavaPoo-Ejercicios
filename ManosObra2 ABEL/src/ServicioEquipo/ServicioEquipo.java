/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioEquipo;

import Entidades.Equipo;
import ServicioJugador.ServicioJugador;

/**
 *
 * @author nickl
 */
public class ServicioEquipo {
    
    public Equipo crearEquipo(){
        
        Equipo e = new Equipo();
        
        ServicioJugador s = new ServicioJugador();
        
        s.crear();
        
   
        
        return e;
    }
    
}
