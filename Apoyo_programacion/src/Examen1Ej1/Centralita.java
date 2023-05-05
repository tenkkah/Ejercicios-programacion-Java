/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Ej1;


public class Centralita {
    private int llamadastotales;
    private double costeTotal;

    public Centralita() {
    }

   /* public Centralita(int llamadastotales, double costeTotal) {
        this.llamadastotales = llamadastotales;
        this.costeTotal = costeTotal;
    }*/

    public int getLlamadastotales() {
        return llamadastotales;
    }

    public void setLlamadastotales(int llamadastotales) {
        this.llamadastotales = llamadastotales;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    @Override
    public String toString() {
        return "Centralita{" + "llamadastotales=" + llamadastotales + ", costeTotal=" + costeTotal + '}';
    }

    public void RegistrarLlamada(int coste){
        llamadastotales++;
        costeTotal = costeTotal + coste;
    }
    
    
    
}
