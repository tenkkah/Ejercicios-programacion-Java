/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i = 0;
        System.out.println("Introducir la tabla del 5");
        num = teclado.nextInt();
        do {
      if (i%5==0){
        System.out.println(i+" ");
      }
      i++;
    } while (i<100);
    }
}
