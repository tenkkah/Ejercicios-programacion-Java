/*Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
potencia.
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej14 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int base, exponente, potencia=1; //Siempre que se tenga producto se inicia a 1
        
        System.out.print("Introduce la base ");
         base = teclado.nextInt();
    System.out.print("Introduce el exponente ");
         exponente = teclado.nextInt();
   
    for(int i = 1; i <= exponente; i++){
      potencia=potencia*base;
    }
    System.out.print(base+ " elevado a "+ exponente+" = "+potencia+".");
    }
}
