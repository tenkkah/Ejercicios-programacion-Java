
package EjercicioTeoria;

public class Local extends Inmueble {
    private int nventanas;

    public Local(int nventanas, String direccion, int mc, double preciobase, boolean nuevo) {
        super(direccion, mc, preciobase, nuevo);
        this.nventanas = nventanas;
    }

    public int getNventanas() {
        return nventanas;
    }

    public void setNventanas(int nventanas) {
        this.nventanas = nventanas;
    }
    
    public double PrecioTotal(int anios){
        double precio=Precio(anios);
        if(getMc()>50)
             precio=precio*1.01;
        if(nventanas<2)
            precio=precio-98/100;
        else if(nventanas>4)
            precio=precio*1.02;
            
        return precio;
    }

    
    public String toString(int anios) {
        return super.toString()+"Local{" + "nventanas=" + nventanas +" el precio final es "+PrecioTotal(anios)+ '}'; //super to string es para llamar al metodo to string y que me lo escriba.
    }
    
}

