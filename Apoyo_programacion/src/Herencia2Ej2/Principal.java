/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia2Ej2;


public class Principal {
    public static void main(String[] args) {
        
        //creo el almacen
        Almacen a = new Almacen();
        
        //Anado bebidas
        Bebida bebida1 = new AguaMineral("manantial 1", 1.5, 5,"bezoya");
        a.agregarBebida(bebida1);
        Bebida bebida2 = new BebidaAzucarada(0.2, true, 1.5, 10, "Coca Cola");
        a.agregarBebida(bebida2);
        Bebida bebida3 = new AguaMineral("manantial 2", 2.75, 5,"Boss");
        a.agregarBebida(bebida3);
        Bebida bebida4 = new BebidaAzucarada(0.5, false, 1, 8, "Fanta");
        a.agregarBebida(bebida4); 
          
        //Mostrar las bebidas
        a.mostrarBebidas();
        
        //Calculo el precio de todas las bebidas
        System.out.println("El precio de todas las bebidas es " + a.calcularPrecioBebidas());
        
        //Elimino una bebida en concreto
        a.eliminarBebida(4);
        
        System.out.println("---------------------------------------------------------------------");
            
        //Muestro de nuevo las bebidas
        a.mostrarBebidas();
        
        System.out.println("El precio de todas las bebidas es " + a.calcularPrecioBebidas());
        System.out.println("Precio de todas las bebidas de la marca bezoya "+a.calcularPrecioBebidas("bezoya"));
        System.out.println("Calcular el precio de la columna 0"+a.calcularPrecioBebidas(1));
    }
}
