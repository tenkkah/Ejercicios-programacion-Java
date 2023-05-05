
package Ejercicio2_POO_y_Herencia;


public class Tipo4 extends Articulo {
    private final double IVA=0.04; //La palabra final lo que viene siguiente es un valor constante

    public Tipo4(String nombre, double precio) { //Se inserta constructor
        super(nombre, precio);
    }
    
     
    public double getParteIVA(){
        return super.getPrecio()*IVA;
    }
    
    @Override //Se copia del articulo y se cambia el return
    public double getPrecio() {
        return super.getPrecio()+getParteIVA();
    }
}
