
package Ejercicio1;

public class ComponentedeCoche {
    private String descripcion;
    private int peso;
    private double coste;

    public ComponentedeCoche(String descripcion, int peso, double coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "ComponentedeCoche{" + "descripcion=" + descripcion + ", peso=" + peso + ", coste=" + coste + '}';
    }
    
    
}
