/*Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y
cuántos son negativos.
 */
package Ejercicios1;

import java.util.Scanner;

public class Ej13 {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
            int numero,contadorposi=0,contadornega=0;
        
        
  
    for (int i=1;i<=10;i++){
         System.out.print("Introduce un número ");
         numero=teclado.nextInt();
      if (numero<0)
        contadornega++;
       else contadorposi++;
      }
    System.out.println("De la lista de numeros hay "+contadorposi+" numeros positivos y "+contadornega+" numeros negativos");
    }
}
