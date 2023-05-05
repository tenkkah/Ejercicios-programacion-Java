/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2Ej2;

import java.util.ArrayList;
import java.util.Scanner;


public class OperacionesAnimales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Animales> lista = new ArrayList<>(); //<Animales> para que se defina solo objetos de la clase Animales
        
       Animales an;
       Gatos g;
       Perros p;
       
     
       lista.add(new Perros("Perro1",3,"Marron"));
       lista.add(new Perros("Perro2",5,"Beis"));
       lista.add(new Perros("Perro3",8,"Gris"));
       lista.add(new Perros("Perro4",1,"Blanco"));
       lista.add(new Perros("Perro5",2,"Negro"));
     
        
       lista.add(new Gatos("Gato1",1,"Persa"));
       lista.add(new Gatos("Gato2",3,"bengala"));
       lista.add(new Gatos("Gato3",5,"Ragdoll"));
       lista.add(new Gatos("Gato4",7,"Siames"));
       lista.add(new Gatos("Gato5",9,"Coon"));
       
       for(int i = 0; i<lista.size(); i ++){
           System.out.println(lista.get(i).toString());
       }
    }
}
