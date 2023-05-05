
package Tipoexamen;

public abstract class Perro extends Mamiferos{
    private String color;

    public Perro(String color, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString()+" Perro{" + "color=" + color + '}';
    }

    public String queAnimalSoy() {
       return "Soy un "+getClass().getSimpleName();
    }

    public String habloAsi() {
       return "Guau Guau";  
    }
    
    
}
