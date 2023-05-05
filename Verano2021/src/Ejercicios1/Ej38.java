/*Hacer un progrmama que pida un numero entero positivo por teclado y muestre a 
continuacion los 5 numeros consecutivos a partir del numero introducido. 
Al lado de cada numero se debe indicar si se trata de un primo o no.
Ejemplo:Introduzca un numero entero positivo:17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo
 */
package Ejercicios1;

import java.util.Scanner;
public class Ej38 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
         int i, numero;
        System.out.println("Introduzca un numero entero positivo : ");
    for (numero=2; numero<=100;numero++) {
      i=2;
      while(i<numero && numero%i!=0)
        i++;
      if(i==numero)
        System.out.print(numero+" ");
      }  
    }
 
}

