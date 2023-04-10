/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javareej02.Entidades;

/**
 *
 * @author nahuel
 */
public class Jugador {
    
    private String Nombre;
    private Long Id;
    private Boolean Mojado;

    public Jugador() {
    }

    public Jugador(String Nombre, Long Id, Boolean Mojado) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Mojado = Mojado;
    }

    public String getNombre() {
        return Nombre;
    }

    public Long getId() {
        return Id;
    }

    public Boolean getMojado() {
        return Mojado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setMojado(Boolean Mojado) {
        this.Mojado = Mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + Nombre + ", Id=" + Id + ", Mojado=" + Mojado + '}';
    }
    
    
}
