/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author nahuel
 */
public class Perro {

    private String Nombre, Raza, Tamanio;
    private Integer Edad;
    private boolean adopt;

    public Perro(String Nombre, String Raza, String Tamanio, Integer Edad) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Tamanio = Tamanio;
        this.Edad = Edad;
        this.adopt = false;
    }
    
    public Perro() {
    }

//    public Perro(String Nombre, String Raza, String Tamanio, Integer Edad) {
//        this.Nombre = Nombre;
//        this.Raza = Raza;
//        this.Tamanio = Tamanio;
//        this.Edad = Edad;
//    }

    public String getNombre() {
        return Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public boolean isAdpot() {
        return adopt;
    }

    public void setAdpot(boolean adpot) {
        this.adopt = adpot;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + Nombre + ", Raza=" + Raza + ", Tamanio=" + Tamanio + ", Edad=" + Edad + ", adpot=" + adopt + '}';
    }

    
   

}
