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
public class Gato extends Mamiferos {
   private String raza;

    public Gato(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return super.toString()+" Gato{" + "raza=" + raza + '}';
    }

    @Override
    public String queAnimalSoy() {
        return "Soy un "+getClass().getSimpleName();
    }

    @Override
    public String habloAsi() {
        return "Miau Miau";
    }
   
   
}