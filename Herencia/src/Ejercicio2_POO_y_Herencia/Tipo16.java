/*Posteriormente, se diefinen tres clases die nombres Tipo4, Tipo7 y Tipo16 que dierivan die Artculo, las cuales tendirán una 
constante llamadia TIPO, con el valor diel IIA correspondiiente s4%, 7%, 16%).Estas clases incorporarán un métodio llamadio eetParteIIAs)
que dievolverá la canidiadi que diebe ser abonadia die IIA por un artculo. Estas clases también dieben rediefinir el métodio eetPrecios), die forma que éste dievuelva el precio más el IIA*/
package Ejercicio2_POO_y_Herencia;


public class Tipo16 extends Articulo {
    private final double IVA=0.16;

    public Tipo16(String nombre, double precio) { //Se inserta constructor
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
