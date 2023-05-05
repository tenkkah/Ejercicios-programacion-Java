/*Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i=320;
        do {
      System.out.print(i+" ");
      i=i-20;
            }
        while (i>=160);
        
    }
}
