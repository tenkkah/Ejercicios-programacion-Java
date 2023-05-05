/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Ej1;


public class Local extends Llamada{
    
    private final double precio = 0.15; //final se podria poner ya que no se modifica
     
    public Local(String nOriegn, String nDestino, int duracion) {
        super(nOriegn, nDestino, duracion);
    }

    @Override
    public String toString() {
        return "Local{" + "precio=" + precio + '}';
    }
    
    
    public double Coste(){
        return getDuracion()*precio;
    }
    
}
