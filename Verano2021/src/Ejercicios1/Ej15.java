/*Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el
exponente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si
introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24, 25
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej15 {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double total = 1;
        double base;
        int exponente;
         System.out.print("Introduce la base ");
     base = teclado.nextDouble();
        System.out.print("Introduce el exponente ");
    exponente = teclado.nextInt();
    for(int i = 0; i < exponente; i++){
      total = base * total;
      System.out.println(base+ " elevado a "+ exponente+" = "+total+".");
    }
    }
}
