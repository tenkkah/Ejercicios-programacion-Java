/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia2Ej1;


public class Principal {
    public static void main(String[] args) {
        
        //Creo un array de productos
        Producto[] productos = new Producto[3];
        
        //Se crean los elementos
        productos[0] = new Producto("producto 1", 10);
        productos[1] = new Perecedero(1,"producto 2", 20);
        productos[2] = new NoPerecedero("tipo 1","producto 3", 5);
        
        //Calcular el precio 
        double total = 0;
         for(int i=0;i<productos.length;i++){
            total += productos[i].calcular(5); //Polimorfismo        
            }      
         
         System.out.println("El total es " + total);
    }
}
