/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 */
package Ejercicios1;

import java.util.Scanner;

public class Ej9 {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
         int numeroDeDigitos=1, numero,numeroIntroducido;

    System.out.println("Introduzca un número entero y le diré cuántos dígitos tiene:");
    numeroIntroducido = teclado.nextInt();
    
    numero = numeroIntroducido;
    
    while (numero > 10) {
      numero /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos.");
    }
}
