
package tipoexamen;

public class Avestruz extends Aves{
   private int velocidad;

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

    @Override
    public String queAnimalSoy() {
       return "Soy un Avestruz";
    }

    @Override
    public String habloAsi() {
       return "Griu Griu";
    }
   
   
}
