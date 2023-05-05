/*Muestra la tabla de multiplicar de un número introducido por teclado
 */
package Ejercicios1;

import java.util.Scanner;

public class Ej8 {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero, i;
        System.out.println("Introduce un numero");
        numero=teclado.nextInt();
        i=1;
        while(i<=10){
            System.out.println(numero+" * "+i+" = "+(numero*i));
            i++;
    }
  }
}
