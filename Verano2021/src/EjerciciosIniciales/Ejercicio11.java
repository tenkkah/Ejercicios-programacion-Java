/*Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado
 */
package EjerciciosIniciales;

import java.util.Scanner;


public class Ejercicio11 {
   public static void main(String[] args) {
   Scanner teclado=new Scanner(System.in);
   int numero;
   
   System.out.println("Introducir un numero");
   numero=teclado.nextInt();
   
   System.out.println("El ultimo digito del numero es "+(numero%10));
  }
}