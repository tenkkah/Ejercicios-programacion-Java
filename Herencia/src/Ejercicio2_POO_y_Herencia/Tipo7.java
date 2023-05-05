
package Ejercicio2_POO_y_Herencia;


public class Tipo7 extends Articulo {
    private final double IVA=0.07;

    public Tipo7(String nombre, double precio) { //Se inserta constructor
        super(nombre, precio);
    }
    
     
    public double getParteIVA(){
        return super.getPrecio()*IVA;
    }
    
     @Override
    public double getPrecio() {
        return super.getPrecio()+getParteIVA();
    }
}
