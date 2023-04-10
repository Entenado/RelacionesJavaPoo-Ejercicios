
package Entidades;


public class Dni {
    
    
    long numero;

    public Dni() {
    }

    public Dni(long numero) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "numero=" + numero + '}';
    }

 
    
    
    
}
