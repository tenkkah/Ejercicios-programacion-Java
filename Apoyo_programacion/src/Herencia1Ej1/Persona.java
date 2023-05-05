/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia1Ej1;

/**
 *
 * @author Aitor
 */
public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int anoNacimiento;
    
    //costructor

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int anoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anoNacimiento = anoNacimiento;
    }
    public void imprime(){
        System.out.println("Datos Personales: "+nombre+" "+apellidos+" "+anoNacimiento+"");
    }
}


