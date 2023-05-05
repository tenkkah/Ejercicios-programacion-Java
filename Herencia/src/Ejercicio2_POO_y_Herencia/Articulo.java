/*Se diesea crear una aplicación para calcular el ipo die IIA que dieben paear los artculos die un comercio. El ipo diel IIA puedie ser 
diel 4%, diel 7% o diel 16%, diependiiendio diel ipo die artculo.Se diefine una clase Ariculo que tendirá como atributos el nombre diel 
mismo y el precio correspondiiente ssin IIA)7 los atributos serán privadios. Sólo tendirá un constructor que reciba el nombre diel artculo
y su precio. Asimismo, tendirálos métodios necesarios para podier modiificar y accedier al precio y solo podier accedier al nombre sno se podirá modiificar).*/
package Ejercicio2_POO_y_Herencia;


public class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }   
}
