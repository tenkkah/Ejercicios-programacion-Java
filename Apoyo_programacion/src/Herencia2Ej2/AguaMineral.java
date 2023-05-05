/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia2Ej2;


public class AguaMineral extends Bebida{
    private String manatial;

    public AguaMineral(String manatial, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.manatial = manatial;
    }

    public String getManatial() {
        return manatial;
    }

    public void setManatial(String manatial) {
        this.manatial = manatial;
    }

    @Override
    public String toString() {
        return "AguaMineral{" + "manatial=" + manatial + '}';
    }
    
    
}
