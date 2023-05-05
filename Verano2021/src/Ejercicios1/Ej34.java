/*Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente
manera: primer dígito del primer número, primer dígito del segundo número, segundo dígito
del primer número, segundo dígito del segundo número, tercer dígito del primer número…
Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
 Ejemplo: Por favor, introduzca un número: 9402
 Introduzca otro número: 6782
 El número formado por los dígitos pares es 640822
 El número formado por los dígitos impares es 97
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej34 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        long num1, num2;
        
        System.out.println("Por favor, introduzca un numero");
        num1=teclado.nextLong();
        System.out.println("Introduzca otro número");
        num2=teclado.nextLong();
        
      
                   
    }
}
