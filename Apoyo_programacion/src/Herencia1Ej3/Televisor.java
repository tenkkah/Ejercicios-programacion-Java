/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia1Ej3;

/**
 *
 * @author Aitor
 */
public class Televisor extends Electrodomestico{
    //Variables
    int resolucion;
    boolean sintonizador_TDT;

    //Constructores
    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintonizador_TDT = false;
    }

    public Televisor(double precioBase, double peso) {
        super();

    }

    public Televisor(double precioBase, double peso, String color, char miconsumo, int resolucion, boolean sintonizador_TDT) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color = MasterCtr.comprobarColor(color);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    @Override
    public double precioFinal() {

        double preciofinal = super.precioFinal();

        if (getResolucion() > 40) {
            preciofinal = (preciofinal * 30) / 100;
        }

        if (isSintonizador_TDT()) {
            preciofinal = preciofinal + 50;
        }

        return preciofinal;
    }

    //Geters & Seters
    public int getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(int pulgadas) {
        this.resolucion = pulgadas;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }
}
