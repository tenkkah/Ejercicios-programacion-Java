/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 */
package Ejercicios1;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        System.out.println("Introducir la tabla de multiplicar del 5");
            numero=teclado.nextInt();
        for(int i=0; i<=100; i++) {      
           System.out.println(numero+" * "+i+" = "+(numero*i));
        }
    }
}
