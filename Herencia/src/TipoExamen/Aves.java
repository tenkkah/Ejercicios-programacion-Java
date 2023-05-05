
package Tipoexamen;

public abstract class Aves extends Animal {
    
    public Aves(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public abstract String queAnimalSoy();
    
    @Override
    public abstract String habloAsi();
}
