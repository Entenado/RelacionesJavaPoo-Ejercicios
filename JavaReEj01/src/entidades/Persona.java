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
public class Persona {

    private String Nombre, Apellido;
    private Integer Edad, Documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, Integer Edad, Integer Documento, Perro perro) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Documento = Documento;
        this.perro = perro;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public Integer getDocumento() {
        return Documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public void setDocumento(Integer Documento) {
        this.Documento = Documento;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Documento=" + Documento + ", " +"\n"+ perro;
    }
    
    public void adoptar(Perro p){
    this.perro = p;
    p.setAdpot(true);
    }

}
