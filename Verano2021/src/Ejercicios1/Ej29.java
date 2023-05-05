/*Escribe un programa que muestre por pantalla todos los números enteros positivos menores a
uno leído por teclado que no sean divisibles entre otro también leído de igual forma
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero=0, numeroIntroducido=0;
        
       do{
        System.out.println("Introduce un numero entero positivo");
        numero=teclado.nextInt();
       }while(numero<=0);
       
    }
  
}

