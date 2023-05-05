/*.Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
número leído por teclado
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
         int numeroIntroducido, cuenta=0, suma=0;
        System.out.println("Introduzca un número entero mayor que 1:"); 
    numeroIntroducido =  teclado.nextInt();
   
    for ( int i =  1 ; i < numeroIntroducido; i ++ ) {
      if ((i %  3 ) ==  0 ) {
        System.out.println(i+" ");
        cuenta ++ ;
        suma++;
      }
    }
        System.out.println("Desde 1 hasta "+numeroIntroducido+ "hay" +cuenta);
        System.out.println(" múltiplos de 3 y suman" +suma);
  }
}
