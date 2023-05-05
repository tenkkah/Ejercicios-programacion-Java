
package POO5;

public class Persona {
    private boolean vigila;
    private String nombre;
    
    //constructor

    public Persona( String nombre) {
        this.vigila = false;
        this.nombre = nombre;
    }
    
    
    //metodos
    public void oyeMaullido(Gato minino){
        this.vigila = true;
        System.out.println(this.nombre + "Toma zapato!");
        minino.recibeZapato();
        this.vigila = false;
    }
    
}
