/*Escribe un programa que diga si un número introducido por teclado es o no primo. Un
número primo es aquel que sólo es divisible entre él mismo y la unidad.
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej16 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int numero,contador=0,i=2;    
            System.out.print("Introduce el numero ");
             numero = teclado.nextInt();
             
             while(i<numero && numero%i!=0)
                 i++;
             if(i==numero)
                 System.out.println("El numero "+numero+" es primo");
             else
                 System.out.println("El numero "+numero+" no es primo");
             /* for (int i = 2; i < numero; i++){
             if (numero%i==0)
             contador++;
             }
             if(contador==0)
             System.out.println("El numero "+numero+" es primo");
             else
             System.out.println("El numero "+numero+" no es primo");   */  
      }              
}
