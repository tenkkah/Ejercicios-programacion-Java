package Tipoexamen;

public abstract class Animal implements Informacion {
  private String nombre;
  private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}

