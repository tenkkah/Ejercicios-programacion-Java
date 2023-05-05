/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExamen;

/**
 *
 * @author Aitor
 */
public class Perro extends Mamiferos{
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

    @Override
    public String queAnimalSoy() {
       return "Soy un "+getClass().getSimpleName();
    }

    @Override
    public String habloAsi() {
       return "Guau Guau";  
    }
    
    
}
