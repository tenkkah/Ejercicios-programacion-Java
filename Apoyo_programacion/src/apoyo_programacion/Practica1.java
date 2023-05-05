/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoyo_programacion;

import java.util.Scanner;


public class Practica1 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, contra;
        System.out.println("Introduce el nombre Pepe");
        nombre = teclado.nextLine();
        System.out.println("Introduce la contraseña correcta");
        contra = teclado.nextLine();
        
        if(nombre.equals("Pepe") && contra.equals("1234")){ 
            System.out.println("Has entrado al sistema");
        }else{
            System.out.println("Entrada fallida");
        }
    }
    
}
