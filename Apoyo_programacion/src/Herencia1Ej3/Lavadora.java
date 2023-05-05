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
public class Lavadora extends Electrodomestico{
    //Variables
    int carga;

    //Constructores
    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(int precioBase, int peso) {
        super();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Lavadora(double precioBase, double peso, String color, char miconsumo, int carga) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.miConsumo = MasterCtr.comprobarConsumoEnergetico(miconsumo);
        this.color = MasterCtr.comprobarColor(color);
        this.carga = carga;
    }

    public double precioFinal() {

        double preciofinal = super.precioFinal();

        if (getCarga() > 30) {
            preciofinal += 50;
        }

        return preciofinal;
    }

    //Geters & Seters
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }


}