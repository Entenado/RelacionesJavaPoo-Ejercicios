/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javareej02;

import javareej02.Entidades.Juego;
import javareej02.Servicios.ServiciosJuego;

/**
 *
 * @author nahuel
 */
public class JavaReEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosJuego SJ=new ServiciosJuego();
        Juego J=SJ.llenarJuego();
        SJ.Ronda(J);
    }
    
}
