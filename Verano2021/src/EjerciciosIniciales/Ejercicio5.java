/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIniciales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
    DecimalFormat formateador=new DecimalFormat("#.##");
    final double g=9.81;
    double h,t;
    do{
      System.out.println("Introducir altura");
      h=teclado.nextDouble();
    }while(h<0);
    
    t=Math.sqrt(2*h*g);
    
    System.out.println("El objeto tarda en caer "+formateador.format(t)+" segundos");
    
    
  }
}

    
            

