/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO5;

public class Gato {
    //atributos
    private boolean vigila;
    private String nombre;
    
    //constructor

    public Gato(String nombre) {
        this.vigila = vigila;
        this.nombre = nombre;
    }
    
    public void Maulla(Persona individuo){
        System.out.println(this.nombre + "Miau!");
        individuo.oyeMaullido(this);
    }
    
    public void recibeZapato(){
        System.out.println("Clock!");
        this.vigila = false;
    }
}
