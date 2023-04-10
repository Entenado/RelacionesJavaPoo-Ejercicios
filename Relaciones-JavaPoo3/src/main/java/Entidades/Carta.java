
package Entidades;

import java.util.Arrays;


public class Carta {
    
  private String palo;
  private int numero = 0 ;
  private int cantidad;
  private int p;
  private int carta;

    public Carta(String palo, int cantidad, int p, int carta) {
        this.palo = palo;
        this.cantidad = cantidad;
        this.p = p;
        this.carta = carta;
    }
  

    public Carta(String palo, int cantidad, int p) {
        this.palo = palo;
        this.cantidad = cantidad;
        this.p = p;
    }
  
    public Carta(String palo, int cantidad) {
        this.palo = palo;
        this.cantidad = cantidad;
    }
  
    public Carta() {
    }

  
  public static void Carta() {

  }

  public Carta(int _numero, String _palo) {
    this.numero = _numero;
    this.palo = _palo;
  }

  public String getPalo() {
    return this.palo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setPalo(String _palo) {
    this.palo = _palo;
  }

  public void setNumero(int _numero) {
    this.numero = _numero;
  }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + ", cantidad=" + cantidad + ", p=" + p + ", carta=" + carta + '}';
    }

   

    
  
   
}
