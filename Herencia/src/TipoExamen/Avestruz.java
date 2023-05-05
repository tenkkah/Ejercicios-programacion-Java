
package Tipoexamen;

public abstract class Avestruz extends Aves{
   private final int velocidad;

    public Avestruz(int velocidad, String nombre, int edad) {
        super(nombre, edad);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+" Avestruz{" + "velocidad=" + velocidad + '}';
    }

    public String queAnimalSoy() {
       return "Soy un Avestruz";
    }

    public String habloAsi() {
       return "Griu Griu";
    }
   
   
}
