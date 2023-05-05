/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Ej2;


public class Gatos extends Animales{
    private String raza;

    public Gatos(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void sonido(){
        System.out.println("Miaaau");
    }

    @Override
    public String toString() {
        return "Gatos{" +super.toString() + "raza=" + raza + '}';
    }
    
   
}
