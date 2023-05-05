
package EjercicioTeoria;

public class Piso extends Inmueble {
    private int altura;

    public Piso(int altura, String direccion, int mc, double preciobase, boolean nuevo) {
        super(direccion, mc, preciobase, nuevo); //Envio los valores de la clase inmueble
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
    
    public double PrecioTotal(int anios){
        double precio=0;
        precio=Precio(anios);
        if(altura>=3)
            precio=precio*1.03;
        return precio;
    }

    
    public String toString(int anios) {
        return super.toString()+"Piso{" + "altura=" + altura + " el precio final es "+PrecioTotal(anios)+'}';
    }
    
}
