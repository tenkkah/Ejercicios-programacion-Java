/*Realizar un programa que calcule la media de tres notas.
 */
package EjerciciosIniciales;

import java.util.Scanner;

public class Ejercicio6 {
     public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int num, num2, num3,resultado;
        
         System.out.println("Introduce un numero ");
         num = teclado.nextInt();
         System.out.println("Introduce un numero 2 ");
         num2 = teclado.nextInt();
         System.out.println("Introduce un numero ");
         num3 = teclado.nextInt();
         
         resultado = (num+num2+num3)/3;
         System.out.println("L media es "+resultado);
      
}
}