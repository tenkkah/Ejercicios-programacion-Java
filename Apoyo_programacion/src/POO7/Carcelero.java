
package POO7;


public class Carcelero {
    
    //atributos
    private String nombre;
    private Celda[] celdas;
    
    
    //constructor

    public Carcelero(String nombre, Celda[] celdas) {
        super();
        this.nombre = nombre;
        this.celdas = celdas;
    }
    
    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Celda[] getCeldas() {
        return celdas;
    }

    public void setCeldas(Celda[] celdas) {
        this.celdas = celdas;
    }
    
    
}
