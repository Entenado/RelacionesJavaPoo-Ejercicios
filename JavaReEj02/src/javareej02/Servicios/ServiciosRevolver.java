/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javareej02.Servicios;

import java.util.Scanner;
import javareej02.Entidades.Revolver;

/**
 *
 * @author nahuel
 */
public class ServiciosRevolver {

    public Revolver LenarRevolver() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Revolver R = new Revolver();
        System.out.println("selecciones el tamaño del tambor del revolver, entre 4 y 12");
        R.setTTambor(leer.nextInt());
        R.setPactual((int) (Math.random() * R.getTTambor()));
        R.setPagua((int) (Math.random() * R.getTTambor()));
        return R;
    }
    
    public boolean Mojar(Revolver R){
        return (R.getPactual()==R.getPagua());
    }

    public void SiguienteChorro(Revolver R){
        if (R.getPactual()==(R.getTTambor()-1)) {
            R.setPactual(0);
        }else{
            R.setPactual(R.getPactual()+1);
        }
    }
    
    public void ToString(Revolver R){
        System.out.println(R.toString());
    }
}
