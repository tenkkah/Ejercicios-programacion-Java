
package EjercicioTeoria;


public class Inmueble {
    private String direccion;
    private int mc;
    private double preciobase;
    private boolean nuevo;

    public Inmueble(String direccion, int mc, double preciobase, boolean nuevo) {
        this.direccion = direccion;
        this.mc = mc;
        this.preciobase = preciobase;
        this.nuevo = nuevo;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getMc() {
        return mc;
    }

    public double getPreciobase() { //Metodo precioBase el cual no se puede modificar con el getter, solo se muestra
        return preciobase;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setPreciobase(double preciobase) { //Los setter te van a permitir cambiarles el valor
        this.preciobase = preciobase;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + direccion + ", mc=" + mc + ", preciobase=" + preciobase + ", nuevo=" + nuevo + '}';
    }
    
    public double Precio(int anios) {
        double p;
        if(anios<15)
            p=preciobase*99/100;
        else
            p=preciobase*98/100;
        return p;
    }
}
