
package POO7;


public class Prisionero {
    
    //atributos
    private String nombre;
    private double altura;
    private int condena;
    private Celda celda;

    public Prisionero(String nombre, double altura, int condena, Celda celda) {
        super();
        this.nombre = nombre;
        this.altura = altura;
        this.condena = condena;
        this.celda = celda;
    }
  
    public Prisionero(String nombre){
        super();
        this.nombre = nombre;
       /*this.altura = 0;
        this.condena = 0;
        this.celda = null;*/
    }
    
    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCondena() {
        return condena;
    }

    public void setCondena(int condena) {
        this.condena = condena;
    }

    public Celda getCelda() {
        return celda;
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }

    @Override
    public String toString() {
        return "Prisionero{" + "nombre=" + nombre + ", altura=" + altura + ", condena=" + condena + ", celda=" + celda + '}';
    }
    
    
    
}
