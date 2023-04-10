/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javareej02.Entidades;

/**
 *
 * @author nahuel
 */
public class Revolver {
    
    private int Pactual,Pagua,TTambor;

    public Revolver() {
    }

    public Revolver(int Pactual, int Pagua, int TTambor) {
        this.Pactual = Pactual;
        this.Pagua = Pagua;
        this.TTambor = TTambor;
    }

    public int getPactual() {
        return Pactual;
    }

    public int getPagua() {
        return Pagua;
    }

    public int getTTambor() {
        return TTambor;
    }

    public void setPactual(int Pactual) {
        this.Pactual = Pactual;
    }

    public void setPagua(int Pagua) {
        this.Pagua = Pagua;
    }

    public void setTTambor(int TTambor) {
        this.TTambor = TTambor;
    }

    @Override
    public String toString() {
        return "Rebolber:" + "Pocicion actual=" + Pactual + ", Pocicion del agua=" + Pagua + ", Tamaño del Tambor=" + TTambor;
    }
    
    
}
