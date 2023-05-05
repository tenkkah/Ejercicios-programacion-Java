/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Ej2;


public class Perros extends Animales{
    private String color;

    public Perros(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void sonido(){
           System.out.println("Guauuu");
       }
    
    @Override
    public String toString() {
        return "Perros{" + super.toString() + "color=" + color + '}';
    }

  
    
    
}
