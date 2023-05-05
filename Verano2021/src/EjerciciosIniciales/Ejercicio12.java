/*Escribe un programa que diga cuál es la primera cifra de un 
 número entero introducido por teclado. Se permiten números 
 de hasta 5 cifras.
 */
package EjerciciosIniciales;

import java.util.Scanner;


public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int numero;
    
    do{
        System.out.println("Introducir numero"); 
        numero=teclado.nextInt();
    }while(numero<0 || numero>99999);

    /*if(numero<10)
    System.out.println("El primer digito del numero es "+numero);
    else if(numero<99)
    System.out.println("El primer digito del numero es "+(numero/10));
    else if(numero<999)
    System.out.println("El primer digito del numero es "+(numero/100));
    else if(numero<9999)
    System.out.println("El primer digito del numero es "+(numero/1000));
    else  System.out.println("El primer digito del numero es "+(numero/10000));*/
    int auxiliar=numero;
    while(numero>9){
      numero=numero/10;  
    }
      System.out.println("El primer digito del numero "+auxiliar+" es "+numero); 
  }
}