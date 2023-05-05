/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, i = 0;
        System.out.println("Introducir la tabla del 5");
        num = teclado.nextInt();
      
        
        while(i<100){
            i++;
        }
        System.out.println(num+" * "+i+" = "+(num*i));
    }
}
