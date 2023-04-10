
package Entidades;


public class RevolverAgua {
    //int posicionActual  ;
    //int posicionAgua ;
    int posicionActual = (int) (Math.random() * 10);
    int posicionAgua = (int) (Math.random() * 10);
    public RevolverAgua() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    
}
