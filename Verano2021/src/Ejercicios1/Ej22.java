/*Escribe un programa que permita ir introduciendo una serie indeterminada de números
mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total
acumulado, el contador de los números introducidos y la media.

 */
package Ejercicios1;

import java.util.Scanner;
public class Ej22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numeroIntroducido, suma=0, numeroDeElementos=0;
        
        
        
        do{
            System.out.println("Introduzca números, el programa terminara hasta que la suma total de los numeros sea 10000");
            numeroIntroducido=teclado.nextInt();
            suma=numeroIntroducido;
            numeroDeElementos++;
        }while(suma<=10000);
        
        System.out.println(" Ha introducido un total de "+numeroDeElementos+ "números");
        System.out.println("La suma total es "+suma+ " . ");
        System.out.println("La media es "+suma/numeroDeElementos);
    }
}
