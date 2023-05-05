/*Realizar un programa que diga si un número introducido por teclado es par y/o divisible entre 5
 */
package EjerciciosIniciales;

import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero par/divisible entre 5 ");
        num = teclado.nextInt();
        
        int numero;
        System.out.println("Introducir numero");
        numero=teclado.nextInt();
        /*if(numero%2==0)
        if(numero%5==0)
        System.out.println("El numero "+numero+" es par y divisible por 5");
        else
        System.out.println("El numero "+numero+" es par y no divisible por 5");
        else
        System.out.println("El numero "+numero+" no es par");*/
        
        if(numero%2==0)
           System.out.print("El numero "+numero+" es par ");
        else
           System.out.print("El numero "+numero+" no es par ");
      
        if(numero%5==0)
           System.out.println("y divisible por 5");
        else
           System.out.println("y no divisible por 5");
         
    }
}
