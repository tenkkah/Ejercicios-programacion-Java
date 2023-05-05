/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia2Ej1;


public class Perecedero extends Producto{
    private int dias_caducar;

    public Perecedero(int dias_caducar, String nombre, double precio) {
        super(nombre, precio);
        this.dias_caducar = dias_caducar;
    }
    
    //Metodos

    public int getDias_caducar() {
        return dias_caducar;
    }

    public void setDias_caducar(int dias_caducar) {
        this.dias_caducar = dias_caducar;
    }

    public double calcular(int cantidad){
        double precioFinal = super.calcular(cantidad);
           switch(dias_caducar){
               case 1: precioFinal/=4;
                    break;
               case 2:precioFinal/=3;
                    break;
               case 3:precioFinal/=2;
                    break;
           }
        return precioFinal;
    }
    
    
    @Override
    public String toString() {
        return "Perecedero{" + "dias_caducar=" + dias_caducar + '}';
    }
    
}
