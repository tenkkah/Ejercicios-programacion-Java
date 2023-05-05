/*Escribe un programa que obtenga los números enteros comprendidos entre dos números
introducidos por teclado y validados como distintos, el programa debe empezar por el menor
de los enteros introducidos e ir incrementando de 7 en 7.
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej18 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número: ");
    int num1 = teclado.nextInt();
    System.out.println("Introduce otro número diferente:");
    int num2 = teclado.nextInt();
    if (num1 == num2){
      System.out.println("¡ D I F E R E N T E S !");
    } else {
      int menor = 0;
      int mayor = 0;
      int i = 0;
      if (num1 < num2){
        menor = num1;
        mayor = num2;
      } else {
        menor = num2;
        mayor = num1;
      }
      for(i = 0; menor < mayor; i++){
        menor+= 7;
      }
      System.out.println("El número 7 cabe "+(i-1)+" veces entre el "+num1+" y el "+num2);
    }
    }
}
