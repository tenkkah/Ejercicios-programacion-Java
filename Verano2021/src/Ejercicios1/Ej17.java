/*Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).
 */
package Ejercicios1;

import java.util.Scanner;

public class Ej17 {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
         int num = teclado.nextInt();
    if (num < 0){
      System.out.println("Tiene que ser positivo");
    } else {
      System.out.println("La suma de siguientes 100 números a "+num+" son: ");
      int suma = 0;
      for(int i = num; i < (num+100); i++){
        suma += i;
      }
      System.out.println(suma);
    }
    }
}
