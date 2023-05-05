
package Hoja1.Ej2;


public class Personas {
    private String nombre, apellido, nif, estadoCivil;

    public Personas(String nombre, String apellido, String nif, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.estadoCivil = estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() { //obtengo el estado civil
        return estadoCivil;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", estadoCivil=" + estadoCivil + '}';
    }

    /*public String datos() {
    return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido+ '}';
    }*/

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    
}



